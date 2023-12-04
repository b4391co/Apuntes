//Declaracion de la ventana
let ventana = null;
//Asignar el foco al primer cuadro de texto del formulario
window.document.getElementById ('ancho').focus ();
//Recorrer todos los cuadros de texto para modificar la propiedad
let cuadrosTexto = document.querySelectorAll ('input');
//Mostrar por consola los cuadros de texto
console.log (cuadrosTexto);
let botones = document.querySelectorAll ('button');
//Mostrar por consola los botones
console.log (botones);

//Deshabilita los botones
for (let i = 1; i < botones.length; i++)
  botones[i].disabled = true;


function CrearVentana () {
  var opciones = '';
  /*Inicializar las características con los valores del formulario
   en esta solucion estamos accediendo a la posición del array cuadrosTexto.
   Mejorar dicha solución utilizando los métodos de la estructura DOM, 
   como indico a continuación, pero que queda pendiente para la siguiente unidad
   height=' + document.getElementById ('ancho').value*/

  opciones = opciones + 'width=' + cuadrosTexto[0].value + ',';
  opciones = opciones + 'height=' + cuadrosTexto[1].value + ',';
  opciones = opciones + 'left=' + cuadrosTexto[2].value + ',';
  opciones = opciones + 'top=' + cuadrosTexto[3].value;

  ventana = window.open ('', 'ventana', opciones);
  ventana.name = 'nueva';

  //Como el objeto document de la ventana se  corresponde con la página, podemos crear una
  //pagina web a través del método write.

  ventana.document.write (
    '<head><meta http-equiv="content-type" content="text/html; charset=iso-8859-1"><title>Titulo nueva ventana</title>  </head>'
  );
  ventana.document.write ('<div class="mostrarNombre" id="nombre1"></div>');
  ventana.document.write ('<div class="mostrarFecha" id="fecha1"></div>');
  let fecha = new Date(); //Guardo en la letiable fecha la fecha actual
  let dia = fecha.getDate();
  let mes = fecha.getMonth();
  let anno = fecha.getFullYear();
  let parrafo1 = ventana.document.createElement("h1");
  let parrafo2 = ventana.document.createElement("h2");
  parrafo1.innerHTML = "Pepe";
  parrafo2.innerHTML = `${dia} de ${mes} de ${anno}`;
  ventana.document.getElementById("nombre1").append(parrafo1);
  ventana.document.getElementById("fecha1").append(parrafo2);
  //fecha1.appendChild(parrafo2);



  //Mostrar los valores por la consola para comprobar que son correctos
  console ('width' + cuadrosTexto[0].value);
  console.log ('height' + cuadrosTexto[1].value);
  console.log ('cordx' + cuadrosTexto[2].value);
  console.log ('cordy' + cuadrosTexto[3].value);
  
}

function CerrarVentana () {
  parent.ventana.close ();
  window.close ();
}



