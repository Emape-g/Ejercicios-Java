import java.util.Scanner;
//Una pequeña empresa debe calcular el impuesto de venta para cada una de las facturas emitidas.
//
//**Instrucciones**:
//- Crea un arreglo `facturas` con los montos de las facturas de los clientes.
//- Escribe una función `calcularImpuesto` que aplique un 21% de impuesto a cada factura.
public class Ejercicio6 {
    public void ejercicio6() {
        Scanner sc = new Scanner(System.in);
        double[] facturas = {250.75, 1200.50, 150.00, 1750.30, 800.00, 1100.40, 300.10, 1350.60};
        calcularImpuesto(facturas);
        for (int i = 0; i < facturas.length; i++) {
            System.out.println("El monto con impuesto incluid " +facturas[i]);
        }
    }
    public void calcularImpuesto(double[] facturas) {
        for (int i = 0; i < facturas.length; i++) {
            facturas[i] = facturas[i] * 1.21;

        }
    }
}
