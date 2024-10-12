import java.util.Scanner;

public class Ejercicio2 {
    public void ejercicio2() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese un número N: ");
        int N = scanner.nextInt();


        System.out.println("Factoriales de los números desde 0 hasta " + N + ":");
        for (int i = 0; i <= N; i++) {
            int resultado = 1;
            for (int j = 1; j <= i; j++) {
                resultado *= j;
            }
            System.out.println(resultado);
        }


    }
}







