import java.util.Stack;

public class PilhaLinguagens {
    public static void main(String[] args) {
        Stack<String> linguagens = new Stack<>();

        // Adicionando 3 linguagens
        linguagens.push("Java");
        linguagens.push("Python");
        linguagens.push("C++");

        // Imprimindo a pilha
        System.out.println("Pilha atual: " + linguagens);

        // Removendo o topo
        String removido = linguagens.pop();
        System.out.println("Elemento removido do topo: " + removido);

        // Adicionando mais 2 linguagens
        linguagens.push("JavaScript");
        linguagens.push("Go");

        // Imprimindo novamente
        System.out.println("Pilha atualizada: " + linguagens);
    }
}
