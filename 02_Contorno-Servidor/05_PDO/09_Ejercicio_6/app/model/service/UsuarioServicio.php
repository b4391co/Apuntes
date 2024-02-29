<?php

class UsuarioServicio
{

    const USER_DOES_NOT_EXIST = "No existe usuario";
    const PWD_INCORRECT = "La contraseña no es correcta";

    private IUsuarioRepository $usuarioRepository;
    private IRolRepository $rolRepository;

    public function __construct(IUsuarioRepository $usuarioRepository, IRolRepository $rolRepository){
        $this->usuarioRepository = $usuarioRepository;
        $this->rolRepository = $rolRepository;
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

    public function login(string $user, string $pwd, $rolId): ?Usuario
    {
        $usuario = $this->usuarioRepository->findUsuarioByEmail($user);
        if(password_verify($pwd, $usuario->getPwdhash())) {
            $rolesUsuario = $this->rolRepository->findRolesByUserId($usuario->getId());
            if ($this->isUserInRole($usuario,$rolId))
                $usuario->setRoles($rolesUsuario);
            else
                return null;
        }
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