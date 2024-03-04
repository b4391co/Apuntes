
//const base_url = "http://localhost:3000/02_Contorno-Servidor/06_AJAX/04_Ejercicio/app/controller/FrontController.php";
const base_url = "http://localhost/controller/FrontController.php";
window.onload = onceLoaded;


function onceLoaded() {

    console.debug("window loaded");
    document.querySelector('#formLogin').onsubmit = loginJSON;
    
    getRoles();
}

