import java.util.Scanner;

public class TemperaturaMediaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[7];
        double soma = 0;

        System.out.println("Digite a temperatura média registrada em cada dia da semana (em graus Celsius):");

        for (int i = 0; i < 7; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
            soma += temperaturas[i];
        }

                double media = soma / 7;

                System.out.printf("A temperatura média da semana foi: %.2f °C%n", media);

    }
}

