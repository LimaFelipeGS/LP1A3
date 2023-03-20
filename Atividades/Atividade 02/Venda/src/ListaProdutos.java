import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaProdutos {
    private List<Produto> produtos;

    List<Produto> Lista = new ArrayList<>();

    public void addProduto(Produto produto) {
        Lista.add(produto);
    }

    public void mostrarLista() {
        try {
            if (Lista.size() == 0) {
                throw new Exception("Lista Vazia!");
            } else {
                int i;
                for (i = 0; i < Lista.size(); i++) {
                    System.out.print(Lista.get(i).getId() + " - ");
                    System.out.println(Lista.get(i).getNome());
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void vender() {
        Scanner scan = new Scanner(System.in);
        int igual = 100;

        System.out.println("Selecione o número do produto: ");
        int idprod = scan.nextInt();
        try{
            int i;
            for (i = 0; i < Lista.size(); i++) {
                if (idprod == Lista.get(i).getId()) {
                    igual = i;
                }
                if (igual == 110){
                    throw new Exception("Produto Inexistente!");
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Informe o valor a pagar: ");
        double precoprod = scan.nextDouble();
        try{
            if(precoprod >= Lista.get(igual).getPreco()) {
            }
            else {
                throw new Exception("Valor Insuficiente!");
            }
            System.out.println("Venda Realizada!");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
