package perfil.saude;

import java.time.LocalDate;
import java.time.Period;

public class PerfilDeSaude {
    private final String nome;
    private final String sobrenome;
    private final String sexo;
    private final LocalDate dataNascimento;
    private final double altura;
    private final double peso;

    public PerfilDeSaude(String nome, String sobrenome, String sexo, LocalDate dataNascimento, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        return Period.between(dataNascimento, hoje).getYears();
    }

    public int calcularFrequenciaMaxima() {
        return 220 - calcularIdade();
    }

    public String calcularFrequenciaAlvo() {
        int freqMax = calcularFrequenciaMaxima();
        double alvoMin = freqMax * 0.50;
        double alvoMax = freqMax * 0.85;
        return String.format("%.0f - %.0f bpm", alvoMin, alvoMax);
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }
}

