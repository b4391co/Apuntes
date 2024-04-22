<?php

namespace App\Controller;

use DateTime;
use App\Service\ConsultasService;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\Routing\Attribute\Route;
use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;

class ConsultasController extends AbstractController
{


    public function __construct(private ConsultasService  $consultasService)
    {
    }

    #[Route('/consultas/{fecha}', name: 'app_consultas')]
    public function index(DateTime $fecha): Response
    {
        $autores = $this->consultasService->getAutoresByFechaNacimiento($fecha);

        return $this->render('consultas/index.html.twig', [
            'controller_name' => 'ConsultasController',
            'autores' => $autores,
        ]);
    }

    #[Route('/consultas/autores/ventas/{max}', name: 'app_consultas_autores_ventas')]
    public function autoresVentas(int $max): Response
    {
        $autores = $this->consultasService->getAutoresPorVentas($max);

        return $this->render('consultas/index.html.twig', [
            'controller_name' => 'ConsultasController',
            'autores' => $autores,
        ]);
    }

    #[Route('/consultas/libro/ventas', name: 'app_unidades')]
    public function unidades(): Response
    {
        $max = $this->consultasService->getMaxUnidadesVendidas();

        return $this->render('consultas/unidades.html.twig', [
            'controller_name' => 'ConsultasController',
            'max' => $max,
        ]);
    }
}
