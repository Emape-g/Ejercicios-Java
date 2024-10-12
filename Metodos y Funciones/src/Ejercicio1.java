import java.util.Random;
import java.util.Scanner;

// Ejercicio 1: Cálculo de ingresos mensuales
//Una pequeña tienda registra sus ventas diarias en un arreglo. Se necesita escribir una función que use un bucle para calcular los ingresos totales mensuales.
//
//**Instrucciones**:
//- Crea un arreglo `ventas` que almacene las ventas diarias de una tienda durante 30 días.
//- Escribe una función `calcularIngresosMensuales` que recorra el arreglo y sume las ventas.
//- Imprime el total de ingresos mensuales.
public class Ejercicio1 {
    public void ejercicio1(){
        Scanner sc = new Scanner(System.in);
        int[] ventas = new int[30];


        Random random = new Random();
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = random.nextInt(201) + 100;
        }
        System.out.println("los ingresos mensuales son: ");
        System.out.println(calcularIngresosMensuales(ventas));
    }
    public double calcularIngresosMensuales(int[] ventas){
        double ingresos = 0;
        for (int i = 0; i < ventas.length; i++) {
            ingresos += ventas[i];

        }
        return ingresos;
    }
}
