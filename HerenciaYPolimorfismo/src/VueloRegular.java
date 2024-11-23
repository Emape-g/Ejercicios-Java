public class VueloRegular extends Vuelo implements Promocionable {
    private int numeroAsientos;
    private double precioBasePorAsiento;

    public VueloRegular(String numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioBasePorAsiento) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioBasePorAsiento = precioBasePorAsiento;
    }
    public VueloRegular(){

    }

    @Override
    public double calcularPrecio() {
        return precioBasePorAsiento * numeroAsientos;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public double getPrecioBasePorAsiento() {
        return precioBasePorAsiento;
    }

    public void setPrecioBasePorAsiento(double precioBasePorAsiento) {
        this.precioBasePorAsiento = precioBasePorAsiento;
    }

    @Override
    public void aplicarPromocion() {
        double descuento = 0.1; // 10% de descuento
        precioBasePorAsiento -= precioBasePorAsiento * descuento;
    }

    @Override
    public String toString() {
        return super.toString() + ", VueloRegular{" +
                "numeroAsientos=" + numeroAsientos +
                ", precioBasePorAsiento=" + precioBasePorAsiento +
                '}';
    }
}