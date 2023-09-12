package EstruturaDeControle;

public class EstruturaWhile {
	public void loop () {
		
		int contador=0;
		int acumulador=0;
		while (contador <5) {
			acumulador+=contador; //acumulador= acumulador + contador 
			contador++; //contador = contador +1
		}//fim while 
		
		System.out.println ("Acumuador: "+acumulador);
	}

}
