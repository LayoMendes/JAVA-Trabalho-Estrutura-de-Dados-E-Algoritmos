import java.util.Stack;

public class PilhaLinguagens {
    public static void main(String[] args) {
        Stack<String> linguagens = new Stack<>();

        // Adicionando linguagens à pilha
        linguagens.push("Java");
        linguagens.push("Python");
        linguagens.push("C++");

        // Imprimindo a pilha original
      

        // Adicionando mais duas linguagens
        linguagens.push("JavaScript");
        linguagens.push("Go");

        // Imprimindo a pilha atualizada
        System.out.println("Pilha atualizada: " + linguagens);
    }
}

