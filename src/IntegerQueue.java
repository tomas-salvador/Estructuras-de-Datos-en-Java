import java.util.LinkedList;

public class IntegerQueue {
    private LinkedList<Integer> queue;

    public IntegerQueue() {
        queue = new LinkedList<>();
    }

    // Inserta un elemento
    public void insert(Integer i) {
        queue.addLast(i);
    }

    // Extrae un elemento
    public Integer remove() {
        return queue.isEmpty() ? null : queue.removeFirst();
    }

    // Obtiene el elemento en la cabecera
    public Integer seek() {
        return queue.isEmpty() ? null : queue.getFirst();
    }

    // Cuenta el número de elementos
    public int size() {
        return queue.size();
    }

    // Busca un elemento en la cola
    public boolean search(Integer i) {
        return queue.contains(i);
    }

    // Muestra el contenido de la cola
    public String toString() {
        return queue.isEmpty() ? "Empty queue" : queue.toString();
    }
}
