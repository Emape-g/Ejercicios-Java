import java.util.Scanner;
//Una tienda necesita revisar el inventario de sus productos y determinar si algún artículo tiene menos de 5 unidades disponibles para realizar un pedido.
//Instrucciones:
//Pide al usuario ingresar el número de productos.
//Usa un bucle para ingresar la cantidad disponible de cada producto.
//Si algún producto tiene menos de 5 unidades, muestra un mensaje indicando que es necesario realizar un pedido.
public class Ejercicio3 {
    public void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el números de productos: ");
        int n = sc.nextInt();
        int i = 0;
        while (n != i) {
            System.out.println("Ingrese cantidad disponible del producto: "+(i+1));
            int n2 = sc.nextInt();
            if (n2 < 5) {
                System.out.println("Es necesario realizar un pedido");
            }
            i = i + 1;

        }
    }
}
