public class Reservas {
    private Vuelo[] vuelos;
    private int contador;

    public Reservas(int capacidad) {
        vuelos = new Vuelo[capacidad];
        contador = 0;
    }
    public Reservas(){

    }

    public Vuelo[] getVuelos() {
        return vuelos;
    }

    public void setVuelos(Vuelo[] vuelos) {
        this.vuelos = vuelos;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void agregarVuelo(Vuelo vuelo) {
        if (contador < vuelos.length) {
            vuelos[contador++] = vuelo;
        } else {
            System.out.println("Capacidad de reservas alcanzada.");
        }
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Vuelo vuelo : vuelos) {
            if (vuelo != null) {
                total += vuelo.calcularPrecio();
            }
        }
        return total;
    }

    public void aplicarPromociones(int i) {
        for (Vuelo vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion();
            }
        }
    }

    public void mostrarVuelos() {
        for (Vuelo vuelo : vuelos) {
            if (vuelo != null) {
                System.out.println(vuelo);
            }
        }
    }


}