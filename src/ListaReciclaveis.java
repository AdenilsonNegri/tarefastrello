import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListaReciclaveis {
    public static void main(String[] args) {

        ArrayList<String> materiaisReciclaveis = new ArrayList<>(Arrays.asList(
                "papel", "papelao", "plástico", "plastico", "vidro", "metal", "aluminio", "alumínio", "ferro", "aço", "embalagem longa vida"
        ));

        ArrayList<String> categorias = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Categorias de Itens Recicláveis (máx. 5 categorias)");
        System.out.println("Categorias aceitas: " + materiaisReciclaveis);
        System.out.println(" Não são aceitos itens como: Lixo químico, Lixo Orgânico, Resíduos contaminantes, Resíduos hospitalares, Rejeitos, etc.");
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da categoria " + (i + 1) + ": ");
            String categoria = scanner.nextLine().trim().toLowerCase();

            if (categoria.isEmpty()) {
                System.out.println("Categoria vazia não pode ser adicionada. Tente novamente.");
                i--;
                continue;
            }

            if (!materiaisReciclaveis.contains(categoria)) {
                System.out.println(" \"" + categoria + "\" não é uma categoria reciclável válida. Tente novamente.");
                System.out.println("Categorias válidas: " + materiaisReciclaveis + "\n");
                i--;
                continue;
            }

            categorias.add(capitalize(categoria));

            if (i < 4) {
                System.out.print("Deseja adicionar outra categoria? (s/n): ");
                String resposta = scanner.nextLine().trim();
                if (resposta.equalsIgnoreCase("n")) {
                    break;
                }
            }
        }

        System.out.println("\n Categorias de Itens Recicláveis Cadastradas:");
        for (String item : categorias) {
            System.out.println("- " + item);
        }

        scanner.close();
    }

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
