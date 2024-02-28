<?php

class UsuarioRepository extends BaseRepository implements IUsuarioRepository
{
    private string $table_name;
    private string $pk_name;
    private string $class_name;
    private string $default_order_column = "email";
    public function __construct(string $table_name, string $pk_name, string $class_name){
        $this->table_name = "usuario";
        $this->pk_name = "id";
        $this->class_name = "Usuario";
        $this->default_order_column = "email";
    }
	
    function findUsuarioByEmail($email): Usuario {
        $consulta = "SELECT * FROM usuario where email like ?;";

        $pdostmt = $this->conn->prepare($consulta);
        $pdostmt->bindValue(1, $email);
        $pdostmt->execute();

        $usuario = $pdostmt->fetch(PDO::FETCH_OBJ);

        if ($usuario) {
            return $usuario;
        } else{
            return null;
        }
    }
    function create($object){
        return null;
    }
    function update($object): bool{
        return false;
    }

    function getUsuarios(): array {
        $consulta = "SELECT * FROM usuario";

        $pdostmt = $this->conn->prepare($consulta);
        $pdostmt->execute();

        return $pdostmt->fetch(PDO::FETCH_OBJ);
    }
}