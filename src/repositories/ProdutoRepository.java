package repositories;


import java.util.ArrayList;

import java.util.List;


import models.Produto;



public class ProdutoRepository {
	
	
	private static List<Produto> produtos = new ArrayList<>();
	
	
	// CADASTRAR  PRODUTOS NO CREATE 
	
	public Produto create(Produto produto) {
		produtos.add(produto);
		
		return produto;
		
	}
	 //LISTAR 
	
	public List<Produto> findAll(){  // É UM METODO MUITO USADO EM REPOSITORIES , 
		
		return produtos;             // PRINCIPALMENTE EM SPRING DATA , 
									 // PARA BUSCAR TODOS OS REGISTROS 	
	}
	
	//BUSCAR POR ID
	
	public Produto findById(long id) {  //FindById  SIGNIFICA BUSCAR POR ID;
										//A LETRA i e MAIUSCULA (I) I
		
		for(Produto produto : produtos ) {
			
			if (produto.getId()==id) {
				return produto;
				
			}
		}
		
		return null;    // PARA ENCERRAR O METODO  
			
	}
	
	// ATUALIZAR
	
		public boolean update (Produto produtoAtualizado)
		{
			for (int i =0;i <produtos.size(); i++) {
				
				if (produtos.get(i).getId() == produtoAtualizado.getId()) {
					
					produtos.set(i, produtoAtualizado);
					
					return true;
					
				}
			}
		return false;
		
		}
		
		// EXCLUIR
		
		public boolean delete(long id) {
			
			for (Produto produto : produtos) {
			
				if( produto.getId() == id) {
					
					produtos.remove(produto);
					return true;
			}
				
		}
			
			return false;
			
		}
		
		public List<Produto> findByNome(String nome) {
			
			List<Produto> resultado = new ArrayList<>();
			
			for (Produto produto : produtos) {
				
				if (produto.getNome().toLowerCase().contains(nome.toLowerCase())) {
					
					resultado.add(produto);
				}
			}
			return resultado;
			
			
		}
}

	