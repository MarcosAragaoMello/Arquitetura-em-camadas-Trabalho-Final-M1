package controllers;

import java.util.List;
import java.util.Scanner;

import models.Produto;
import services.ProdutoService;


public class ProdutoController {

	
	private ProdutoService service = new ProdutoService();
	
	Scanner scan = new Scanner(System.in);
	
	
	 
	
	// CADASTRO 

    // DENTRO DO CONTROLLER

	public void cadastrar() {
		
		System.out.println("\n=========== CADASTRAR PRODUTO ==========");
		
		System.out.println("Nome:");
		String nome = scan.nextLine();
		
		System.out.println("valor:");
		double valor = scan.nextDouble();
		
		System.out.println("Quantidade:");
		long quantidade = scan.nextLong();
		
		scan.nextLine();
		
		System.out.println("Categoria:");
		String categoria = scan.next();
		
		Produto produto = new Produto (nome,valor, quantidade, categoria);
		
		service.create(produto);  // CRIAR PRODUTO 
		
		System.out.println("PRODUTO CADASTRADO!");
		
	}
	
	
		// LISTA DE PRODUTOS 
	
		public void listar() {
			
			System.out.println("========== PRODUTOS ==========");
			
			List<Produto> produtos = service.findAll();
			
			if (produtos.isEmpty()) {
				System.out.println("nenhum produto cadastrado.");
				
				return;
				
			}
			
			for (Produto produto : produtos ) {
				
				System.out.println("ID:" + produto.getId() + "| Nome:" + produto.getNome() + "| valor: R$" + "| Quantidade:" + "| Categoria :" + produto.getCategoria());
				
			}
		}	
		
		
		// BUSCAR POR ID
		
		public void buscarPorId() {
			
			System.out.println("\nDigite o ID:");
			
			long id = scan.nextLong();
			scan.nextLine();
			
			
			Produto produto = service.findById(id);
			
			
			if ( produto == null) {
				
				
				System.out.println("produto não encontrado.");
				
			} else {
				
				
				System.out.println("ID:" +  produto.getId() + "Nome: " + produto.getNome() + "valor : R$" + "Quantidade : " + produto.getQuantidade() + "Categoria " + produto.getCategoria());
			}
		}
		// ATUALIZAR
		
		public void atualizar() {
			
		
			   System.out.println("\n=== ATUALIZAR PRODUTO ===");

			    System.out.print("Digite o ID do produto: ");
			    long id = scan.nextLong();
			    scan.nextLine();

			    Produto produto = service.findById(id);

			    if (produto == null) {
			        System.out.println("Produto não encontrado.");
			        return;
		}
			    System.out.print("Novo nome: ");
			    String nome = scan.nextLine();

			    System.out.print("Novo valor: ");
			    double valor = scan.nextDouble();

			    System.out.print("Nova quantidade: ");
			    long quantidade = scan.nextLong();
			    scan.nextLine();

			    System.out.print("Nova categoria: ");
			    String categoria = scan.nextLine();

			    Produto produtoAtualizado = new Produto( nome,valor,quantidade, categoria);
			           

			    boolean resultado = service.update(produtoAtualizado);

			    if (resultado) {
			        System.out.println("Produto atualizado com sucesso!");
			    } else {
			        System.out.println("Não foi possível atualizar o produto.");
			    }
		}
		   
			
		        
	
		
	// EXCLUIR 
	
	public void excluir () {
		
		System.out.println(" \nDigite o ID do produto:");
		
		long id = scan.nextLong();
		scan.nextLine();
		
		
		
		boolean resultado = service.delete(id);
		
		if (resultado) {
			
			System.out.println("Produto excluido!");
			
		} else {
			
			System.out.println("Produto não encontrado.");
		}
	}

	// PESQUISAR POR NOME 
	
	public void pesquisarPorNome() {

	    System.out.println("\n=== PESQUISAR PRODUTO ===");

	    System.out.print("Digite o nome: ");
	    String nome = scan.nextLine();

	    List<Produto> produtos = service.findByNome(nome);

	    if (produtos.isEmpty()) {

	        System.out.println("Nenhum produto encontrado.");

	        return;
	    }

	    for (Produto produto : produtos) {

	        System.out.println(
	                "ID: " + produto.getId()
	                + " | Nome: " + produto.getNome()
	                + " | Valor: R$ " + produto.getValor()
	                + " | Quantidade: " + produto.getQuantidade()
	                + " | Categoria: " + produto.getCategoria()
	        );
	
    }
	}
}

























	
	
	
