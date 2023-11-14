package polimorfismo;

public class EmpregadoComissionado extends Empregado {
	private double vendasBruta;
	private double pctComissao;
	public EmpregadoComissionado(double vendasBruta, double pctComissao,
			String primeiroNome, String ultimoNome, String cpf) {
		super (primeiroNome, ultimoNome, cpf);	
	}// fim do construtor
	
	public double getVendasBruta() {
		return vendasBruta;
	}
	public void setVendasBruta(double vendasBruta) {
		this.vendasBruta = (vendasBruta <0.0) ? 0.0: vendasBruta;
	}
	public double getPctComissao() {
		return pctComissao;
	}
	public void setPctComissao(double pctComissao) {
		this.pctComissao = (pctComissao <=0.0) ? 0.01 : pctComissao;
	}
	
	public double vencimento() {
		return this.getPctComissao() * this.getVendasBruta();
	}
	
	public String toString() {
			return String.format("****Empregado Comissionado*****\n"
					+ "%s"
					+ "Comissao: %.2f\n"
					+ "Vendas: %.2f\n", super.toString(), this.getPctComissao(), this.getVendasBruta());
	}

	
}//fim da classe
