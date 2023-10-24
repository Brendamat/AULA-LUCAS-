package herenca;

public class Cachorro extends Questao2A{
	
public String late() {
	String saida= "O cachorro com nome "+ super.getNome()+" de raça "+super.getRaca()+ " está latindo";
	return saida;
   }
}
