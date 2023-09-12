package EstruturaDeControle;


import java.util.Scanner;
public class EstruturaIfElseTEST {
	
	public static void main (String args[]) { //main usa pra fazer teste 
		EstruturaIfElse obj= new EstruturaIfElse(); //criando objeto
		Double nota;
		Scanner input= new Scanner (System.in);
		//pegando dados do usuario
		System.out.print("Digite a nota: ");
		nota= input.nextDouble ();
		String resultado= obj.avaliacao(nota);
		String mencao= obj.mencaoAluno (nota);
		System.out.println("O aluno foi "+ resultado + "com "+ mencao);
		
		
		
	}

}
