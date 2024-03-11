<?php
session_start();
class ProductoController
{

    const VIEW_FOLDER = "producto";

    public $page_title;
    public $view;
    private ProductoServicio $productoServicio;


    public function __construct()
    {
        $this->view = self::VIEW_FOLDER . DIRECTORY_SEPARATOR . 'list';
        $this->page_title = '';
        $this->productoServicio = new ProductoServicio();

    }

    /* List all notes */

    public function list() {

        $this->view = self::VIEW_FOLDER . DIRECTORY_SEPARATOR . 'list_producto';
        $this->page_title = 'Listado de productos';
        return $this->productoServicio->list();
    }

    public function delete(){
        $this->view = self::VIEW_FOLDER . DIRECTORY_SEPARATOR . 'list_producto';
        $this->page_title = 'Listado de productos';
        $resultado =  $this->productoServicio->deleteProductById($_POST['id']);
        $_SESSION['error'] = !$resultado;
        return $this->productoServicio->list();
    }

}
?>