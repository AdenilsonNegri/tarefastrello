package meus.animais;

public class Mamifero extends Animal {
    public Mamifero(String nome, String habitat, String som, String tipoDeAlimentacao) {
        super(nome, habitat, som, tipoDeAlimentacao);
    }

    @Override
    public void comportamentoEspecial() {
        System.out.println(nome + " está amamentando.");
    }
}

