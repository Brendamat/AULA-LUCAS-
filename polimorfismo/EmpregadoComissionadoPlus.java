package polimorfismo;

public class EmpregadoComissionadoPlus extends EmpregadoComissionado {
	
	private double salarioBase;
	
	public EmpregadoComissionadoPlus(double salarioBase, double vendasBruta, double pctComissao,
			String primeiroNome, String ultimoNome, String cpf) {
		super(vendasBruta, pctComissao, primeiroNome, ultimoNome, cpf);
		this.setSalarioBase(salarioBase);
	}// fim construtor 

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = (salarioBase <=0.0) ? 1530.0 : salarioBase;
	}
	
	public double vencimento() {
		//getVendasBruta * getHoras + getSalarioBase 
		return super.vencimento() + this.getSalarioBase();
	}
	
	public String toString() {
		return String.format("****Empregado Comissionado Plus*****\n"
				+ "%s"
				+ "Salário Base: %.2f\n", super.toString(), this.getSalarioBase());
}
	

} // fim classe
