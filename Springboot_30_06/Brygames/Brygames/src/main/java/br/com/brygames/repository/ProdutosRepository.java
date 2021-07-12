package br.com.brygames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.brygames.model.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository <Produtos, Long> {
	
	public List<Produtos> findAll(); 
	public List<Produtos> findAllByNomeContainingIgnoreCase (String nome);
}