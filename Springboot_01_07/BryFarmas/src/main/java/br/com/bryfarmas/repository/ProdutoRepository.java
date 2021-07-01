package br.com.bryfarmas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bryfarmas.model.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {
	
	
	public List<Produto> findAll ();
	
	
	public List<Produto> findAllBynomeProdutoContainingIgnoreCase (String nomeProduto);

	
}
