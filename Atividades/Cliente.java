package exPooHeranca;

public class Cliente {

	private String nome;
	private int idade;
	private String rg;
	
	
	public Cliente(String nome, int idade, String rg) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}
	 
	public void ShowInfo() {
		System.out.println("\nNome do cliente: "+nome+
				"Idade: "+idade+
				"RG: "+rg);
	}
	
}
