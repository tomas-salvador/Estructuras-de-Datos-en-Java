# Proyecto de Estructuras de Datos en Java

Este proyecto implementa estructuras de datos fundamentales en Java: una pila (`IntegerStack`) y una cola (`IntegerQueue`). Se incluye también una clase de demostración (`Principal`) que muestra el uso práctico de estas estructuras.

## Estructuras Implementadas

### `IntegerStack`
Una implementación de pila (Last In, First Out - LIFO) que permite las siguientes operaciones:
- `push(Integer i)`: Apila un elemento en la pila.
- `pop()`: Desapila y devuelve el elemento en la cima.
- `top()`: Devuelve el elemento en la cima sin desapilarlo.
- `size()`: Devuelve el tamaño de la pila.
- `search(Integer i)`: Busca un elemento en la pila.
- `toString()`: Devuelve una representación en cadena de la pila.

### `IntegerQueue`
Una implementación de cola (First In, First Out - FIFO) que permite las siguientes operaciones:
- `insert(Integer i)`: Inserta un elemento al final de la cola.
- `remove()`: Elimina y devuelve el elemento al frente de la cola.
- `seek()`: Devuelve el elemento al frente sin eliminarlo.
- `size()`: Devuelve el tamaño de la cola.
- `search(Integer i)`: Busca un elemento en la cola.
- `toString()`: Devuelve una representación en cadena de la cola.

## Clase `Principal`
Una clase de demostración que muestra cómo utilizar `IntegerStack` y `IntegerQueue` en escenarios del mundo real. Proporciona ejemplos de cómo se pueden aplicar estas estructuras en situaciones como el manejo de un historial de navegación (pila) y la gestión de colas de atención al cliente (cola).

## Requisitos
- Java 8 o superior.

## Cómo Ejecutar
Para ejecutar la demostración, compila y ejecuta la clase `Principal`:
