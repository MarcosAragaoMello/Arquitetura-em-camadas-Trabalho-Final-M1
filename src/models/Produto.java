package models;

public class Produto {
	
	private long id;
	private String nome;
	private double valor;
	private long quantidade;
	private String categoria;
	
	 private static long contador = 0;
	 
	
    // CONSTRUDOR VAZIO 

	public Produto() {
		
	}
	
	// CONSTRUTOR PARA CADASTRO 
	

	public Produto( String nome, double valor, long quantidade, String categoria) {
		super();
		this.id =++contador;
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
		this.categoria = categoria;
		
		
	}
	
	// CONSTRUTOR COMPLETO 
	
	
	 public Produto(long id, String nome, double valor, long quantidade, String categoria) {

	        this.id = id;
	        this.nome = nome;
	        this.valor = valor;
	        this.quantidade = quantidade;
	        this.categoria = categoria;
	    }
	

	public long getId() {
		return id;
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(long quantidade) {
		this.quantidade = quantidade;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public static long getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Produto.contador = contador;
	}
	
	
	
	

}
