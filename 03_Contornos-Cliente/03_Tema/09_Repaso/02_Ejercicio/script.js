window.onload = function() {
    let img1 = document.getElementById("img1");
    let img2 = document.getElementById("img2");
    let img3 = document.getElementById("img3");
    let img4 = document.getElementById("img4");
    let img5 = document.getElementById("img5");
    let img6 = document.getElementById("img6");

    img4.addEventListener("mouseenter", function() {
        img4.setAttribute("src", "img/8.JPG");
    })
    img4.addEventListener("mouseleave", function() {
        img4.setAttribute("src", "img/7.JPG");
    })

    img5.addEventListener("mouseenter", function() {
        img5.setAttribute("src", "img/10.JPG");
    })
    img5.addEventListener("mouseleave", function() {
        img5.setAttribute("src", "img/9.JPG");
    })

    img6.addEventListener("mouseenter", function() {
        img6.setAttribute("src", "img/12.JPG");
    })
    img6.addEventListener("mouseleave", function() {
        img6.setAttribute("src", "img/11.JPG");
    })

    cambiarImagen(img1, "img/1.JPG", "img/2.JPG");
    cambiarImagen(img2, "img/3.JPG", "img/4.JPG");
    cambiarImagen(img3, "img/5.JPG", "img/6.JPG");


    
}

function cambiarImagen(img, ruta,ruta2) {
    if (img.getAttribute("src") === ruta) {
        img.setAttribute("src", ruta2);
    } else {
        img.setAttribute("src", ruta);
    }
    setTimeout(() => {
        cambiarImagen(img, ruta,ruta2);
    }, 1000);
    console.log(img);
}