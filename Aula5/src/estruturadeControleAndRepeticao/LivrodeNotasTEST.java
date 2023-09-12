package estruturadeControleAndRepeticao;

public class LivrodeNotasTEST {
	
	//metodo principal
			public static void main (String args []) {
				//Criando o objeto da classe LivrodeNotas
				LivrodeNotas objeto= new LivrodeNotas ("LPOO");
				System.out.println("**Interação com o primeiro objeto**");
				objeto.MostrarMensagem ();
				objeto.determinaMediaClass();
				objeto.setnomeCurso ("algoritmos");
				
				System.out.println("**Interação com o segundo objeto**");
				LivrodeNotas objeto1= new LivrodeNotas ("IA");
				objeto1.MostrarMensagem ();
				objeto1.determinaMediaClass ();
				
				
			}

}
