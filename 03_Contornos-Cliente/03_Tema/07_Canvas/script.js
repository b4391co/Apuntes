window.onload = iniciar;

function iniciar(){
    let circleForm = document.getElementById("circleForm");
    let circleRadius = document.getElementById("circleRadius");
    let circleColor = document.getElementById("circleColor");
    let circleCanvas = document.getElementById("circleCanvas");
    let circleDiv = document.getElementById("circleDiv");
    let circle = document.getElementById("circle");

    let squareForm = document.getElementById("squareForm");
    let squareSize = document.getElementById("squareSize");
    let squareColor = document.getElementById("squareColor");
    let squareCanvas = document.getElementById("squareCanvas");
    let squareDiv = document.getElementById("squareDiv");
    let square = document.getElementById("square");

    let triangleForm = document.getElementById("triangleForm");
    let triangleSize = document.getElementById("triangleSize");
    let triangleColor = document.getElementById("triangleColor");
    let triangleCanvas = document.getElementById("triangleCanvas");
    let triangleDiv = document.getElementById("triangleDiv");
    let triangle = document.getElementById("triangle");

    circleDiv.style.display = "none";
    squareDiv.style.display = "none";
    triangleDiv.style.display = "none";

    circle.onclick = function(){
        circleDiv.style.display = "block";
        circle.style.display = "none";
    }

    square.onclick = function(){
        squareDiv.style.display = "block";
        square.style.display = "none";
    }

    triangle.onclick = function(){
        triangleDiv.style.display = "block";
        triangle.style.display = "none";
    }

    circleForm.onsubmit = function(e){
        e.preventDefault();
        let ctx = circleCanvas.getContext("2d");
        ctx.beginPath(); // Inicia la operación de dibujo.
        ctx.fillStyle = circleColor.value;
        ctx.arc(100, 90, circleRadius.value, 0, Math.PI*2, false);
        ctx.closePath();
        ctx.stroke();
        ctx.fill();
    }

    squareForm.onsubmit = function(e){
        e.preventDefault();
        let ctx = squareCanvas.getContext("2d");
        ctx.beginPath(); // Inicia la operación de dibujo.
        ctx.fillStyle = squareColor.value;
        ctx.fillRect(70, 0, squareSize.value, squareSize.value);
        ctx.closePath();
        ctx.stroke();
        ctx.fill();
    }

    triangleForm.onsubmit = function(e){
        e.preventDefault();
        let ctx = triangleCanvas.getContext("2d");
        ctx.beginPath(); // Inicia la operación de dibujo.
        ctx.fillStyle = triangleColor.value;
        ctx.moveTo(50, 50);
        ctx.lineTo(triangleSize.value, triangleSize.value);
        ctx.lineTo(0, triangleSize.value);
        ctx.lineTo(triangleSize.value/2, triangleSize.value/2);
        ctx.closePath();
        ctx.stroke();
        ctx.fill();
    }
}