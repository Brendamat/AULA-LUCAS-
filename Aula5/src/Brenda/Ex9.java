package Brenda;

public class Ex9 {

	/*
	 * 1 A vista em dinheiro ou cheque 10%
	 * 2 A vista no cartao de crédito 15%
	 * 3 em duas x
	 * 4 mas de 2x 10% de juros
	 */
	
	public double core(double valor, int condicao) {
		double valorFinal;
		switch (condicao) {
		case 1:
			valorFinal= valor - 0.1 * valor;
			break;
		case 2:
			valorFinal= valor -0.15 * valor;
			break;
		case 3:
			valorFinal= valor;
			break;
		default:
			valorFinal= valor + 0.1 * valor;
			break;
		}
		return valorFinal;
	}
}
