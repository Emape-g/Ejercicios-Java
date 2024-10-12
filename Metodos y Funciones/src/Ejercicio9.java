//Una empresa quiere calcular el precio final de sus productos después de aplicar un descuento general del 10%.
//
//**Instrucciones**:
//- Crea un arreglo `preciosOriginales` que almacene el precio original de varios productos.
//- Escribe una función `calcularPrecioFinal` que aplique el descuento a cada producto y devuelva el precio final.

public class Ejercicio9 {
    public void ejercicio9() {
        double[] preciosOriginales = {100.00, 250.50, 75.99, 500.00, 89.95, 150.30};
        calcularPrecioFinal(preciosOriginales);
    }
    public void calcularPrecioFinal(double[] preciosOriginales) {
        for (int i = 0; i < preciosOriginales.length; i++) {
            preciosOriginales[i] = preciosOriginales[i] -(preciosOriginales[i] * 0.1);
            System.out.println("Precio actualizado " +preciosOriginales[i]);
        }
    }
}
