public class datos implements Comparable<datos> {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public datos(int numero) {
        this.numero = numero;
    }

    @Override
    public int compareTo(datos otro) {
        return Integer.compare(this.numero, otro.numero);
    }
}
