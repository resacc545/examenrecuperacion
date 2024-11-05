package pe.edu.upeu.pruebaAPI2410.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.pruebaAPI2410.Entity.Coche;

@Repository
public interface CocheRepository extends JpaRepository<Coche, Long> {

}
