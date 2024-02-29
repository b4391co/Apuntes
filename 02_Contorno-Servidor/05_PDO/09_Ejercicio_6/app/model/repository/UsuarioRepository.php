<?php

class UsuarioRepository extends BaseRepository implements IUsuarioRepository
{
    protected string $table_name;
    protected string $pk_name;
    protected string $class_name;
    protected string $default_order_column = "email";
    public function __construct()
    {
        parent::__construct();
        $this->table_name = "usuario";
        $this->pk_name = "id";
        $this->class_name = "Usuario";
        $this->default_order_column = "email";
    }
	
    public function findUsuarioByEmail($email): Usuario {
        $consulta = "SELECT * FROM usuario WHERE email = :email";

        $pdostmt = $this->conn->prepare($consulta);
        $pdostmt->bindParam("email", $email);
        $pdostmt->execute();

        $user = $pdostmt->fetchObject($this->class_name);
        return $user; //Checkear si falla
    }
    
    function create($object){
        return null;
    }
    function update($object): bool{
        return false;
    }
}