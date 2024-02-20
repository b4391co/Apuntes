function iniciar() {
    document.getElementById("crear").onclick = ejecutar;
}

class Vehiculo{
    constructor(modelo, marca, precio, km) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.km = km;
    }
}

function ejecutar(evt){

    evt.preventDefault();
    var modelo = document.getElementById("modelo").value;
    var marca = document.getElementById("marca").value;
    var precio = document.getElementById("precio").value;
    var km = document.getElementById("km").value;


    
    var coche = [new Vehiculo(modelo,marca,precio,km)];

    console.log(coche);
}

window.onload = iniciar;
