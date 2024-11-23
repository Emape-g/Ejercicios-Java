public class Pagos {
    private MetodoPago[] metodosPago;
    private int contador;

    public Pagos(int capacidad) {
        metodosPago = new MetodoPago[capacidad];
        contador = 0;
    }

    public void agregarMetodoPago(MetodoPago metodoPago) {
        if (contador < metodosPago.length) {
            metodosPago[contador++] = metodoPago;
        } else {
            System.out.println("Capacidad máxima de métodos de pago alcanzada.");
        }
    }

    public void realizarPago(int indice, double monto) {
        if (indice >= 0 && indice < contador) {
            metodosPago[indice].realizarPago(monto);
        } else {
            System.out.println("Índice de método de pago no válido.");
        }
    }

    public void cancelarPago(int indice) {
        if (indice >= 0 && indice < contador && metodosPago[indice] instanceof Cancelable) {
            ((Cancelable) metodosPago[indice]).cancelarPago();
        } else {
            System.out.println("Índice de método de pago no válido o no cancelable.");
        }
    }

    public void mostrarMetodosPago() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Método de pago " + (i + 1) + ": " + metodosPago[i]);
        }
    }
}
