
const base_url = "http://localhost/controller/FrontController.php";

window.onload = onceLoaded;


function onceLoaded() {

    console.debug("window loaded");
    document.querySelector('#formLogin').onsubmit = login;
    
    getRoles();

    document.querySelector('#cerrarSesion').onsubmit = comfirmLogout;
}

