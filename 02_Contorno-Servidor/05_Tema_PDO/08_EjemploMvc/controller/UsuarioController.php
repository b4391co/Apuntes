<?php

class UsuarioController {
    public string $page_title;
    public string $view;
    private IUsuarioServicio $usuarioServicio;

    public function __construct(string $page_title, string $view, INotaServicio $usuarioServicio){
        $this->page_title = $page_title;
        $this->view = $view;
        $this->usuarioServicio = $usuarioServicio;
    }
	
}