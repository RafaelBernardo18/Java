package br.com.liderdb.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.liderdb.Model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
