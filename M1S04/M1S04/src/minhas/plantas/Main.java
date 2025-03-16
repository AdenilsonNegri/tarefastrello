package minhas.plantas;

public class Main {
    public static void main(String[] args) {

        Planta alface = new Planta("Alface", "Horta", 5.0);

        Planta macieira = new Planta("Macieira", "Frutífera", 15.0);

        alface.exibirInformacoes();
        macieira.exibirInformacoes();

        alface.calcularNecessidadeDeAgua(4, 10);
        macieira.calcularNecessidadeDeAgua(4, 10);

        alface.irrigar();
        macieira.irrigar();
    }
}

