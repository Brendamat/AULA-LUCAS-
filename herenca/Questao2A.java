package herenca;

public class Questao2A {
	private String nome;
	private String raca;
	
	//Construtor que ao criar um objeto não precisa passar um arguento
	public Questao2A() {
		
	}
	//Construtor que ao criar um objeto precisa passar um arguento referente ao nome do aniaml
	public Questao2A(String nome) {
		this.nome=nome;
	}
	
	public String caminha() {
		String output= "O animal de nome"+ this.nome+ "está caminhando!";
		return output;
	}//fim caminha
	
	public void setNome(String novo) {
		this.nome= novo;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setRaca (String tantoFaz) {
		this.raca=tantoFaz;
	}
	public String getRaca() {
		return this.raca;
	}
}
