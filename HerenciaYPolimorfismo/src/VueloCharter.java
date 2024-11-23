public class VueloCharter extends Vuelo implements Promocionable {
    private double precioTotal;

    public VueloCharter(String numeroVuelo, String origen, String destino, String fecha, double precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    public VueloCharter(){

    }
    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    @Override
    public void aplicarPromocion() {
        double descuento = 0.15; // 15% de descuento
        precioTotal -= precioTotal * descuento;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return super.toString() + ", VueloCharter{" +
                "precioTotal=" + precioTotal +
                '}';
    }
}
