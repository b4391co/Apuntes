<?php
class Circulo extends Figura
{
    public const PI = 3.1416;
    private float $radio;

    private Point $centro;

    public function __construct(string $nombre,float $radio, Point $centro){
        parent::__construct($nombre);
        $this->radio = $radio;
        $this->centro = $centro;
    }
	

    public function calcularArea()
    {
        parent::calcularArea();
        return pow($this->radio, 2) * self::PI;
    }
}