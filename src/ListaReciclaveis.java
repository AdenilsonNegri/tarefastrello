import java.util.ArrayList;
import java.util.Scanner;

public class ListaReciclaveis {
    public static void main(String[] args) {

        ArrayList<String> categorias = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Categorias de Itens Recicláveis (máx. 5 categorias)");

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da categoria " + (i + 1) + ": ");
            String categoria = scanner.nextLine();

            if (!categoria.trim().isEmpty()) {
                categorias.add(categoria);
            } else {
                System.out.println("Categoria vazia não pode ser adicionada. Tente novamente.");
                i--;
            }

            if (i < 4) {
                System.out.print("Deseja adicionar outra categoria? (s/n): ");
                String resposta = scanner.nextLine();
                if (resposta.equalsIgnoreCase("n")) {
                    break;
                }
            }
        }

        System.out.println("\nCategorias de Itens Recicláveis Cadastradas:");
        for (String item : categorias) {
            System.out.println("- " + item);
        }
    }
}

