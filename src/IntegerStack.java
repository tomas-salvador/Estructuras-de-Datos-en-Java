import java.util.LinkedList;

public class IntegerStack {
    private LinkedList<Integer> stack;

    public IntegerStack() {
        stack = new LinkedList<>();
    }

    // Apila un elemento
    public void push(Integer i) {
        stack.addFirst(i);
    }

    // Desapila un elemento
    public Integer pop() {
        return stack.isEmpty() ? null : stack.removeFirst();
    }

    // Obtiene el elemento en la cima
    public Integer top() {
        return stack.isEmpty() ? null : stack.getFirst();
    }

    // Cuenta el número de elementos
    public int size() {
        return stack.size();
    }

    // Busca un elemento en la pila
    public boolean search(Integer i) {
        return stack.contains(i);
    }

    // Muestra el contenido de la pila
    public String toString() {
        return stack.isEmpty() ? "Empty stack" : stack.toString();
    }
}
