package herenca;

public class Cachorro extends Questao2A{
	
public String late() {
	String saida= "O cachorro com nome "+ super.getNome()+" de ra�a "+super.getRaca()+ " est� latindo";
	return saida;
   }
}
