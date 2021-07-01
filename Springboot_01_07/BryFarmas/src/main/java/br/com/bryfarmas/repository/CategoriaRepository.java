package br.com.bryfarmas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bryfarmas.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAll();

	public List<Categoria> findAllByDepartamentoContainingIgnoreCase(String departamento);

}
