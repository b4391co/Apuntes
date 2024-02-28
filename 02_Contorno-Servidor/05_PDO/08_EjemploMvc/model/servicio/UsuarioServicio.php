<?php


class UsuarioServicio implements IUsuarioServicio
{

    private IUsuarioRepository $repository;

    public function __construct()
    {
        $this->repository = new UsuarioRepository();
    }

    public function listar(){
        return $this->repository->getUsuarios();
    }
}

?>