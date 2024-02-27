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
        return $this->usuarioRepository->getUsuarios();
    }

    public function login(string $user, string $pwd, $rolId): ?Usuario
    {
        //TODO
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