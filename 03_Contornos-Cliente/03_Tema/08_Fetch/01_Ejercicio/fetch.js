'use strict'
var div_usuarios=document.querySelector('#usuarios');
// .Ofrece una API para acceder a recursos tipicos como usuarios, mensajes de un foro y fotos
var usuarios=[];
//fetch('https://jsonplaceholder.typicode.com/users')
fetch('https://reqres.in/api/users')
.then (data=>data.json())
.then (users=> {
    usuarios=users.data;
    console.log(usuarios);
    //Crea un nuevo array con los resultadosde la función
    usuarios.map((user, i) => {
        let nombre = document.createElement("h2");
        nombre.id = user.id;
        nombre.addEventListener('click', function() {
            console.log(user.first_name);
            document.getElementById("datos").innerHTML = "Nombre: " + user.first_name + ", Apellido: " + user.last_name + ", Correo: " + user.email;
            document.getElementById("nombre").innerHTML = user.first_name + " " + user.last_name;
            document.getElementById("avatar").src = user.avatar;
        });
        nombre.innerHTML=i+ " " +user.first_name;
        div_usuarios.appendChild(nombre);
    });
});



