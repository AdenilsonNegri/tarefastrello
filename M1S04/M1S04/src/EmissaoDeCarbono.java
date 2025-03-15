public class EmissaoDeCarbono {

    private final String atividade;
    private final double quantidadeEmissao;

    public EmissaoDeCarbono(String atividade, double quantidadeEmissao) {
        this.atividade = atividade;
        this.quantidadeEmissao = quantidadeEmissao;
    }

    public double calcularEmissaoCO2(double minutos) {
        double horas = minutos / 60.0;
        return quantidadeEmissao * horas;
    }

    public void exibirInformacoes(double minutos) {
        double totalCO2 = calcularEmissaoCO2(minutos);
        System.out.println("Atividade: " + atividade);
        System.out.println("Tempo: " + minutos + " minutos");
        System.out.printf("Emissão estimada de CO2: %.2f kg\n", totalCO2);
    }

    public static void main(String[] args) {
        EmissaoDeCarbono dirigir = new EmissaoDeCarbono("Dirigir carro (gasolina)", 2.31);
        EmissaoDeCarbono assistirTv = new EmissaoDeCarbono("Assistir TV", 0.088);
        EmissaoDeCarbono computador = new EmissaoDeCarbono("Usar computador", 0.05);

        dirigir.exibirInformacoes(90);
        System.out.println("--------------------------");
        assistirTv.exibirInformacoes(90);
        System.out.println("--------------------------");
        computador.exibirInformacoes(90);
    }
}
