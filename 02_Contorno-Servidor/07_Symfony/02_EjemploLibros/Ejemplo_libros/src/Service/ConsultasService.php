<?php
namespace App\Service;
use DateTime;
use App\Repository\AutorRepository;
use App\Repository\LibroRepository;

class ConsultasService{


    public function __construct(private AutorRepository $autorRepository, private LibroRepository $LibroRepository){}


    public function getAutoresByFechaNacimiento(DateTime $fechaNacimiento)
    {
        return $this->autorRepository->findByFechaNacimiento($fechaNacimiento);
    }

    public function getMaxUnidadesVendidas(){
        return $this->LibroRepository->getUnidadesVendidas();
    }
    
    public function getAutoresPorVentas(int $max){
        return $this->autorRepository->getAutoresPorVentas($max);
    }

    public function getLibrosPorVentas(){
        return $this->LibroRepository->getLibrosPorVentas();
    }

    public function getLibrosPorAutor(){
        return $this->LibroRepository->getLibrosPorAutor();
    }

    public function getLibrosPorEditorial(){
        return $this->LibroRepository->getLibrosPorEditorial();
    }

    public function getLibroAutoresMax(){
        return $this->autorRepository->findAutoresSuperVentas();
    }
}