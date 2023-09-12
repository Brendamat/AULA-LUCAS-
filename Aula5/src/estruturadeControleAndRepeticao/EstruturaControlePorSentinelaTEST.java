package estruturadeControleAndRepeticao;

public class EstruturaControlePorSentinelaTEST {
	public static void main (String args []) {
		//Criando o objeto da classe LivrodeNotas
		EstruturaControlePorSentinela objeto= new EstruturaControlePorSentinela ("LPOO");
		System.out.println("**Interação com o primeiro objeto**");
		objeto.MostrarMensagem ();
		objeto.determinaMediaClass();
		objeto.setnomeCurso ("algoritmos");
		
		System.out.println("**Interação com o segundo objeto**");
		EstruturaControlePorSentinela objeto1= new EstruturaControlePorSentinela ("IA");
		objeto1.MostrarMensagem ();
		objeto1.determinaMediaClass ();
		
		
	}

}


