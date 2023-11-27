package com.example.juego.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class controller {

    int numConsultas = 0;
    int score = 0;
    int numAciertos = 0;
    int numFallos = 0;

    @GetMapping("/")
    public boolean checkAPI() {
        numConsultas++;
        return true;
    }

    @GetMapping("/pista1")
    public String pista1() {
        return "Aparece en los Simpsons";
    }

    @GetMapping("/pista2")
    public String pista2() {
        return "Es un niño";
    }

    @GetMapping("/pista3")
    public String pista3() {
        return "Es de la familia Simpson";
    }

    @GetMapping("/resolver/{name}")
    public boolean resolver(@PathVariable String name) {
        if (name.equalsIgnoreCase("Bart") || name.equalsIgnoreCase("Bart Simpson")) {
            numAciertos++;
            return true;
        }
        return false;
    }

    @GetMapping("/statistics") 
    public String statistics() {
        return "consultas: " + numConsultas + "\n Record: " + score + "\n fallos: " + numFallos;
    }

    @GetMapping("/score")
    public int score() {
        return score;
    }

    @GetMapping("/score/61860/{newScore}")
    public void nuevaPuntiacion(@PathVariable int newScore) {
        score = newScore;
    }
}
