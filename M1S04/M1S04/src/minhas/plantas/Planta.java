package minhas.plantas;

public class Planta {
    private final String nome;
    private final String tipo;
    private final double necessidadeDeAgua;

    public Planta(String nome, String tipo, double necessidadeDeAgua) {
        this.nome = nome;
        this.tipo = tipo;
        this.necessidadeDeAgua = necessidadeDeAgua;
    }

    public void calcularNecessidadeDeAgua(int qtdSemanas, double areaCultivo) {
        double totalAgua = necessidadeDeAgua * areaCultivo * qtdSemanas;
        System.out.println("A planta " + nome + " do tipo " + tipo + " precisa de " + totalAgua + " litros de água para " + qtdSemanas + " semana(s), em uma área de " + areaCultivo + " m².");
    }

    public void irrigar() {
        System.out.println("A planta " + nome + " foi irrigada com sucesso!");
    }

    public void exibirInformacoes() {
        System.out.println("Nome da planta: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Necessidade de água por m² por semana: " + necessidadeDeAgua + " litros");
    }
}

