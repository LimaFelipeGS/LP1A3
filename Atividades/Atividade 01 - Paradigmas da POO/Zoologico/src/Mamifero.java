public class Mamifero extends Animal implements Alimentavel{
    private int tempoGestacao;

    public Mamifero(String nome, int idade, String especie, boolean alimentado, int tempoGestacao) {
        super(nome, idade, especie, alimentado);
        this.tempoGestacao = tempoGestacao;
    }

    public int getTempoGestacao() {
        return tempoGestacao;
    }

    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

    @Override
    public void alimentar() {
        isAlimentado(true);
        System.out.println("Animal foi alimentado");
    }
}
