import java.util.Scanner;

public class Ejercicio4 {
    public void ejercicio4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su peso en kg: ");
        double peso = sc.nextDouble();
        System.out.println("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();
        double imc = peso/(altura*altura);

        System.out.println("El imc es: " + imc);
        if (imc < 18.5) {
            System.out.println("Categoría: Bajo peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Categoría: Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Categoría: Sobrepeso");
        } else {
            System.out.println("Categoría: Obesidad");
        }
    }
}
