<?php

class Point
{
    private int $x;
    private int $y;

    public function __construct(int $x, int $y = 0)
    {
        $this->x = $x;
        $this->y = $y;
    }

    public function mostrarCoord(){
        echo "<p> X: " . $this->x . ", Y: " . $this->y . "</p>";
    }
}