class Articulo {
    constructor(nombre, precio) {
        this._nombre = nombre;
        this._precio = precio;
    }
    get nombre() { return this._nombre; }
    set nombre(in_nombre) { this._nombre = in_nombre; }
    get precio() { return this._precio; }
    set precio(in_precio) { this._precio = in_precio; }
}

function crearArticulo(nombre, precio) {
    let articulo = new Articulo(nombre, precio);
    localStorage.setItem(articulo._nombre, JSON.stringify(articulo));
}

window.onload = iniciar;

function iniciar() {
    let botonAnhadir = document.getElementById("botonAnadir");
    let botonBorrar = document.getElementById("botonBorrar");
    let lista = document.getElementById("listaC");

    botonAnhadir.addEventListener("click", () => {
        let entrada = document.getElementById("entrada");
        console.log(entrada);
        crearArticulo(entrada.value, 0);
    })

    for (let i = 0; i < localStorage.length; i++) {
        console.log(JSON.parse(localStorage.getItem(localStorage.key(i))));
        let articulo = JSON.parse(localStorage.getItem(localStorage.key(i)));

        let ul = document.createElement("ul");
        let btnEliminar = document.createElement("button");
        btnEliminar.addEventListener("click", eliminar);
        btnEliminar.id = "btnEliminar";
        btnEliminar.appendChild(document.createTextNode("X"))
        let btnSubir = document.createElement("button");
        //btnSubir.addEventListener("click", subir);
        btnSubir.id = "btnSubir";
        btnSubir.appendChild(document.createTextNode("Subir"))
        let btnBajar = document.createElement("button");
        btnBajar.id = "btnBajar";
        btnBajar.appendChild(document.createTextNode("bajar"))
        ul.appendChild(document.createTextNode(articulo._nombre));

        ul.appendChild(btnEliminar);
        ul.appendChild(btnSubir);
        ul.appendChild(btnBajar);
        lista.appendChild(ul);
    }

    function eliminar(evt) {
        let eliminado = evt.target.parentNode.firstChild.nodeValue;
        localStorage.removeItem(eliminado);
        evt.target.parentNode.remove();
        let divEliminado = document.createElement("div");
        divEliminado.appendChild(document.createTextNode(eliminado));
        document.getElementById("listaE").append(divEliminado);
    }
}