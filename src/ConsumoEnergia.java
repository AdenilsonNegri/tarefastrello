import java.util.ArrayList;
import java.util.Scanner;

public class ConsumoEnergia {
    public static void main(String[] args) {
        ArrayList<Double> consumos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        final double LIMITE_SUSTENTAVEL = 200.0;

        System.out.println("Cadastro do Consumo de Energia Mensal (kWh)");
        System.out.println("Informe o consumo de energia de cada mês (12 meses):\n");

        for (int i = 0; i < 12; i++) {
            double consumo;
            while (true) {
                System.out.print("Mês " + (i + 1) + ": ");
                if (scanner.hasNextDouble()) {
                    consumo = scanner.nextDouble();
                    if (consumo >= 0) {
                        break;
                    } else {
                        System.out.println("O consumo não pode ser negativo. Tente novamente.");
                    }
                } else {
                    System.out.println("Entrada inválida. Digite um número válido.");
                    scanner.next();
                }
            }
            consumos.add(consumo);
        }

        double soma = 0.0;
        for (double consumo : consumos) {
            soma += consumo;
        }
        double media = soma / consumos.size();

        System.out.printf("\nConsumo médio anual: %.2f kWh/mês\n", media);

        if (media > LIMITE_SUSTENTAVEL) {
            System.out.println("Atenção: Sua casa está consumindo mais energia do que o limite sustentável de "
                    + LIMITE_SUSTENTAVEL + " kWh/mês.");
        } else {
            System.out.println("Parabéns! Seu consumo está dentro do limite sustentável.");
        }
    }
}

