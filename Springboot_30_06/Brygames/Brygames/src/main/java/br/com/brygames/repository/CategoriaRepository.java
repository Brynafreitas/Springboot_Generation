package br.com.brygames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.brygames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Long> {
	
	public List<Categoria>findAll ();
	public List<Categoria>findAllByDescricaoContainingIgnoreCase (String descricao);
}
