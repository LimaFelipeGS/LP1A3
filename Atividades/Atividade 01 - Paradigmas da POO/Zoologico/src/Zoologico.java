import java.util.ArrayList;
import java.util.List;

public class Zoologico{
    private List<Animal> animais;

    List<Animal> ListaZoológico = new ArrayList<>();

    public void adicionarAnimal(Animal animal) {
        ListaZoológico.add(animal);
    }

    public void listarAnimais() {
        int i;
        for (i = 0; i < ListaZoológico.size(); i++) {
            ListaZoológico.get(i).getNome();
        }
    }

    public void alimentarAnimais() {
        int i;
        for (i =  0; i < ListaZoológico.size(); i++) {
            ListaZoológico.get(i).alimentar();
        }
    }
}
