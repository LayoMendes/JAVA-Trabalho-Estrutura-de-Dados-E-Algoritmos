import java.util.LinkedList;
import java.util.Queue;

public class FilaAlunos {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Adicionando 3 alunos
        fila.add("Ana");
        fila.add("Bruno");
        fila.add("Carlos");

        // Imprimindo a fila
        System.out.println("Fila atual: " + fila);

        // Removendo o primeiro
        String removido = fila.poll();
        System.out.println("Aluno removido: " + removido);

        // Adicionando mais 2 alunos
        fila.add("Daniela");
        fila.add("Eduardo");

        // Imprimindo novamente
        System.out.println("Fila atualizada: " + fila);
    }
}
