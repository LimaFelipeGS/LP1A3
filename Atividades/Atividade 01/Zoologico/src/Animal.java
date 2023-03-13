public abstract class Animal implements Alimentavel{
    private String nome;
    private int idade;
    private String especie;
    private boolean alimentado;

    public Animal(String nome, int idade, String especie, boolean alimentado) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.alimentado = alimentado;
    }

    public String getNome() {
        System.out.println(nome);
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void isAlimentado(boolean b) {
        alimentado = true;
    }

    public abstract void emitirSom();
}
