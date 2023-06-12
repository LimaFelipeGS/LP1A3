import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Listas {
    public int numlista;
    List<String> lista1 = new ArrayList<>();
    List<String> lista2 = new ArrayList<>();
    List<String> lista3 = new LinkedList<>();

    // Funções para adicionar elementos às listas
    public void addLista1() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Adicione um registro à Lista 1");
        String registro = scan.nextLine();
        try {
            char[] chars = registro.toCharArray();
            for (char c : chars) {
                if (Character.isDigit(c)) {
                    throw new Exception("O registro não pode conter números.");
                }
            }
            lista1.add(registro);
            System.out.println("Registro adicionado com sucesso.");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void addLista2() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Adicione um registro à Lista 2");
        String registro = scan.nextLine();
        try {
            char[] chars = registro.toCharArray();
            for (char c : chars) {
                if (Character.isDigit(c)) {
                    throw new Exception("O registro não pode conter números");
                }
            }
            lista2.add(registro);
            System.out.println("Registro adicionado com sucesso.");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void addLista3() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Adicione um registro à Lista 3");
        String registro = scan.nextLine();
        try {
            char[] chars = registro.toCharArray();
            for (char c : chars) {
                if (Character.isDigit(c)) {
                    throw new Exception("O registro não pode conter números");
                }
            }
            lista3.add(registro);
            System.out.println("Registro adicionado com sucesso.");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Função para mostrar a lista 1
    public void viewLista1() {
        int i;
        System.out.println("Lista 1:");
        for (i = 0; i < lista1.size(); i++) {
            System.out.println(lista1.get(i));
        }
    }
}
