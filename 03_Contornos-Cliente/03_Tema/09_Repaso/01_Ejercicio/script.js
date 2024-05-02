class Cliente {
    constructor(nombre, dni, direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }

    // getters y setters

    getNombre() {
        return this.nombre;
    }

    setNombre(nombre) {
        this.nombre = nombre;
    }

    getDni() {
        return this.dni;
    }

    setDni(dni) {
        this.dni = dni;
    }

    getDireccion() {
        return this.direccion;
    }

    setDireccion(direccion) {
        this.direccion = direccion;
    }

    // Métodos
    mostrarCliente() {
        console.log(`Nombre: ${this.nombre}`);
        console.log(`dni: ${this.dni}`);
    }
    
    modifcarCliente(nombre, dni, direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }
}

function crearCliente(nombre, dni, direccion) {
    let cliente = new Cliente(nombre, dni, direccion);
    localStorage.setItem(dni, JSON.stringify(cliente));
    console.log("Cliente creado");
}

function mostrarCliente(dni) {
    document.getElementById("tablaMostrar").style.visibility = "visible";
    let tbody = document.getElementById("tbodyMostrar");
    tbody.innerHTML = "";

    for (let i = 0; i < localStorage.length; i++) {
        let tr = document.createElement("tr");
        let cliente = JSON.parse(localStorage.getItem(localStorage.key(i)));
        let tdNombre = document.createElement("td");
        let tdDni = document.createElement("td");
        let tdDireccion = document.createElement("td");

        tdNombre.innerHTML = cliente.nombre;
        tdDni.innerHTML = cliente.dni;
        tdDireccion.innerHTML = cliente.direccion;
        
        tr.appendChild(tdNombre);
        tr.appendChild(tdDni);
        tr.appendChild(tdDireccion);
        tr.addEventListener('click', function() {
            console.log(cliente.dni);
            localStorage.removeItem(cliente.dni);
            tr.innerHTML="";
        })
        tbody.appendChild(tr);
        console.log(cliente);
    }
}

window.onload = function () {
    document.getElementById("tablaMostrar").style.visibility = "hidden";
    let nombre = document.getElementById('nombre');
    let dni = document.getElementById('dni');
    let direccion = document.getElementById('direccion');
    let botonAdd = document.getElementById('botonAdd');
    let botonShow = document.getElementById('botonShow');

    botonAdd.addEventListener('click', function() {
        crearCliente(nombre.value, dni.value, direccion.value);
    });

    botonShow.addEventListener('click', function() {
        mostrarCliente(dni.value);
    })
}
