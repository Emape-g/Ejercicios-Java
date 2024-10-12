import java.util.Scanner;

public class Ejercicio6 {
    public void ejercicio6() {
        int N, i, j;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un numero: ");
            N = sc.nextInt();
        } while (N <= 0);
        System.out.println("Números primos desde 1 hasta " + N);

        for (j = 2; j <= N; j++) {
            i = 2;
            while (j % i != 0) {
                i++;
            }
            if (i == j) {
                System.out.println(j);
            }
        }
    }
    }

