<?php

class ProductoServicio {

    private IProductoRepository $productoRepository;

    public function __construct(){
        $this->productoRepository = new ProductoRepository();
    }

    public function list(): array{
        return $this->productoRepository->findAll();
    }

    public function deleteProductById(int $id): bool{
        $exito = true;
        $exito = $exito && $this->productoRepository->delete($id);
        return $exito;
    }
}