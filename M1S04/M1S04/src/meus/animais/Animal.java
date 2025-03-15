package meus.animais;

public abstract class Animal {
    protected String nome, habitat, som, tipoDeAlimentacao;

    public Animal(String nome, String habitat, String som, String tipoDeAlimentacao) {
        this.nome = nome;
        this.habitat = habitat;
        this.som = som;
        this.tipoDeAlimentacao = tipoDeAlimentacao;
    }

    public void mover() {
        System.out.println(nome + " está se movendo em " + habitat);
    }

    public void emitirSom() {
        System.out.println(nome + " faz o som: " + som);
    }

    public void alimentar() {
        if (tipoDeAlimentacao.equalsIgnoreCase("Herbívoro"))
            System.out.println(nome + " está comendo plantas.");
        else if (tipoDeAlimentacao.equalsIgnoreCase("Carnívoro"))
            System.out.println(nome + " está comendo carne.");
        else
            System.out.println("Alimentação indefinida.");
    }

    public abstract void comportamentoEspecial();
}
