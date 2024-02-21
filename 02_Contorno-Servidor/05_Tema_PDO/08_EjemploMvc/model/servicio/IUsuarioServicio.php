<?php

interface IUsuarioServicio {
    function getUsuarios(): array;
    function getUsuarioById(int $id): ?Usuario;
    function save(Usuario $usuario): Usuario;
    function deleteUsuarioById(int $id): bool;
}