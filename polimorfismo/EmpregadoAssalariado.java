package polimorfismo;

public class EmpregadoAssalariado extends Empregado {
	private double salarioSemanal;
	public EmpregadoAssalariado(double salarioSemanal, String primeiroNome,
			String ultimoNome, String cpf) {
		super(primeiroNome, ultimoNome, cpf);
		this.setSalarioSemanal(salarioSemanal);
		
	} //fim do construtor
	
	public double getSalarioSemanal () {
		return salarioSemanal;
	}
	public void setSalarioSemanal (double salarioSemanal) {
		this.salarioSemanal = salarioSemanal <0.0 ? 0.0 : salarioSemanal;
	}
	public double vencimento() {
		return this.getSalarioSemanal () * 4; 
	}
	
	public String toString() {
		return String.format("****Empregado Assalariado*****\n"
				+ "%s"
				+ "Salário Semanal: %.2f\n", super.toString(), this.getSalarioSemanal());
		
	}

} // fim da classe 
