public class MidiaDigital extends ItemBiblioteca {
    private String formato;

    public MidiaDigital(String titulo, int anoPublicacao, String formato) {
        super(titulo, anoPublicacao);
        this.formato = formato;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Formato: " + formato);
    }
}