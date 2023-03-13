public class Ave extends Animal implements Alimentavel{
    private String tipoBico;

    public Ave(String nome, int idade, String especie, boolean alimentado, String tipoBico) {
        super(nome, idade, especie, alimentado);
        this.tipoBico = tipoBico;
    }

    public String getTipoBico() {
        return tipoBico;
    }

    public void emitirSom() {
        System.out.println("Som de ave");
    }

    @Override
    public void alimentar() {
        isAlimentado(true);
        System.out.println("Animal foi alimentado");
    }
}
