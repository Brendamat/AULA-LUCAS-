package estruturadeControleAndRepeticao;

import java.util.Scanner;

public class EstruturaControlePorSentinela {
private String nomeCurso;
	
	//construtor de classe 
	public EstruturaControlePorSentinela (String nome) {
		nomeCurso = nome;
		
	}
	
	//metodo para definir o nome do curso
	public void setnomeCurso (String nome) { //insere 
		nomeCurso = nome;
		
	} // fim do metodo setnomeCurso
	
	// metodo para recuperar o nome do curso
	public String getnomeCurso() { //inclui
		return nomeCurso;
		
	}//fim do metodo getnomeCurso
	
	//Vai exibir uma mensagem 
	public void MostrarMensagem () {
		System.out.printf("Bem vindo ao livro de Notas: %s\n", getnomeCurso ());
	
		}
	//determina a media de classe com base em 10 notas
	public void determinaMediaClass () {
		Scanner input= new Scanner (System.in);
		int total=0; //soma notas iseridas pelo usuario
		int contadorNotas=0; //numero da notas a ser inseridas a seguir
		int nota; //valor da nota inserida pelo usuario
		double media; //media das notas
	
		//fase de processamento 
		//solicita entrada e le a nota do usuario 
		System.out.println(" Entre com a nota: ");
		nota=input.nextInt ();
		
		// faz o loop ate ler o valor de sentinela inserido pelo usuario
		while (nota !=-1) {//inicio while
			total+=nota;
			contadorNotas++; //acrescenta 1 na variavel contadorNotas 
			
			//torna ler uma nova nota ou -1 para sair do loop
			System.out.print ("Entre cm a nota ou -1 para sair do loop");
			nota=input.nextInt ();
		} // fim while
		
		//testa se o usuario inseriu pelo menos uma nota
		if (contadorNotas>0) {
			media=total/contadorNotas; //calculando a media
			System.out.println ("Media da turma "+ getnomeCurso ()+ "e: "+media);
	}
		else {
			System.out.println ("Nenhuma nota foi inserida");
		}
		

} // fim do metodo determinaMediaClasse 


}
