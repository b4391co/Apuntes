<?php

class Figura {
    protected int $num_lados;
    protected string $nombre;

    public function calcularArea() {
        return $this->num_lados * $this->num_lados;
    }

    public function __construct(int $num_lados, string $nombre){
        $this->num_lados = $num_lados;
        $this->nombre = $nombre;
    }
	
}