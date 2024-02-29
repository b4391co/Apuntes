<?php

class UsuarioController
{

    const VIEW_FOLDER = "user";

    public $page_title;
    public $view;
    private UsuarioServicio $usuarioServicio;


    public function __construct()
    {
        $this->view = self::VIEW_FOLDER . DIRECTORY_SEPARATOR . 'login';
        $this->page_title = '';
        $this->usuarioServicio = new UsuarioServicio();
    }

    /* List all notes */

    public function list()
    {

        $this->view = self::VIEW_FOLDER . DIRECTORY_SEPARATOR . 'list_user';
        $this->page_title = 'Listado de usuarios';
        return $this->usuarioServicio->getUsuarios();
    }

    public function login()
    {
        if (SessionManager::isUserLoggedIn()) {
            $this->redirectAccordingToRole();
            exit;
        }
        $this->page_title = 'Inicio de sesión';
        $this->view = self::VIEW_FOLDER . DIRECTORY_SEPARATOR . 'login';

        //b) permitir seleccionar entre los 2 roles de la aplicación: admin y user
        $app_roles = $this->usuarioServicio->getRoles();
        $loginViewData = new LoginViewData($app_roles);

        if (isset($_POST["email"]) && isset($_POST["pwd"]) && isset($_POST["rol"])){
            $email = $_POST['email'];
            $pwd = $_POST['pwd'];
            $rol = $_POST['rol'];

            $usuario = $this->usuarioServicio->login($email, $pwd, $rol);

            if ($usuario == null)
                $loginViewData->setStatus(Util::OPERATION_NOK);
            else{
                $_SESSION["user"] = $usuario;
                $_SESSION["roleId"] = $rol;
                $_SESSION["email"] = $email;
                self::redirectAccordingToRole();
            }
        }
        
        return $loginViewData;
    }
    public function logout()
    {
        SessionManager::cerrarSesion();
        $this->redirectTo("Usuario", "login");
    }



    private function redirectTo(string $controller, string $action): void
    {
        header("Location: FrontController.php?controller=$controller&action=$action");
        exit;
    }

    //En función del rol seleccionado en login, el usuario deberá ser redirigido a:
    private function redirectAccordingToRole()
    {
        $user_selected_rol = $this->usuarioServicio->getRoleById($_SESSION["roleId"]);
        if ($user_selected_rol->getName() === ADMIN_ROLE) {
            $this->redirectTo("Usuario", "list");
        } elseif ($user_selected_rol->getName() === USER_ROLE) {
            $this->redirectTo("Nota", "list");
        }
    }



}

?>