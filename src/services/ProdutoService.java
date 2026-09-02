package services;

import java.util.List;
import models.Produto;
import repositories.ProdutoRepository;

public class ProdutoService {
	
	private ProdutoRepository repository = new ProdutoRepository();
	


// CREATE 

	public Produto create(Produto produto) {
		
		 if (produto.getValor() < 0) {
	            throw new IllegalArgumentException(
	                    "O valor não pode ser negativo.");
	        }
		
		
		if ( produto.getQuantidade() < 0) {
			throw new IllegalArgumentException("A quantidade não pode ser negativo.");
			
		}
		
		return repository.create(produto);
		
		
	}
	
	// LISTAR 
	
	public List <Produto> findAll() {
		
		return repository.findAll();
		
		
		
	}
	
	// BUSCAR POR ID 
	
	public Produto findById(long id ) {
		
		return repository.findById(id);
		
		
	}
	
	// ATUALIZAR 
	
	public boolean update (Produto produto ) {
		
		if (produto.getValor() < 0) {
			throw new IllegalArgumentException("O valor não pode ser negativo.");
			
		}
		
		if (produto.getQuantidade() < 0) {
			throw new IllegalArgumentException("A quantidade não pode ser negativa.");
		}
		
		
		return repository.update(produto);
		
	}
	
	// EXCLUIR
	
	public boolean delete(long id) {
		return repository.delete(id);
		
		
		
		
	}
	
	// PESQUISAR POR NOME 
	
	public List<Produto> findByNome (String nome) {
		return repository.findByNome(nome);
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
