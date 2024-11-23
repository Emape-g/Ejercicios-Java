//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SistemaReservas {
    public static void main(String[] args) {
        Reservas reservas = new Reservas(5);

        VueloRegular vueloRegular1 = new VueloRegular("REG001", "Madrid", "Barcelona", "2023-12-01", 100, 50);
        VueloCharter vueloCharter1 = new VueloCharter("CHAR001", "Madrid", "Ibiza", "2023-12-05", 2000);

        reservas.agregarVuelo(vueloRegular1);
        reservas.agregarVuelo(vueloCharter1);

        System.out.println("Precio total antes de aplicar promociones: " + reservas.calcularPrecioTotal());

        // Aplicar un 10% de descuento
        reservas.aplicarPromociones(10);

        System.out.println("Precio total después de aplicar promociones: " + reservas.calcularPrecioTotal());

        // Mostrar información de todos los vuelos
        System.out.println("Información de todos los vuelos:");
        reservas.mostrarVuelos();
    }
}