import java.util.Scanner;

public class CalculadoraPAePG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial (inteiro): ");
        int valorInicial = scanner.nextInt();

        System.out.print("Digite a raiz (inteiro): ");
        int raiz = scanner.nextInt();

        System.out.print("Deseja calcular P.A. ou P.G.? Digite 'PA' ou 'PG': ");
        String tipo = scanner.next().toUpperCase();

        if (!tipo.equals("PA") && !tipo.equals("PG")) {
            System.out.println("Opção inválida! Por favor, escolha 'PA' ou 'PG'.");
            scanner.close();
            return;
        }

        System.out.println("\nOs 10 primeiros termos da " + tipo + " são:");

        int termo = valorInicial;
        for (int i = 0; i < 10; i++) {
            System.out.print(termo);
            if (i < 9) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }

            if (tipo.equals("PA")) {
                termo += raiz;
            } else {
                termo *= raiz;
            }
        }
    }
}

