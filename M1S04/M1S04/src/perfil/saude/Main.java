package perfil.saude;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite o sexo (Masculino/Feminino): ");
        String sexo = scanner.nextLine();

        System.out.println("Digite a data de nascimento (ano-mês-dia): ");
        String dataNascimentoStr = scanner.nextLine();
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);

        System.out.println("Digite a altura em metros (ex: 1,75): ");
        double altura = scanner.nextDouble();

        System.out.println("Digite o peso em quilogramas (ex: 70,5): ");
        double peso = scanner.nextDouble();

        PerfilDeSaude perfil = new PerfilDeSaude(nome, sobrenome, sexo, dataNascimento, altura, peso);

        System.out.println("\nPerfil de Saúde:");
        System.out.println("Nome: " + perfil.getNome());
        System.out.println("Sobrenome: " + perfil.getSobrenome());
        System.out.println("Sexo: " + perfil.getSexo());
        System.out.println("Data de Nascimento: " + perfil.getDataNascimento());
        System.out.println("Altura: " + perfil.getAltura() + " metros");
        System.out.println("Peso: " + perfil.getPeso() + " kg");

        System.out.println("\nIdade: " + perfil.calcularIdade() + " anos");
        System.out.println("Frequência Cardíaca Máxima: " + perfil.calcularFrequenciaMaxima() + " bpm");
        System.out.println("Frequência Cardíaca Alvo: " + perfil.calcularFrequenciaAlvo());
        System.out.println("IMC (Índice de Massa Corporal): " + perfil.calcularIMC());
    }
}

