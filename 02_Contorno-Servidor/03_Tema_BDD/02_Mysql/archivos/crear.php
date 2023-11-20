<!DOCTYPE html>
<html lang="es" data-bs-theme="dark">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>

    <title>Crear libro</title>
</head>

<body >
    <?php
    require_once 'conexion.php';
    require_once 'util.php';

    $pdate = null;
    $isbn = null;
    $pub_Id = null;
    //todos los autores disponibles en BD
    $authors = null;
    //los ids de los autores del libro
    $book_author_ids = null;
    $title = "";
    $exito = true;

    

    $publishers = findAllPublishers();
    $authors = findAllAuthors();

    if (isset($_POST["title"])) {
        if (isNotEmpty($_POST["title"])) {
            $title = $_POST["title"];
        }

        if (isset($_POST["isbn"]) &&  isNotEmpty($_POST["isbn"])) {
            $isbn = $_POST["isbn"];
        }

        if (isset($_POST["pdate"]) &&  isNotEmpty($_POST["pdate"])) {
            $pdate = $_POST["pdate"];
            $pdate_converted = DateTimeImmutable::createFromFormat("Y-m-d", $pdate);
            if ($pdate_converted !== false) {
                $pdate = $pdate_converted;
            }
        }

        if (isset($_POST["publisher"]) &&  isNotEmpty($_POST["publisher"])) {
            $pub_Id = $_POST["publisher"];
        }
        if (isset($_POST["author_ids"])) {
            $book_author_ids = $_POST["author_ids"];
        }

    }
    
    ?>
    <div class="container-fluid">
        <header class="mb-5">
            <div class="p-5 text-center " style="margin-top: 58px;">
                <h1 class="mb-3"> Crear libro </h1>

            </div>
        </header>
        <form class='form-control ' method="post" action="">
            <div>
                <label for="title" class="form-label col-3">Título</label>
                <input name="title" type="text" class="form-control col-9" id="title" pattern="^(?!\s*$).+" required />
            </div>
            <div>
                <label for="isbn" class="form-label col-3">ISBN</label>
                <input name="isbn" type="text" class="form-control col-9" id="isbn" pattern="^(?!\s*$).+" />
            </div>

            <div>
                <label for="pdate" class="form-label col-3">Fecha de publicación</label>
                <input name="pdate" type="date" class="form-control col-9" id="pdate" />
            </div>

            <div class='row form-group my-3'>
                <label for="publisher" class="col-form-label col-2">Editorial</label>
                <div class='col-6'>
                    <select name="publisher" id="publisher" class="form-control col-3" required>

                        <option value="" disabled>----</option>
                        <?php
                        if (count($publishers) > 0) :
                            foreach ($publishers as $publisher) :
                        ?>
                                <option value="<?= $publisher["publisher_id"] ?>"><?= $publisher["name"] ?></option>
                        <?php
                            endforeach;
                        endif;
                        ?>


                    </select>
                </div>
            </div>

            <div class="form-group row my-3">
                <label for="authors" class="col-form-label col-2">Autor</label>

                <div class="col-6">
                    <select name="author_ids[]" id="authors" class="form-control" multiple>

                    <option value="" disabled>----</option>
                    <?php
                    if (count($authors) > 0) :
                        foreach ($authors as $author) :
                    ?>
                            <option value="<?= $author["author_id"] ?>"><?= $author["nombre"]?></option>
                    <?php
                        endforeach;
                    endif;
                    ?>


                    </select>
                </div>


            </div>
            <div class="row d-flex justify-content-center">
                <button type="submit" class="btn btn-primary my-3 col-3" name="btn_crear_libro" value='crear_libro'>Crear libro</button>
            </div>

        </form>
        <a href="listado.php" class="btn btn-link mt-2">Volver</a>
        <?php if (isset($_POST["btn_crear_libro"])) : ?>
            <div class="alert alert-success" role="alert">
        <?php
                $crearLibro = crear_libro();
                if ($crearLibro){
        ?>
                El libro <b> <?= $_POST["title"]?> </b>se ha creado correctamente
        <?php
                }
        ?>
            </div>

        <?php endif;

        
        /**
         * findAllPublishers
         * Crea una consulta con PDO y obtiene todos los datos de la tabla publishers
         * @return array Array con todas las tuplas de la tabla publishers como array asociativo
         */
        function findAllPublishers(): array
        {
            $conProyecto = getConnection();

            $pdostmt = $conProyecto->prepare("SELECT * FROM publishers ORDER BY name");

            $pdostmt->execute();
            $array = $pdostmt->fetchAll(PDO::FETCH_ASSOC);

            return $array;
        }

        /**
         * Genera una consulta SQL que devuelve el id del autor junto con el nombre completo concatenado en una unica clave
         * todo ordenado alfabeticamente por apellido.
         * @return array
         */
        function findAllAuthors(): array
        {
            $conProyecto = getConnection();

            $pdostmt = $conProyecto->prepare("SELECT author_id, CONCAT(COALESCE(first_name, ' '), COALESCE(middle_name, ' '), COALESCE(last_name, ' ')) AS nombre 
            FROM authors 
            ORDER BY  last_name ");

            $pdostmt->execute();
            $array = $pdostmt->fetchAll(PDO::FETCH_ASSOC);

            return $array;
        }

        function crear_libro(): bool
        {
            $exito = false;
        
            try {
                $conProyecto = getConnection();
                //Tenemos que modificar 2 tablas
                //Comenzamos la tx
                $conProyecto->beginTransaction();

                // if(isset($_POST["title"]) || isset($_POST["isbn"]) || isset($_POST["pdate"]) || isset($_POST["authors"])){
                // }
                
                $insert = "insert into books(title, isbn, published_date, publisher_id)
                Values(:title, :isbn, :published_date, :publisher_id)";

                $insert_book_authors = "insert into book_authors(author_id, book_id ) 
                Values(:author_id, :book_id)";

                $stmt = $conProyecto->prepare($insert);
                $stmt-> bindParam(":title", $_POST["title"]);
                $stmt-> bindParam(":isbn", $_POST["isbn"]);
                $stmt-> bindParam(":published_date", $_POST["pdate"]);
                $stmt-> bindParam(":publisher_id", $_POST["publisher"]);
                $exito = $stmt->execute();


                $book_id = $conProyecto->lastInsertId();

                foreach ($_POST["author_ids"] as $author_id) {
                    $stmt_ins_book_authors = $conProyecto->prepare($insert_book_authors);
                    $stmt_ins_book_authors->bindParam(":book_id", $book_id);
                    $stmt_ins_book_authors->bindParam(":author_id", $author_id);
                    $exito = $exito && $stmt_ins_book_authors->execute();
                }
                
                if ($exito) $conProyecto->commit();
                else $conProyecto->rollBack();

                // echo "<pre>";
                // $stmt->debugDumpParams();
                // $stmt_ins_book_authors->debugDumpParams();
                // echo "</pre>";
            } catch (Exception $ex) {
                $conProyecto->rollBack();
                $exito = false;
                echo "Ocurrió un error al crear el libro con mensaje: " . $ex->getMessage();
            }
            
            //Devolvemos el resultado de la operación
            return $exito;
        }
        ?>
    </div>
</body>

</html>