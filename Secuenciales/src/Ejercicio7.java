import java.util.Scanner;

public class Ejercicio7 {
    public void ejercicio7() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nivel de satisfaccion: ");

        int satisfaccion = sc.nextInt();

        System.out.println("Ingrese su nivel de estrés: ");

        int estres = sc.nextInt();
        System.out.println("Ingrese su conformidad con su trabajo: ");

        int conformidad = sc.nextInt();

        System.out.println("Ingrese su nivel de salud: ");

        int salud = sc.nextInt();

        int suma = satisfaccion + estres + conformidad + salud;
        int promedio = suma / 4;
        System.out.println("Su indice de felicidad es: " + promedio+" en una escala del 1 al 10");
    }
}
