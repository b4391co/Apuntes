class Forma {
    constructor() {
        if (this.constructor === Forma)
        throw new Error("La clase Forma es abstracto");
    }
    dibujar() {
        throw new Error(
        "Este es un método abstracto y se debe sobreescribir en las subclases"
        );
    };
    
}

function borrar() {
    let t = document.getElementById("creado");
    if (t != null)
        t.remove();
}
class Triangulo extends Forma{
    dibujar() {
        borrar();
        let div = document.getElementById("mostrar");
        let figura = document.createElement("div");
        figura.id = "creado";
        figura.className = "triangulo";
        figura.style.borderLeft = "150px solid transparent"; // Aumenta el tamaño del triángulo
        figura.style.borderRight = "150px solid transparent"; // Aumenta el tamaño del triángulo
        figura.style.borderBottom = "300px solid black";
        div.appendChild(figura);
    }
}

class Cuadrado extends Forma{
    dibujar() {
        borrar();
        let div = document.getElementById("mostrar");
        let figura = document.createElement("div");
        figura.id = "creado";
        figura.className = "cuadrado";
        figura.style.width = "300";
        figura.style.height = "300";
        figura.style.backgroundColor = "black";
        div.appendChild(figura);
    }
}
class Circulo extends Forma{
    dibujar() {
        borrar();
        let div = document.getElementById("mostrar");
        let figura = document.createElement("div");
        figura.id = "creado";
        figura.style.width = "300";
        figura.style.height = "300";
        figura.className = "circulo";
        figura.style.backgroundColor = "black";
        div.appendChild(figura);
    }
}

window.addEventListener("DOMContentLoaded", () => {
    crearFormas();
})

function crearFormas() {
    document.getElementById("triangulo").addEventListener("click", () => {
        let triangulo = new Triangulo();
        triangulo.dibujar();
    })
    document.getElementById("circulo").addEventListener("click", () => {
        let circulo = new Circulo();
        circulo.dibujar();
    })
    document.getElementById("cuadrado").addEventListener("click", () => {
        let cuadrado = new Cuadrado();
        cuadrado.dibujar();
    })
}