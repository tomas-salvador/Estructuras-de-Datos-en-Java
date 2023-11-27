public class Principal {
    public static void main(String[] args) {
        // Creamos una instancia de IntegerStack
        IntegerStack stack = new IntegerStack();

        // Apilamos elementos en la pila
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Mostramos el elemento en la cima de la pila
        System.out.println("Elemento en la cima: " + stack.top()); // Debería mostrar 3, que es el elemento en la cima

        // Mostramos el contenido completo de la pila
        System.out.println("Contenido de la pila: " + stack);

        // Desapilamos el elemento en la cima y mostrar la pila después
        stack.pop();
        System.out.println("Contenido después de desapilar el elemento en la cima: " + stack);

        // Comprobamos si un elemento específico está en la pila
        System.out.println("2 esta en la pila? " + stack.search(2)); // Busca el número 2 en la pila

        // Creamos una instancia de IntegerQueue
        IntegerQueue queue = new IntegerQueue();

        // Insertamos elementos en la cola
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);

        // Mostramos el elemento en la cabecera de la cola
        System.out.println("Elemento en la cabecera: " + queue.seek()); // Debería mostrar 1, que es el numero en la
                                                                        // cabecera de la cola

        // Mostramos el contenido completo de la cola
        System.out.println("Contenido de la cola: " + queue); // Muestra todos los elementos en la cola

        // Quitamos el elemento en la cabecera de la cola y mostramos la cola después
        queue.remove();
        System.out.println("Contenido en la cola después de quitar el elemento en la cabecera: " + queue);

        // Comprobamos si un elemento específico está en la cola
        System.out.println("3 esta en la cola? " + queue.search(3)); // Busca el número 3 en la cola
    }
}
