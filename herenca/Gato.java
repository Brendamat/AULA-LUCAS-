package herenca;

public class Gato extends Questao2A {
	
	public String mia() {
		String saida= "O gato com nome "+super.getNome()+ " de ra�a "+super.getRaca()+ " est� miando";
		return saida;
	}

}
