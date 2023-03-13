public class Reptil extends Animal implements Alimentavel{
    private double temperaturaCorporal;

    public Reptil(String nome, int idade, String especie, boolean alimentado, double temperaturaCorporal) {
        super(nome, idade, especie, alimentado);
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void emitirSom() {
        System.out.println("Som de Réptil");
    }

    @Override
    public void alimentar() {
        isAlimentado(true);
        System.out.println("Animal foi alimentado");
    }
}
