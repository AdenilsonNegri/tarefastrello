import java.time.LocalDate;
import java.time.Period;

public record FrequenciaCardiaca(String nome, String sobrenome, LocalDate dataNascimento) {

    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        return Period.between(this.dataNascimento, dataAtual).getYears();
    }

    public int calcularFrequenciaMaxima() {
        return 220 - calcularIdade();
    }

    public String calcularFrequenciaAlvo() {
        int freqMaxima = calcularFrequenciaMaxima();
        double alvoMin = freqMaxima * 0.50;
        double alvoMax = freqMaxima * 0.85;
        return String.format("%.0f - %.0f bpm", alvoMin, alvoMax);
    }
}

