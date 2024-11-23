class PayPal extends MetodoPago implements Cancelable {
    private String correoElectronico;
    private boolean pagoRealizado;

    public PayPal(String titular, String numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
        this.pagoRealizado = false;
    }
    public PayPal(){

    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
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
        System.out.println("Realizando pago con PayPal de " + titular + " por un monto de " + monto);
        // Aquí podrías agregar lógica para verificar la cuenta de PayPal, etc.
        pagoRealizado = true;
    }

    @Override
    public void cancelarPago() {
        if (pagoRealizado) {
            System.out.println("Pago cancelado para la cuenta de PayPal de " + titular);
            pagoRealizado = false;
        } else {
            System.out.println("No hay pago para cancelar en la cuenta de PayPal de " + titular);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", PayPal{" +
                "correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}
