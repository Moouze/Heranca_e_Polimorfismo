package exPooHeranca;

public class pessoaJuridica extends Cliente{
	
	String cnpj;
	String tipoDeCartao;
	
	
	
	public pessoaJuridica(String nome, int idade, String rg, String cnpj, String tipoDeCartao) {
		super(nome, idade, rg);
		this.cnpj = cnpj;
		this.tipoDeCartao = tipoDeCartao;
	}



	public String getCnpj() {
		return cnpj;
	}



	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
				"\nCPF: "+cnpj+
				"\nTipo de Cartão: "+tipoDeCartao);
	
	}

}
