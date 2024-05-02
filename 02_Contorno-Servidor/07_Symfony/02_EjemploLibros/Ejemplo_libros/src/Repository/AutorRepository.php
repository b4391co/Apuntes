<?php

namespace App\Repository;

use DateTime;
use App\Entity\Autor;
use App\Entity\Libro;
use Doctrine\Persistence\ManagerRegistry;
use Doctrine\Bundle\DoctrineBundle\Repository\ServiceEntityRepository;

/**
 * @extends ServiceEntityRepository<Autor>
 *
 * @method Autor|null find($id, $lockMode = null, $lockVersion = null)
 * @method Autor|null findOneBy(array $criteria, array $orderBy = null)
 * @method Autor[]    findAll()
 * @method Autor[]    findBy(array $criteria, array $orderBy = null, $limit = null, $offset = null)
 */
class AutorRepository extends ServiceEntityRepository
{
    public function __construct(ManagerRegistry $registry)
    {
        parent::__construct($registry, Autor::class);
    }


    public function findByFechaNacimiento(DateTime $fechaNacimiento):array {
        $em = $this->getEntityManager();
        $query = $em->createQuery('SELECT a FROM App\Entity\Autor a WHERE a.fechaNacimiento >= :fechaNacimiento');
        $query->setParameter('fechaNacimiento', $fechaNacimiento);
        return $query->getResult();
    }



    public function getAutoresPorVentas(int $ventas) {
        $em = $this->getEntityManager();
        $query = $em->createQuery("SELECT a FROM App\Entity\Autor a join a.libros li WHERE li.unidadesVendidas > ?1");
        return $query->setParameter(1, $ventas)->getResult();
        
    }

    //public function findAutoresSuperVentas():Libro{
    //    $em = $this->getEntityManager();
    //    $query = $em->createQuery("SELECT a, li FROM App\Entity\Libro li join li.autores a where li.unidadesVendidas= (select max(li2.unidadesVendidas) FROM App\Entity\Libro li2)");
    //    return $query->getOneOrNullResult();
    //}

    public function findAutoresSuperVentas(){
        return $this->createQueryBuilder('li')
            ->select("MAX(li.unidadesVendidas)")
            ->join('autores.libros', 'li')
            ->getQuery()
            ->getSingleScalarResult();h
    }

    //    /**
    //     * @return Autor[] Returns an array of Autor objects
    //     */
    //    public function findByExampleField($value): array
    //    {
    //        return $this->createQueryBuilder('a')
    //            ->andWhere('a.exampleField = :val')
    //            ->setParameter('val', $value)
    //            ->orderBy('a.id', 'ASC')
    //            ->setMaxResults(10)
    //            ->getQuery()
    //            ->getResult()
    //        ;
    //    }

    //    public function findOneBySomeField($value): ?Autor
    //    {
    //        return $this->createQueryBuilder('a')
    //            ->andWhere('a.exampleField = :val')
    //            ->setParameter('val', $value)
    //            ->getQuery()
    //            ->getOneOrNullResult()
    //        ;
    //    }
}
