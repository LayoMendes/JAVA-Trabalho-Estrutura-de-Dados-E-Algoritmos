import java.util.LinkedList;

class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String toString() {
        return nome + " - R$" + preco;
    }
}

public class ListaProdutos {
    public static void main(String[] args) {
        LinkedList<Produto> lista = new LinkedList<>();

        // Adicionando produtos
        lista.addFirst(new Produto("Teclado", 120.0));
        lista.addLast(new Produto("Mouse", 80.0));
        lista.add(1, new Produto("Monitor", 950.0));

        // Imprimindo a lista
        System.out.println("Lista atual:");
        for (Produto p : lista) {
            System.out.println(p);
        }

        // Removendo o segundo produto
        Produto removido = lista.remove(1);
        System.out.println("\nProduto removido: " + removido);

        // Adicionando mais produtos
        lista.addFirst(new Produto("Webcam", 200.0));
        lista.addLast(new Produto("Impressora", 600.0));

        // Imprimindo novamente
        System.out.println("\nLista atualizada:");
        for (Produto p : lista) {
            System.out.println(p);
        }
    }
}
