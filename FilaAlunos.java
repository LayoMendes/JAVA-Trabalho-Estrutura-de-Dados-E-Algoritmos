import java.util.LinkedList;
import java.util.Queue;

public class FilaAlunos {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Alunos iniciais
        fila.add("Ana");
        fila.add("Bruno");
        fila.add("Carlos");

        // Removendo o primeiro aluno
        fila.poll(); // Remove "Ana"

        // Adicionando mais dois alunos
        fila.add("Daniela");
        fila.add("Eduardo");

        // Imprimindo todos os nomes da fila
        System.out.println("Fila atualizada: " + fila);
    }
}
