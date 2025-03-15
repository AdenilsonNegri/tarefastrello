package meus.animais;

public class Reptil extends Animal {
    public Reptil(String nome, String habitat, String som, String tipoDeAlimentacao) {
        super(nome, habitat, som, tipoDeAlimentacao);
    }

    @Override
    public void comportamentoEspecial() {
        System.out.println(nome + " está rastejando.");
    }
}
