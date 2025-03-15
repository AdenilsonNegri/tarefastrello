package meus.animais;

public class Ave extends Animal {
    public Ave(String nome, String habitat, String som, String tipoDeAlimentacao) {
        super(nome, habitat, som, tipoDeAlimentacao);
    }

    @Override
    public void comportamentoEspecial() {
        System.out.println(nome + " está voando.");
    }
}
