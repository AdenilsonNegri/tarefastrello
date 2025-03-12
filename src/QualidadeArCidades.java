import java.util.Scanner;

public class QualidadeArCidades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cidades = new String[5];
        int[] indicesQualidadeAr = new int[5];
        final int LIMITE_SEGURO = 100;

        System.out.println("Digite o nome de 5 cidades:");
        for (int i = 0; i < cidades.length; i++) {
            System.out.print("Cidade " + (i + 1) + ": ");
            cidades[i] = scanner.nextLine();
        }

        System.out.println("\nDigite o índice de qualidade do ar (IQA) para cada cidade:");
        for (int i = 0; i < indicesQualidadeAr.length; i++) {
            System.out.print("IQA de " + cidades[i] + ": ");
            indicesQualidadeAr[i] = scanner.nextInt();
        }

        System.out.println("\nCidades com índice de qualidade do ar acima do limite seguro (" + LIMITE_SEGURO + "):");
        boolean encontrou = false;
        for (int i = 0; i < indicesQualidadeAr.length; i++) {
            if (indicesQualidadeAr[i] > LIMITE_SEGURO) {
                System.out.println("- " + cidades[i] + " (IQA: " + indicesQualidadeAr[i] + ")");
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Todas as cidades estão dentro do limite seguro.");
        }
    }
}

