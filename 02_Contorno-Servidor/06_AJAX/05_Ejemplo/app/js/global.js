
const base_url = "http://localhost/controller/FrontController.php";

window.onload = onceLoaded;


function onceLoaded() {

    console.debug("window loaded");
    document.querySelector('#formLogin').onsubmit = confirmLoginJSON;
    
    getRoles();
}

