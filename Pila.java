public class Pila<T> {
    private Nodo<T> top;

    public Pila() {
        this.top = null;
    }
}
public T peek() {
    if (isEmpty()) {
        throw new RuntimeException("Pila vuota");
    }

    return top.dato;
}
public int size() {
    int contatore = 0;
    Nodo<T> corrente = top;

    while (corrente != null) {
        contatore++;
        corrente = corrente.next;
    }

    return contatore;
}