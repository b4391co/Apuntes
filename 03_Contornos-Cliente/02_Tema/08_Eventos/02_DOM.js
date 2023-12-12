function crear(){
    let cantidad = document.getElementById("cantidad").value;
    for (let i = 1; i <= cantidad; i++) {
        console.log("Estoy escuchando");
        let bloque = document.createElement("span");
        bloque.className = "caja";
        bloque.innerHTML = i;
        bloque.id = "bloque" + i + "";
        document.getElementById("seccion").append(bloque);
    }
}

function crearAntes() {
    let bloque = document.createElement("span");
    bloque.className = "caja";
    bloque.style.background = "chartreuse";
    antes = document.getElementById("numeroAnterior").value;
    antes = "bloque" + antes + "";
    console.log(antes);
    antes = document.getElementById(antes);
    document.getElementById('seccion').insertBefore(bloque,antes);
}

function crearDespues() {
    let bloque = document.createElement("span");
    bloque.className = "caja";
    bloque.style.background = "orange";
    despues = document.getElementById("numeroPosterior").value;
    despues = parseInt(despues)+1;
    console.log(despues);
    despues = "bloque" + despues + "";
    console.log(despues);
    despues = document.getElementById(despues);
    document.getElementById('seccion').insertBefore(bloque,despues);
}

const crearBoton = document.getElementById("crear");
crearBoton.addEventListener("click", crear);

const crearAntesBoton = document.getElementById("antes");
crearAntesBoton.addEventListener("click", crearAntes);

const crearDespuesBoton = document.getElementById("despues");
crearDespuesBoton.addEventListener("click", crearDespues);
