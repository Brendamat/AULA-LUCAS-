public class Revista extends ItemBiblioteca {
    private int edicao;

    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Edição: " + edicao);
    }
}
