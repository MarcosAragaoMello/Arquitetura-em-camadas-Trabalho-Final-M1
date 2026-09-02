package App;


import java.util.InputMismatchException;

import java.util.Scanner;



import controllers.ProdutoController;


public class App {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ProdutoController controller = new ProdutoController();
		
		int opcao;
		
		
		do {
			
			System.out.println("\n==============================");
			
			
			System.out.println(" Loja de Eletrônicos ");
			
			System.out.println("================================");
			
			System.out.println("1 - Cadastrar produto ");
			System.out.println("2 - Listar Produtos ");
			System.out.println("3 - Buscar por Id");
			System.out.println("4 - Atualizar Produto");
			System.out.println("5 - Excluir produto");
			System.out.println("6 - Pesquisar por nome");
			System.out.println("0 - Sair");
			
			System.out.println("Escolha:");
			
			
			try {
			
			
			opcao = scan.nextInt();
			scan.nextLine();
			
			switch (opcao) {
			
			case 1:
				controller.cadastrar();
				break;
				
			case 2:
				controller.listar();
				break;
			
			case 3: 
				controller.buscarPorId();
				break;
				
			case 4:
				controller.atualizar();
				break;
			
			case 5:
				controller.excluir();
				break;
			
			case 6:
			controller.pesquisarPorNome();
			break;
			
			case 0:
				System.out.println("Programa encerrado.");
				break;
				
				default:
					System.out.println("Opção inválida.");
					
			}
			
			} catch (InputMismatchException e ) {
				
				System.out.println("Digite apenas números.");

				scan.nextLine();
				
				opcao = - 1;
			}
			
		} while (opcao != 0);
		
		scan.close();
		
		
		
	}
}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
		
	
	
			
			
			
		
		
	



