import java.util.Scanner;
//Ejercicio 2: Generar reportes de inventario
//Una tienda de electrónica necesita un informe del inventario, mostrando los productos que tienen menos de 5 unidades en stock.
//
//**Instrucciones**:
//- Crea un arreglo `productos` que almacene los nombres de los productos y otro arreglo `stocks` que almacene la cantidad de stock de cada producto.
//- Escribe una función `generarReporteBajoStock` que imprima los productos con menos de 5 unidades.
public class Ejercicio2 {
    public void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        String[] productos = {"Televisor", "Computadora", "Smartphone", "Tablet", "Cámara", "Audífonos", "Teclado", "Mouse", "Consola de videojuegos", "Impresora"};


        int[] stocks = {10, 3, 15, 7, 12, 20, 8, 9, 4, 6};

        generarReporteBajoStock(productos, stocks);
    }
    public void generarReporteBajoStock(String[] productos, int[] stocks) {
        for (int i = 0; i < productos.length; i++) {
            if (stocks[i] < 5) {
                System.out.println("Comprar mas stock de "+productos[i]);
            }
        }
    }
}
