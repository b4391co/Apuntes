/*  Realiza un programa que pida introducir un nombre de alumno por teclado, si el nombre
del alumno existe en la lista implementada mediante un array, se visualizará el mensaje
“Encontrado”, si no existe, se visualizará el mensaje de “No Encontrado”*/

function existeAlumno(alumno, listaAlumnos) {
    if(listaAlumnos.includes(alumno.toUpperCase())){
        document.write("El alumno <b>" + alumno + "</b> existe");
    } else {
        document.write("El alumno <b>" + alumno + "</b> no existe");
    }
}

let alumnos = ["PEPE", "MARIA", "JOSE"];
let alumnoPedido = (prompt("Nombre: "));

existeAlumno(alumnoPedido, alumnos);