//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SistemaPagos {
    public static void main(String[] args) {
        Pagos sistemaPagos = new Pagos(5);

        // Crear métodos de pago
        TarjetaCredito tarjeta1 = new TarjetaCredito("Juan Pérez", "1234-5678-9012-3456", "12/25", "123");
        PayPal paypal1 = new PayPal("Ana López", "987654321", "ana.lopez@example.com");

        // Agregar métodos de pago al sistema
        sistemaPagos.agregarMetodoPago(tarjeta1);
        sistemaPagos.agregarMetodoPago(paypal1);

        // Mostrar métodos de pago disponibles
        System.out.println("Métodos de pago disponibles:");
        sistemaPagos.mostrarMetodosPago();

        // Realizar un pago con la tarjeta de crédito
        sistemaPagos.realizarPago(0, 100.00); // Pago de 100.00 con la tarjeta de crédito

        // Realizar un pago con PayPal
        sistemaPagos.realizarPago(1, 200.00); // Pago de 200.00 con PayPal

        // Intentar cancelar el pago de la tarjeta de crédito
        sistemaPagos.cancelarPago(0); // Cancelar el pago de la tarjeta de crédito

        // Intentar cancelar el pago de PayPal
        sistemaPagos.cancelarPago(1); // Cancelar el pago de PayPal

        // Mostrar métodos de pago después de las cancelaciones
        System.out.println("Métodos de pago después de las cancelaciones:");
        sistemaPagos.mostrarMetodosPago();
    }
}