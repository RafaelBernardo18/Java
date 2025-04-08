package br.com.liderdb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.liderdb.Model.Cerveja;

@Repository
public interface CervejaRepository extends JpaRepository<Cerveja, Long> {

}
