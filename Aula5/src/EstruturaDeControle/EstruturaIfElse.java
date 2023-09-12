package EstruturaDeControle;

public class EstruturaIfElse {
	
	public String mencaoAluno(double notaAluno) {
		String aux;
		if (notaAluno >=9) {  //executa todos maiores 9
			aux= "SS";
		}
		else if (notaAluno >=8 && notaAluno <9) { //maior que 8, menos que 9; executa o if e else se for Falso ele continua, se for Verd. ele para
			aux= "MS";
		}
		else if (notaAluno >=7 && notaAluno <8) { //mesno comentario da linha de cima
			aux= "MM";
		}
		else { //caso a nota não tenha se encaixado em nenhuma das opções a cima
			aux="MN";
		}
		return aux;
	}
	
	public String mencaoAluno2 (double nota) {//mesma logica do if else casa a condição; break False - continua; break Verd. ele para.
		String aux="";
		switch ((int)nota) {
		case 9:
			aux= "SS";
			break;
		case 8:
			aux= "MS";
			break;
		case 7:
			aux= "MM";
			break;
		default:
			aux= "MN";
			break;
		}//fim swith
		return aux;
	}// fim do metodo

	public String avaliacao(double notaAluno) {
		String mencao;
		if(notaAluno >=7) {
			mencao= "Aprovado";
		}
		else {//nota menor que 7
			mencao="Reprovado";
		}
		
		return mencao; 
	}
}
