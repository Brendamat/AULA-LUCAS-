package polimorfismo;

public class TESTPolimorfico {
	
	public static void main (String args[]) {
		
		EmpregadoAssalariado obj1 = new EmpregadoAssalariado (2000, "Maria", "Fernanda", "0123456789-10");
		EmpregadoHorista obj2 = new EmpregadoHorista (20, 40, "Pedro", "Silva", "1123456789-10");
		EmpregadoComissionado obj3 = new EmpregadoComissionado (1000, 0.05, "Joana", "Ferreira", "234567899-10");
		EmpregadoComissionadoPlus obj4 = new EmpregadoComissionadoPlus (1200, 20000, 0.03, "Luana", "Silva", "334567899-10");
   
	System.out.printf("%s Vencimento: %.2f\n\n", obj1, obj1.vencimento());
	System.out.printf("%s Vencimento:  %.2f\n\n", obj2, obj2.vencimento());
	System.out.printf("%s Vencimento: %.2f\n\n", obj3, obj3.vencimento());
	System.out.printf("%s Vencimento:  %.2f\n\n", obj4, obj4.vencimento());
	
	Empregado [] empregados= new Empregado[4];
	empregados[0] = obj1;
	empregados[1] = obj2;
	empregados[2] = obj3;
	empregados[3] = obj4;
	
	for(Empregado empregadoCorrente : empregados) {
		
		if(empregadoCorrente instanceof EmpregadoComissionadoPlus) {
			EmpregadoComissionadoPlus empregado= (EmpregadoComissionadoPlus) empregadoCorrente;
			empregado.setSalarioBase(1.10* empregado.getSalarioBase());
			System.out.printf("Novo vencimento:%.2f\n", empregado.vencimento());
			
		}//fim if
		
	  }//fim do for 
	
	}//fim do main 
		
		
}
