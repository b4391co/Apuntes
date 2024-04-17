<?php

namespace App\Entity;

use App\Repository\LibroRepository;
use Doctrine\Common\Collections\ArrayCollection;
use Doctrine\Common\Collections\Collection;
use Doctrine\DBAL\Types\Types;
use Doctrine\ORM\Mapping as ORM;

#[ORM\Entity(repositoryClass: LibroRepository::class)]
class Libro
{
    #[ORM\Id]
    #[ORM\GeneratedValue]
    #[ORM\Column]
    private ?int $id = null;

    #[ORM\Column(length: 200)]
    private ?string $titulo = null;

    #[ORM\Column(type: Types::DATE_IMMUTABLE, nullable: true)]
    private ?\DateTimeImmutable $fechaPublicacion = null;

    #[ORM\Column(nullable: true)]
    private ?int $unidadesVendidas = null;

    /**
     * @var Collection<int, Autor>
     */
    #[ORM\ManyToMany(targetEntity: Autor::class, inversedBy: 'libors')]
    private Collection $autores;

    /**
     * @var Collection<int, editorial>
     */
    #[ORM\ManyToMany(targetEntity: editorial::class, inversedBy: 'libros')]
    private Collection $editorial;

    public function __construct()
    {
        $this->autores = new ArrayCollection();
        $this->editorial = new ArrayCollection();
    }

    public function getId(): ?int
    {
        return $this->id;
    }

    public function getTitulo(): ?string
    {
        return $this->titulo;
    }

    public function setTitulo(string $titulo): static
    {
        $this->titulo = $titulo;

        return $this;
    }

    public function getFechaPublicacion(): ?\DateTimeImmutable
    {
        return $this->fechaPublicacion;
    }

    public function setFechaPublicacion(?\DateTimeImmutable $fechaPublicacion): static
    {
        $this->fechaPublicacion = $fechaPublicacion;

        return $this;
    }

    public function getUnidadesVendidas(): ?int
    {
        return $this->unidadesVendidas;
    }

    public function setUnidadesVendidas(?int $unidades_vendidas): static
    {
        $this->unidadesVendidas = $unidades_vendidas;

        return $this;
    }

    /**
     * @return Collection<int, Autor>
     */
    public function getAutores(): Collection
    {
        return $this->autores;
    }

    public function addAutore(Autor $autore): static
    {
        if (!$this->autores->contains($autore)) {
            $this->autores->add($autore);
        }

        return $this;
    }

    public function removeAutore(Autor $autore): static
    {
        $this->autores->removeElement($autore);

        return $this;
    }

    /**
     * @return Collection<int, editorial>
     */
    public function getEditorial(): Collection
    {
        return $this->editorial;
    }

    public function addEditorial(editorial $editorial): static
    {
        if (!$this->editorial->contains($editorial)) {
            $this->editorial->add($editorial);
        }

        return $this;
    }

    public function removeEditorial(editorial $editorial): static
    {
        $this->editorial->removeElement($editorial);

        return $this;
    }
}
