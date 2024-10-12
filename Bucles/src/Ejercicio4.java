import java.util.Scanner;
//Ejercicio 4: Registro de ventas diarias
//Una tienda desea registrar las ventas realizadas cada día durante una semana. El programa debe calcular el total de ventas al final de la semana.
//Instrucciones:
//Usa un bucle para registrar las ventas diarias durante 7 días.
//Al final del bucle, muestra el total de ventas de la semana.
public class Ejercicio4 {
    public void ejercicio4() {
        Scanner sc = new Scanner(System.in);
        double total=0,venta=0;
        int i = 0;
        do {
            System.out.println("Ingrese la venta del dia "+(i+1));
            venta = sc.nextDouble();
            total += venta;
            i += 1;
        }while(i<7);
        System.out.println("Total de ventas: "+total);
    }
}
