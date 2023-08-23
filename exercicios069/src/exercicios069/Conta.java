package exercicios069;

public class Conta {
	private double nconta;
	private String name;
	private double vinicial;

	public Conta (double nconta, String name, Double vinicial) { // Construtor 
		this.nconta = nconta;
		this.name = name;
		this.vinicial = vinicial;
		}
	public Conta (double nconta, String name) { // Construtor 
		this.nconta = nconta;
		this.name = name;
		}

	public double getNconta() { // GETTER
		return nconta;
	}

	public String getName() { //GETTER
		return name;
	}

	public void setName(String name) { //SETTER
		this.name = name;
	}

	public double getVinicial() { //GETTER
		return vinicial;
	}

	
	public double deposito (double novovalor) {
		vinicial = vinicial + novovalor; 
		return vinicial;
		
	}
	
	public double retirada (double novovalorr) {
		vinicial = (vinicial - novovalorr) - 5 ; 
		return vinicial;
	}

	public String toString() {
		return " Numero da Conta: " + nconta + "\n " +"Nome do Titular: "+ name + "\n " + "Saldo: R$" + vinicial;

		}


}
