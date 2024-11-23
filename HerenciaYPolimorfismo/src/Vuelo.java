public abstract class Vuelo {
    protected String numeroVuelo;
    protected String origen;
    protected String destino;
    protected String fecha;

    public Vuelo(){

    }

    public Vuelo(String numeroVuelo, String origen, String destino, String fecha) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    public Vuelo(String bb456, String miami, String chicago, String date, int i) {
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public abstract double calcularPrecio();{

    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "numeroVuelo='" + numeroVuelo + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}