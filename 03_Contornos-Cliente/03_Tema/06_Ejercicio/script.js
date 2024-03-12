window.onload = iniciar;

class Pelicula{
    constructor(titulo, director, duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }
    get titulo() {
        return this._titulo;
    }
    set titulo(in_titulo) {
        this._titulo = in_titulo;
    }

    get director() {
        return this._director;
    }
    set director(in_director) {
        this._director = in_director;
    }

    get duracion() {
        return this._duracion;
    }
    set duracion(in_duracion) {
        this._duracion = in_duracion;
    }

}

function crearPelicula(titulo, director, duracion) {
    let pelicula = new Pelicula(titulo, director, duracion);
    localStorage.setItem(pelicula._titulo, JSON.stringify(pelicula));
}

function mostrarPeliculas(form) {
    let mostarPelicula = document.createElement("div");
    for (let i = 0; i < localStorage.length; i++) {
        let ul = document.createElement("ul");
        console.log(JSON.parse(localStorage.getItem(localStorage.key(i))));
        pelicula = JSON.parse(localStorage.getItem(localStorage.key(i)));
        ul.innerHTML = `${pelicula._titulo}, ${pelicula._director}, ${pelicula._duracion} `;
        mostarPelicula.appendChild(ul);
    }
    form.appendChild(mostarPelicula);
}

function buscarPelicula(titulo) {
    for (let i = 0; i < localStorage.length; i++) {
        console.log(i);
        let pelicula = JSON.parse(localStorage.getItem(localStorage.key(i)));
        if (pelicula.titulo == titulo)
            return true;
    }
    return false;
}

function iniciar() {
    let form = document.getElementById("formpeliculas");
    let titulo = document.getElementById("addTitulo");
    let director = document.getElementById("addDirector");
    let duracion = document.getElementById("addDuracion");
    
    form.addEventListener("submit", (e) => {
        e.preventDefault();
        crearPelicula(titulo.value, director.value, duracion.value);
        console.log("pelicula creada");
    })

    mostrarPeliculas(form);

    document.getElementById("formborrarpeliculas").addEventListener("submit", e => {
        e.preventDefault();
        let peliculaBorrar = document.getElementById("removepelicula");
        if (peliculaBorrar.value) {
            localStorage.removeItem(peliculaBorrar.value);
            console.log("pelicula borrada");
        }
    })
}