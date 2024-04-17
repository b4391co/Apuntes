<?php

namespace App\Entity;

use App\Repository\AutorRepository;
use Doctrine\Common\Collections\ArrayCollection;
use Doctrine\Common\Collections\Collection;
use Doctrine\DBAL\Types\Types;
use Doctrine\ORM\Mapping as ORM;

#[ORM\Entity(repositoryClass: AutorRepository::class)]
class Autor
{
    #[ORM\Id]
    #[ORM\GeneratedValue]
    #[ORM\Column]
    private ?int $id = null;

    #[ORM\Column(length: 255)]
    private ?string $nombre = null;

    #[ORM\Column(type: Types::DATE_IMMUTABLE, nullable: true)]
    private ?\DateTimeImmutable $fechaNacimiento = null;

    /**
     * @var Collection<int, Libro>
     */
    #[ORM\ManyToMany(targetEntity: Libro::class, mappedBy: 'autores')]
    private Collection $libors;

    public function __construct()
    {
        $this->libors = new ArrayCollection();
    }

    public function getId(): ?int
    {
        return $this->id;
    }

    public function getNombre(): ?string
    {
        return $this->nombre;
    }

    public function setNombre(string $nombre): static
    {
        $this->nombre = $nombre;

        return $this;
    }

    public function getFechaNacimiento(): ?\DateTimeImmutable
    {
        return $this->fechaNacimiento;
    }

    public function setFechaNacimiento(?\DateTimeImmutable $fechaNacimiento): static
    {
        $this->fechaNacimiento = $fechaNacimiento;

        return $this;
    }

    /**
     * @return Collection<int, Libro>
     */
    public function getLibors(): Collection
    {
        return $this->libors;
    }

    public function addLibor(Libro $libor): static
    {
        if (!$this->libors->contains($libor)) {
            $this->libors->add($libor);
            $libor->addAutore($this);
        }

        return $this;
    }

    public function removeLibor(Libro $libor): static
    {
        if ($this->libors->removeElement($libor)) {
            $libor->removeAutore($this);
        }

        return $this;
    }
}
