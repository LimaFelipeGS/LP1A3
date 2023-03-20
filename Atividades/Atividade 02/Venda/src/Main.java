import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto(1, "Sabonete", 2.50);
        Produto produto2 = new Produto(2, "Bicicleta", 75);
        Produto produto3 = new Produto(3,"Celular", 1250.50);
        Produto produto4 = new Produto(4, "Vassoura", 7.10);
        Produto produto5 = new Produto(5, "Arroz", 10);

        ListaProdutos list = new ListaProdutos();

        list.addProduto(produto1);
        list.addProduto(produto2);
        list.addProduto(produto3);
        list.addProduto(produto4);
        list.addProduto(produto5);

        list.mostrarLista();

        list.vender();
    }
}