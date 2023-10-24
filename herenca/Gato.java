package herenca;

public class Gato extends Questao2A {
	
	public String mia() {
		String saida= "O gato com nome "+super.getNome()+ " de raça "+super.getRaca()+ " está miando";
		return saida;
	}

}
