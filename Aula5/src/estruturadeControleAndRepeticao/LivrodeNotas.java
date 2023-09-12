package estruturadeControleAndRepeticao;

import java.util.Scanner;
public class LivrodeNotas {
	
	private String nomeCurso;
	
	//construtor de classe 
	public LivrodeNotas (String nome) {
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
		int total=0; //soma notas inseridas pelo usuario
		int contadorNotas=1; //numero da nota a ser inserida a seguir 
		int nota;// valor da nota inserida pelo usuario 
		double media; //media das notas 
		
		while (contadorNotas <=10) {//faz o laço 10x
			System.out.printf("Insira a Nota %d: ", contadorNotas);
			nota= input.nextInt ();
			total+=nota; //adiciona a nota ao total 
			contadorNotas ++;
		}
		
		media=total/10;
		System.out.println("Media da turma" + getnomeCurso () + "e: " +media);
		
		
	}
		

}
