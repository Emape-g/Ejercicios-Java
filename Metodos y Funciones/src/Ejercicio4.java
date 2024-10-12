import java.util.Scanner;
//Una empresa ofrece descuentos a sus clientes dependiendo de la cantidad de compras que han realizado. Si han comprado más de 10 veces, reciben un 10% de descuento.
//
//**Instrucciones**:
//- Crea un arreglo `clientes` y otro `compras` que almacene la cantidad de compras de cada cliente.
//- Escribe una función `calcularDescuentos` que recorra el arreglo y aplique el descuento a los clientes que califiquen.
//¡Claro! Aquí tienes cinco ejercicios adicionales en Java, orientados a pequeñas empresas y enfocados en bucles y funciones.
public class Ejercicio4 {
    public void ejercicio4() {
        Scanner sc = new Scanner(System.in);
        String[] clientes = {"Sofía Ramírez", "Pedro Gutiérrez", "Lucía Torres", "Manuel Castro",
                "Elena Díaz", "Fernando Ruiz", "Gabriela Mora", "Daniel Ríos"};

        // Arreglo de cantidades de compras realizadas por cada cliente (con algunos valores mayores a 10)
        int[] compras = {3, 12, 2, 15, 8, 11, 4, 13};
        calculardescuentos(clientes,compras);
    }
    public void calculardescuentos(String[] clientes, int[] compras) {
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10){
                System.out.println("El cliente "+clientes[i]+ " califica para el 10% de descuento");
            }
        }
    }
}
