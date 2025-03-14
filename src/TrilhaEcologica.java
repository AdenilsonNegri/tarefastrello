import java.util.ArrayList;
import java.util.Scanner;

public class TrilhaEcologica {
    public static void main(String[] args) {
        ArrayList<String> paradas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema de Cadastro de Paradas para a Trilha Ecológica!");

        boolean continuar = true;

        while (continuar) {
            System.out.print("\nDigite o nome da nova parada (ex: Mirante do Sol, Lagoa Azul): ");
            String novaParada = scanner.nextLine().trim();

            if (novaParada.isEmpty()) {
                System.out.println("O nome da parada não pode ser vazio. Tente novamente.");
                continue;
            }

            if (!paradas.isEmpty()) {
                System.out.println("\nAtualmente, o itinerário está assim:");
                for (int i = 0; i < paradas.size(); i++) {
                    System.out.println((i + 1) + " - " + paradas.get(i));
                }

                var posicao = -1;
                while (true) {
                    System.out.print("\nEm qual posição deseja inserir esta parada? (1 até " + (paradas.size() + 1) + "): ");
                    if (scanner.hasNextInt()) {
                        posicao = scanner.nextInt();
                        scanner.nextLine();
                        if (posicao >= 1 && posicao <= paradas.size() + 1) {
                            break;
                        } else {
                            System.out.println("Posição inválida! Tente novamente.");
                        }
                    } else {
                        System.out.println("Digite um número válido!");
                        scanner.nextLine();
                    }
                }

                paradas.add(posicao - 1, novaParada);
                System.out.println("Parada \"" + novaParada + "\" adicionada na posição " + posicao + "!");
            } else {

                paradas.add(novaParada);
                System.out.println("Primeira parada \"" + novaParada + "\" adicionada!");
            }

            System.out.print("\nDeseja adicionar outra parada? (s/n): ");
            String resposta = scanner.nextLine().trim().toLowerCase();
            if (resposta.equals("n")) {
                continuar = false;
            }
        }

        System.out.println("\nItinerário Completo da Trilha Ecológica:");
        for (int i = 0; i < paradas.size(); i++) {
            System.out.println((i + 1) + " - " + paradas.get(i));
        }

        System.out.println("\nBoa trilha e aproveite a natureza!");
        scanner.close();
    }
}

