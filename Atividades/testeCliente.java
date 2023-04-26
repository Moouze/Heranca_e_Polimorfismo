package exPooHeranca;

public class testeCliente {

	public static void main(String[] args) {
		
		
	pessoaFisica Lucas = new pessoaFisica ("Lucas", 25, "00.000.000-0", "000.000.000-00", "Santander Fx");
	pessoaFisica Bianca = new pessoaFisica ("Bianca", 19, "01.001.001-1", "002.002.002-02", "Santander Fx");
   
   	Lucas.ShowInfo();
   	Bianca.ShowInfo();
   	
   	System.out.println("\n******************************************************************************************");
   	
   	
   	pessoaJuridica Jessica = new pessoaJuridica ("Jessica", 21, "03.003.003-3", "04.004.004/0004-04", "Santander Negócios e Empresas");
   	pessoaJuridica Bruno = new pessoaJuridica ("Bruno", 22, "05.005.005-5", "06.006.006/0006-06", "Santander Negócios e Empresas");
   	
   	
   	Jessica.ShowInfo();
   	Bruno.ShowInfo();

	}

}
