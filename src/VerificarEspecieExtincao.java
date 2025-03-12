import java.text.Normalizer;
import java.util.Scanner;

public class VerificarEspecieExtincao {
    public static void main(String[] args) {

        String[] especiesAmeacadas = {
                "Onça-pintada",
                "Tamanduá-bandeira",
                "Ararinha-azul",
                "Mico-leão-dourado",
                "Lobo-guará"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da espécie que deseja verificar:");
        String especieProcurada = scanner.nextLine().trim();

        String especieProcuradaNormalizada = normalizarTexto(especieProcurada);

        boolean encontrada = false;
        String especieEncontrada = "";

        for (String especie : especiesAmeacadas) {
            String especieNormalizada = normalizarTexto(especie);
            if (especieNormalizada.equals(especieProcuradaNormalizada)) {
                encontrada = true;
                especieEncontrada = especie;
                break;
            }
        }

        if (encontrada) {
            System.out.println("A espécie \"" + especieEncontrada + "\" está em risco de extinção.");
        } else {
            System.out.println("A espécie \"" + especieProcurada + "\" NÃO está na lista de espécies em risco de extinção.");
        }

        scanner.close();
    }

    public static String normalizarTexto(String texto) {
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        texto = texto.replace("-", " ").toLowerCase().trim().replaceAll("\\s+", " ");
        return texto;
    }
}
