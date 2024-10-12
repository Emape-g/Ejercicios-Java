import java.util.Scanner;
//Una tienda de ropa ofrece un 15% de descuento a las compras superiores a $500.
//
//**Instrucciones**:
//- Crea un arreglo `compras` que almacene los montos de las compras de los clientes.
//- Escribe una función `aplicarDescuento` que aplique el descuento a las compras que superen los $500.
public class Ejercicio7 {
    public void ejercicio7() {
        Scanner sc = new Scanner(System.in);
        double[] compras = {150.75, 600.50, 75.00, 550.30, 800.00, 200.40, 300.10, 1350.60};
        aplicarDescuento(compras);
    }
    public void aplicarDescuento(double[] compras) {
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 500) {
                compras[i] = compras[i]-(compras[i] * 0.15);

            }
            System.out.println(compras[i]);
        }

    }
}
