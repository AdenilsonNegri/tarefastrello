public class Arvore {

    private final String nome;
    private final String tipo;
    private final double altura;

    public Arvore(String nome, String tipo, double altura) {
        this.nome = nome;
        this.tipo = tipo;
        this.altura = altura;
    }

    public void exibirInformacoes() {
        System.out.println("Informações da Árvore:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Altura: " + altura + " metros");
    }

    public double calcularOxigenio() {
        return altura * 10;
    }

    public static void main(String[] args) {
        Arvore minhaArvore = new Arvore("Ipê Amarelo", "Folhosa", 15.0);

        minhaArvore.exibirInformacoes();

        double oxigenioProduzido = minhaArvore.calcularOxigenio();
        System.out.printf("Quantidade de oxigênio produzido por dia: %.2f gramas\n", oxigenioProduzido);
    }
}
