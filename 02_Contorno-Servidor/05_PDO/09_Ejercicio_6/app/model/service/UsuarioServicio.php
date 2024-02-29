<?php

class UsuarioServicio
{

    const USER_DOES_NOT_EXIST = "No existe usuario";
    const PWD_INCORRECT = "La contraseña no es correcta";

    private IUsuarioRepository $usuarioRepository;
    private IRolRepository $rolRepository;

    public function __construct()     {
        $this->usuarioRepository = new UsuarioRepository();
        $this->rolRepository = new RolRepository();
    }
    

    public function getUsuarios(): array
    {
        $usuarios = $this->usuarioRepository->findAll();

        foreach ($usuarios as $usuario) {
            $roles = $this->rolRepository->findRolesByUserId($usuario->getId());
            $usuario->setRoles($roles);
        }
        return $usuarios;
    }

    public function login(string $usuario, string $pwd, $rolId): ?Usuario {
        $usuario = $this->usuarioRepository->findUsuarioByEmail($usuario);
        if(password_verify($pwd, $usuario->getPwdhash())) {
            $roles = $this->rolRepository->findRolesByUserId($usuario->getId());
            $usuario->setRoles($roles);
            if ($rolId !== null && $this->isUserInRole($usuario, $rolId)) {
                return $usuario;
            }
        }
        return null;
    }
    

    public function getRoles(): array
    {
        $roles = $this->rolRepository->findAll();
        return $roles;
    }

    public function getRoleById(int $roleId): ?Rol
    {
        return $this->rolRepository->read($roleId);
    }

    private function isUserInRole(Usuario $usuario, int $roleId): bool
    {
        $rolesArray = $usuario->getRoles();
        foreach ($rolesArray as $rol) {
            if ($rol->getId() === $roleId) {
                return true;
            }
        }

        return false;
    }


}

?>