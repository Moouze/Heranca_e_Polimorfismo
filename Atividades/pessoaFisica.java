package exPooHeranca;

public class pessoaFisica extends Cliente{

	String cpf;
	String tipoDeCartao;
	
	
	public pessoaFisica(String nome, int idade, String rg, String cpf, String tipoDeCartao) {
		super(nome, idade, rg);
		this.cpf = cpf;
		this.tipoDeCartao = tipoDeCartao;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getTipoDeCartao() {
		return tipoDeCartao;
	}


	public void setTipoDeCartao(String tipoDeCartao) {
		this.tipoDeCartao = tipoDeCartao;
	}
	
	public void ShowInfo() {
		System.out.println("\nNome do cliente: "+getNome()+
				"\nIdade: "+getIdade()+
				"\nRG: "+getRg()+
				"\nCPF: "+cpf+
				"\nTipo de Cartão: "+tipoDeCartao);
	}
	
}
