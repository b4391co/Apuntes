<?php
class UsuarioRepository extends BaseRepository implements IUsuarioRepository
{
    private string $table_name;
    private string $pk_name;
    private string $class_name;
    private string $default_order_column = "email";

    function findUsuarioByEmail($email): Usuario {
        
    }
    function create($object){
        $usuario = new Usuario();
    }
    function update($object): bool{
        
    }
}