import java.util.Scanner;

public class Ejercicio3 {
    public void ejercicio3() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese un número N: ");
        int N = scanner.nextInt();

        int suma = 0;
        System.out.println("Factoriales de los números desde 0 hasta " + N + ":");
        for (int i = 0; i <= N; i++) {
            int resultado = 1;
            for (int j = 1; j <= i; j++) {
                resultado *= j;


            }
            suma += resultado;

            }
        System.out.println(suma);
    }
}


