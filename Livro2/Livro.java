
public class Livro extends ItemBiblioteca {
    private String autor;

    public Livro(String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Autor: " + autor);
    }
}
