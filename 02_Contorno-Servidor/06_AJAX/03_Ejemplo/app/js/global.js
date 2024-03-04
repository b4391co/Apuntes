
//const base_url = "http://localhost:3000/controller/FrontController.php";
const base_url = "http://localhost/controller/FrontController.php";
window.onload = onceLoaded;


function onceLoaded() {

    console.debug("window loaded");
    document.querySelector('#formLogin').onsubmit = login;
    
    getRoles();
}

