class Alumno{
    constructor(nombre, dni, direccion) {
        this._nombre = nombre;
        this._dni = dni;
        this._direccion = direccion;
    }
    get nombre() {
        return this._nombre;
    }
    set nombre(in_nombre) {
        this._nombre = in_nombre;
    }

    get dni() {
        return this._dni;
    }
    set dni(in_dni) {
        this._dni = in_dni;
    }

    get direccion() {
        return this._direccion;
    }
    set direccion(in_direccion) {
        this._direccion = in_direccion;
    }

    modificar() {
        
    }
}

function crearAlumnos(nombre, dni, direccion) {
    const alumno = new Alumno(nombre, dni, direccion);
    localStorage.setItem(alumno.dni, JSON.stringify(alumno));
}

window.addEventListener('DOMContentLoaded', () => {
    var form = document.getElementById('formulario');
    var nombre = document.getElementById('addNombre');
    var dni = document.getElementById('addDni');
    var direccion = document.getElementById('addDireccion');

    var btnGuardar = document.getElementById('guardar');
    var btnMostrar = document.getElementById('mostrar');
    var btnBorrar = document.getElementById('borrar');

    var divAlumnos = document.getElementById('alumnos');

    btnGuardar.addEventListener('click', e => {
        e.preventDefault();
        crearAlumnos(nombre.value, dni.value, direccion.value);
    })

    btnMostrar.addEventListener('click', () => {
        divAlumnos.innerHTML = '';
        var table = document.createElement('table');
        divAlumnos.appendChild(table);
        var thead = document.createElement("thead");
        table.appendChild(thead);
        var trhead = document.createElement("tr");
        thead.appendChild(trhead);
        var thDni = document.createElement('th');
        var thNombre = document.createElement('th');
        var thDireccion = document.createElement('th');
        trhead.appendChild(thDni);
        trhead.appendChild(thNombre);
        trhead.appendChild(thDireccion);
        thDni.innerHTML = "Dni";
        thNombre.innerHTML = "Nombre";
        thDireccion.innerHTML = "Direccion";

        var tbody = document.createElement("tbody");
        table.appendChild(tbody);

        for (let i = 0; i < localStorage.length; i++) {
            const alumno = JSON.parse(localStorage.getItem(localStorage.key(i)));
            var trbody = document.createElement("tr");
            tbody.appendChild(trbody);
            var tdDni = document.createElement('td');
            var tdNombre = document.createElement('td');
            var tdDireccion = document.createElement('td');
            var tdModificar = document.createElement('td');
            trbody.appendChild(tdDni);
            trbody.appendChild(tdNombre);
            trbody.appendChild(tdDireccion);
            trbody.appendChild(tdModificar);
            tdDni.innerHTML = alumno._dni;
            tdNombre.innerHTML = alumno._nombre;
            tdDireccion.innerHTML = alumno._direccion;
            var btnModificar = document.createElement('input');
            tdModificar.appendChild(btnModificar);
            btnModificar.type = "button";
            btnModificar.value = "modificar";
            btnModificar.id = "modificar";
            btnModificar.addEventListener('click', modificarDatos);
        }
    })

    var btnModificar = document.getElementById('modificar');

    function modificarDatos(evt) {
        nombre.value = evt.target.parentNode.parentNode.childNodes[1].innerHTML;
        dni.value = evt.target.parentNode.parentNode.childNodes[0].innerHTML;
        direccion.value = evt.target.parentNode.parentNode.childNodes[ 2 ].innerHTML;
    }

    btnBorrar.addEventListener('click', () => {
        let dniBorrar = document.getElementById('removeAlumno').value;
        localStorage.removeItem(dniBorrar);
    })
})
