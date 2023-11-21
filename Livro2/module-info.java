module ItemBibliotecaa {
	
	public class ItemBiblioteca {
	    private String titulo;
	    private int anoPublicacao;

	    public ItemBiblioteca(String titulo, int anoPublicacao) {
	        this.titulo = titulo;
	        this.anoPublicacao = anoPublicacao;
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public int getAnoPublicacao() {
	        return anoPublicacao;
	    }

	    public void setAnoPublicacao(int anoPublicacao) {
	        this.anoPublicacao = anoPublicacao;
	    }

	    public void mostrarInfo() {
	        System.out.println("Título: " + titulo);
	        System.out.println("Ano de publicação: " + anoPublicacao);
	    }
	}
}