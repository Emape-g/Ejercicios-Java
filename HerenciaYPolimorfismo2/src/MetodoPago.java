public abstract class MetodoPago {
    protected String titular;
    protected String numero;

    public MetodoPago(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }
    public MetodoPago(){

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public abstract void realizarPago(double monto);

    @Override
    public String toString() {
        return "MetodoPago{" +
                "titular='" + titular + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
