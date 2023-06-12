public class Main {

    public static void main(String args[]) {

        Mamifero gato = new Mamifero("Gato", 12, "Gato", false, 65);
        Ave tucano = new Ave("Tucano", 2, "Tucano", false, "Coletor");
        Reptil crocodilo = new Reptil("Crocodilo", 4, "Crocodilo", false, -10);

        Zoologico zoo = new Zoologico();

        zoo.adicionarAnimal(gato);
        zoo.adicionarAnimal(tucano);
        zoo.adicionarAnimal(crocodilo);

        zoo.listarAnimais();

        zoo.alimentarAnimais();
    }
}
