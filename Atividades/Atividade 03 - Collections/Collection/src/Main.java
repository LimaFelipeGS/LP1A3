import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Listas listas = new Listas();

        // Usuário terá que adicionar dois registros a cada lista
        listas.addLista1();
        listas.addLista1();

        listas.addLista2();
        listas.addLista2();

        listas.addLista3();
        listas.addLista3();

        // Adicionar todos os registros das listas 2 e 3 à lista 1
        listas.lista1.addAll(listas.lista2);
        listas.lista1.addAll(listas.lista3);

        // Verifica se a lista 1 possui algum elemento da lista 2
        System.out.println(listas.lista1.contains(listas.lista2));

        // Verifica se todos os elementos da lista 3 estão na lista 1
        System.out.println(listas.lista1.containsAll(listas.lista3));

        // Verifica se a lista 1 é igual a lista 2
        System.out.println(listas.lista1.equals(listas.lista2));

        // Mostra o segundo elemento de cada lista
        System.out.println(listas.lista1.get(1));
        System.out.println(listas.lista2.get(1));
        System.out.println(listas.lista3.get(1));


        // Remove o elemento RegRemove da lista 3
        listas.lista3.remove("RegRemove");

        // Remove todos os elementos da lista 3 que estão na lista 1
        listas.lista1.removeAll(listas.lista3);

        // Verifica o tamanho da lista 1
        System.out.println(listas.lista1.size());

        // Limpa a lista 3
        listas.lista3.clear();

        // Verifica se a lista 3 está vazia
        System.out.println(listas.lista3.isEmpty());

        // Mostra cada elemento da lista 1
        listas.viewLista1();
    }
}