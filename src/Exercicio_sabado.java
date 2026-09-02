import java.util.Scanner;

public class Exercicio_sabado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		// PREENCHIMENTO DE FICHARIO DE CADASTRO 
		
		
	/*	String nome;
		int idade;
		double cpf;
		String sexo;
		double altura;
		double peso;
		String  estadoCivil;
		String email;
		
		System.out.println("========== SITEMA DE FICHÁRIO ==========\n");
		
		System.out.println("Digite o seu nome:");
		nome = scan.nextLine();
		
		System.out.println("Digite sua idade:");
		idade = scan.nextInt();
		
		System.out.println("Digite o seu cpf:");
		cpf = scan.nextDouble();
		
		System.out.println("Digite o sexo:");
		sexo = scan.next();
		scan.nextLine(); // LIMPAR O ENTER 
		
		System.out.println("Digite sua altura:");
		altura = scan.nextDouble();
		
		
		System.out.println("Digite seu peso:");
		peso = scan.nextDouble();
		scan.nextLine(); // LIMPAR O ENTER 
	
		
		System.out.println("Digite seu Estado Civil:");
		estadoCivil = scan.nextLine();
		
		System.out.println("Digite seu email:");
		email = scan.nextLine();
		
		
		
		
		System.out.println("\n========== SISTEMA DE CADASTRO ==========");
		
		System.out.println("Nome:" + nome);
		
		System.out.println("Idade:" + idade);
		
		System.out.println("CPF:" + cpf);
		
		System.out.println("Sexo:" + sexo);
		
		System.out.println("Altura:" + altura);
		
		System.out.println("Peso:" + peso);
		
		System.out.println("Estado civil:" + estadoCivil);
		
		System.out.println("Email;" + email);*/
		
		
		// EXERCCICIO 02
		
	/*	
		// CONTROLE DE ESTOQUE 
		
		String nome1, nome2, nome3;
		int quantidade1, quantidade2, quantidade3;
		double valor1, valor2, valor3;
		
		System.out.println("========== SYSTEMA DE ESTOQUE =========\n"); // A LETRA N TEM QUE SER MENUSCULA 
		
		
		
		
		System.out.println("Cadastro do Produto 1\n"); //DÁ ESPAÇO ENTRE AS LINHAS 
		
		
		
		System.out.println("Digite o nome do produto:");
		nome1 = scan.nextLine();
		
		System.out.println("Digite a Quantidade:");
		quantidade1 = scan.nextInt();
		
		System.out.println("Digite o valor do produto:");
		valor1 = scan.nextDouble();
		scan.nextLine(); // LIMPAR O ENTER 
		
		System.out.println("\n");
		System.out.println("Cadastro do Produto 2\n");
		
		System.out.println("Digite o nome do produto:");
		nome2 = scan.nextLine();
		
		System.out.println("Digite a Quantidade:");
		quantidade2 = scan.nextInt();
		
		System.out.println("Digite o valor do Produto:");
		valor2 = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("\nCadastro do produto 3\n");
		
		System.out.println("Digite o nome do produto:");
		nome3 = scan.nextLine();
		
		System.out.println("Digite a Quantidade:");
		quantidade3 = scan.nextInt();
		
		System.out.println("Digite o valor do produto:");
		valor3 = scan.nextDouble();
		
		
		
		// CÁLCULOS
		
		double total1 = quantidade1 * valor1;
		double total2 = quantidade2 * valor2;
		double total3 = quantidade3 * valor3;
		
		double totalEstoque = total1 + total2 + total3;
		
		
		
		
		 
		System.out.println("\nCalculando o valor do Estoque\n");
		
		System.out.println("Valor total do produto" +  nome1  + ":R$" + total1);
		
		System.out.println("Valor total do Produto" +  nome2  + ":R$" + total2);
		
		System.out.println("valor total do produto" +  nome3  + ":R$" + total3);
		
		
		System.out.println("==================================================");
		System.out.println("Valor total do estoque:  R$ " + "totalEstoque");*/
		
		
		
		// EXERCICIO 3   SABADO 
		
		
		double num1, num2,resultado;
		int opção;
		
		
		
		
		System.out.println("===============================");
		
		System.out.println("\n     CACULADORA JAVA       \n");
		
		System.out.println("===============================\n");
		
		System.out.println("digite o primeiro número:");
		num1 = scan.nextDouble();
		
		System.out.println("digite o segundo numero:");
		num2 = scan.nextDouble();
		
		System.out.println("\nEscolha a operação desejada:");
		
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		
		System.out.println("Digite o número da operação:");
		opção = scan.nextInt();
		
		switch (opção) {    // SWITCH PARA OPCÕES = SWITCH (OPCAO) { NÃO PRECISA EM DE ; OU :
		
		case 1:
			resultado = num1 + num2;
			System.out.println("Operação escolhida: Soma");
			System.out.println("Resultado:" + resultado);
			break;
			
		case 2:   // CASE TEM QUE COLOCAR :
			resultado = num1 + num2;
			System.out.println("Operaçao escolhida: Subtração");
			System.out.println("Resultado:" + resultado);
			break;
			
		case 3:
			resultado = num1 + num2;
			System.out.println("Operação Escolhida: Multiplicação");
			System.out.println("Resultado:" + resultado);
			break;  //break " QUEBRA" É COM ;
			
		case 4:
			
			if (num2 != 0){	
				resultado  = num1 / num2;
				System.out.println("Operação Escolhida: Divisão");
				System.out.println("Resultado:" + resultado);
				
			} else {
				System.out.println("Erro! Não é possível dividir por zero");
			}
			break;
			
			default:
				System.out.println("Opção inválida!");
				
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				
			
			
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
