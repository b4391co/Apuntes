let ventana = null;

const boton = document.getElementById("enviar");
const form = document.getElementById("miFormulario");
boton.addEventListener("click", run);

function run(){
    ventana = window.open ('', 'ventana', "width=1000,height=500,left=120,right=120");
    ventana.name = 'nueva';
    ventana.document.write ('<div id="mostrarNombre"></div>');
    let texto = ventana.document.createElement("div");
    texto.style.fontSize = 40;
    texto.style.margin = 50;
    texto.style.color = form["color"].value;
    texto.style.fontFamily = form["fuente"].value;
    texto.innerHTML = form["nombre"].value;
    ventana.document.getElementById("mostrarNombre").append(texto);
}