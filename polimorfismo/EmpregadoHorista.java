package polimorfismo;

public class EmpregadoHorista extends Empregado {
	private double ValorHora;
	private double horas;
	
	public EmpregadoHorista(double valorHora, double horas,
			String primeiroNome, String ultimoNome, String cpf) {
		
		super(primeiroNome, ultimoNome, cpf);	
		this.setValorHora(valorHora);
		this.setHoras(horas);
	}// fim do construtor

	public double getValorHora() {
		return ValorHora;
	}

	public void setValorHora(double valorHora) {
		this.ValorHora = (valorHora <=0.0) ? 0.1 : valorHora;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = (horas <= 0.0) ? 1.0 : horas;
	}
	//qtd horas mensais 
	public double vencimento() {
		return this.getHoras() * this.getValorHora();		
	}
	
	public String toString() {
		return String.format("****Empregado Horista*****\n"
				+ "%s"
				+ "Valor Hora: %.2f\n"
				+ "QTD Horas: %.2f\n", super.toString(), this.getValorHora(), this.getHoras());
	}

}// fim da classe 
