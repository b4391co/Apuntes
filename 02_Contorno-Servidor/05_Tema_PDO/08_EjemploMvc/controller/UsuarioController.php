<?php

class UsuarioController {
    public string $page_title;
    public string $view;
    private INotaServicio $notaServicio;

    public function __construct(string $page_title, string $view, INotaServicio $notaServicio){
        $this->page_title = $page_title;
        $this->view = $view;
        $this->notaServicio = $notaServicio;
    }
	
}