public class Exemplo {
    public static void main(String[] args) {
        
        Livro livro = new Livro("O Senhor dos Anéis", 1954, "J.R.R. Tolkien");

        livro.mostrarInfo();

        Revista revista = new Revista("Revista Veja", 2023, 234);

        revista.mostrarInfo();

        MidiaDigital midiaDigital = new MidiaDigital("Filme", 2022, "Blu-ray");

      
        midiaDigital.mostrarInfo();
    }
}