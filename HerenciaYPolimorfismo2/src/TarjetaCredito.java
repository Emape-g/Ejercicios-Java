public class TarjetaCredito extends MetodoPago implements Cancelable {
    private String fechaExpiracion;
    private String codigoSeguridad;
    private boolean pagoRealizado;

    public TarjetaCredito(String titular, String numero, String fechaExpiracion, String codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
        this.pagoRealizado = false;
    }
    public TarjetaCredito(){

    }
    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public boolean isPagoRealizado() {
        return pagoRealizado;
    }

    public void setPagoRealizado(boolean pagoRealizado) {
        this.pagoRealizado = pagoRealizado;
    }

    @Override
    public void realizarPago(double monto) {
        // Simulación del proceso de pago
        System.out.println("Realizando pago con tarjeta de crédito de " + titular + " por un monto de " + monto);
        // Aquí podrías agregar lógica para verificar la tarjeta, etc.
        pagoRealizado = true;
    }

    @Override
    public void cancelarPago() {
        if (pagoRealizado) {
            System.out.println("Pago cancelado para la tarjeta de crédito de " + titular);
            pagoRealizado = false;
        } else {
            System.out.println("No hay pago para cancelar en la tarjeta de crédito de " + titular);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", TarjetaCredito{" +
                "fechaExpiracion='" + fechaExpiracion + '\'' +
                ", codigoSeguridad='" + codigoSeguridad + '\'' +
                '}';
    }
}
