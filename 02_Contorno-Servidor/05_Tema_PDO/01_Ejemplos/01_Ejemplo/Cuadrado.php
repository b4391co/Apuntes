<?php

class Cuadrado extends Figura{
    private float $lado;
    private Point $bottonLeft;

    public function __construct(string $nombre,int $numLados, float $lado, Point $bottonLeft){
        parent::__construct($nombre, $numLados);
        $this->lado = $lado;
        $this->bottonLeft = $bottonLeft;
    }
	
}