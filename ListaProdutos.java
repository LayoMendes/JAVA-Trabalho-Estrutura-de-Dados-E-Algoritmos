import java.util.LinkedList;

class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }
}

public class ListaProdutos {
    public static void main(String[] args) {
        LinkedList<Produto> lista = new LinkedList<>();

        // Produtos iniciais
        lista.addFirst(new Produto("Teclado", 120.0));
        lista.addLast(new Produto("Mouse", 80.0));
        lista.add(1, new Produto("Monitor", 950.0));

        // Removendo o segundo produto (índice 1)
        lista.remove(1); // Remove "Monitor"

        // Adicionando novos produtos
        lista.addFirst(new Produto("Webcam", 200.0));      // Início
        lista.addLast(new Produto("Impressora", 600.0));   // Final

        // Imprimindo todos os produtos
        System.out.println("Lista atualizada de produtos:");
        for (Produto p : lista) {
            System.out.println(p);
        }
    }
}
