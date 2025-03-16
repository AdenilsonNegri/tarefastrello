import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite a data de nascimento:");
        System.out.print("Ano (ex: 1990): ");
        int ano = scanner.nextInt();

        System.out.print("Mês (ex: 5): ");
        int mes = scanner.nextInt();

        System.out.print("Dia (ex: 23): ");
        int dia = scanner.nextInt();

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        FrequenciaCardiaca pessoa = new FrequenciaCardiaca(nome, sobrenome, dataNascimento);

        System.out.println("\n===== Informações Pessoais =====");
        System.out.println("Nome completo: " + pessoa.nome() + " " + pessoa.sobrenome());
        System.out.println("Data de nascimento: " + pessoa.dataNascimento());
        System.out.println("Idade: " + pessoa.calcularIdade() + " anos");
        System.out.println("Frequência cardíaca máxima: " + pessoa.calcularFrequenciaMaxima() + " bpm");
        System.out.println("Frequência cardíaca alvo: " + pessoa.calcularFrequenciaAlvo());

        scanner.close();
    }
}

