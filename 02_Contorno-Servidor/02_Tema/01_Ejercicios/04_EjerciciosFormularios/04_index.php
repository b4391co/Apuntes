<!DOCTYPE html>

<html>

<head>
    <meta charset="UTF-8">
    <title>Zodiac</title>
</head>

<body>

    <?php
    const CAPRICORNIO = "Capricornio";
    const ACUARIO = "Acuario";
    const PISCIS = "Piscis";
    const ARIES = "Aries";
    const TAURO = "Tauro";
    const GEMINIS = "Géminis";
    const CANCER = "Cáncer";
    const LEO = "Leo";
    const VIRGO = "Virgo";
    const LIBRA = "Libra";
    const ESCORPIO = "Escorpio";
    const SAGITARIO = "Sagitario";

    //Las claves del día de corte van incluídas. Por ejemplo: los nacidos hasta el 20/01 son capricornio
    $zodiaco = array(
        //enero  
        1 => array(
            20 => CAPRICORNIO,
            "else" => ACUARIO
        ),
        //febrero
        2 => array(
            19 => ACUARIO,
            "else" => PISCIS
        ),
        //marzo
        3 => array(
            20 => PISCIS,
            "else" => ARIES
        ),
        //abril
        4 => array(
            19 => ARIES,
            "else" => TAURO
        ),
        //mayo
        5 => array(
            20 => TAURO,
            "else" => GEMINIS
        ),
        //junio
        6 => array(
            20 => GEMINIS,
            "else" => CANCER
        ),
        //julio
        7 => array(
            22 => CANCER,
            "else" => LEO
        ),
        //agosto
        8 => array(
            22 => LEO,
            "else" => VIRGO
        ),
        //septiembre
        9 => array(
            22 => VIRGO,
            "else" => LIBRA
        ),
        //octubre
        10 => array(
            22 => LIBRA,
            "else" => ESCORPIO
        ),
        11 => array(
            24 => ESCORPIO,
            "else" => SAGITARIO
        ),
        12 => array(
            22 => SAGITARIO,
            "else" => CAPRICORNIO
        ),
    );

    $meses = array(
        "Enero" , "Febrero", "Marzo", "Abril", "Mayo", "Junio" , "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    );

    ?>
    <form method="post">

        Selecciona tu día y mes de nacimiento:
        <p>
            <label for="dia">Día:</label>
            <select name="dia" id="dia" required>
<?php
            for ($i=1; $i <= 31; $i++) {
                if ( $_POST["dia"] != $i) {
                    printf("<option value='$i'>$i</option>");
                } else{
                    printf("<option value='$i' selected>$i</option>");
                }
            }
?>
            </select>

            <label for="mes">Mes</label>
            <select name="mes" id="mes" required>
<?php
            for ($i=0; $i < count($meses); $i++) {
                if ( $_POST["mes"] == $i) {
                    printf("<option value='$i' selected>$meses[$i]</option>");
                } else{
                    printf("<option value='$i'>$meses[$i]</option>");
                }
            }
?>
            </select>
        </p>
        <p>
            <input type="submit" value="Enviar" />
        </p>

    </form>

<?php
if(isset($_POST["dia"]) && isset($_POST["mes"])){
    $dia = $_POST["dia"];
    $mes = $_POST["mes"] + 1;
    $encontrado = false;
    printf("Tu signo es : ");
        foreach ($zodiaco[$mes] as $key => $value) {
        if (!$encontrado){
            if($dia <= $key){
                printf("<b>" . $value . "</b>");
                $encontrado = true; // Para evitar el uso de break
            } 
            else if( $key == "else"){
                printf("<b>" . $value . "</b>");
            }
        }
    }
}
?>

</body>

</html>