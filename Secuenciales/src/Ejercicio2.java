import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {
    public void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su peso en kg: ");
        double peso = sc.nextDouble();
        System.out.println("Ingrese la duracion del ejercicio en min: ");
        double duracion = sc.nextDouble();
        System.out.println("Ingrese tipo de ejercicio: ");
        String tipo = sc.next();
        double tasaCaloriasPorMinuto = 0;
        if (tipo.equals("correr")) {
            tasaCaloriasPorMinuto = 10.0; // Calorías por minuto al correr
        } else if (tipo.equals("nadar")) {
            tasaCaloriasPorMinuto = 8.0;  // Calorías por minuto al nadar
        } else if (tipo.equals("andar en bicicleta")) {
            tasaCaloriasPorMinuto = 6.0;   // Calorías por minuto al andar en bicicleta
        } else {
            System.out.println("Tipo de ejercicio no reconocido. Por favor, ingresa 'correr', 'nadar' o 'andar en bicicleta'.");

        }

        // Calcular las calorías quemadas
        double caloriasQuemadas = tasaCaloriasPorMinuto * duracion * peso;

        // Imprimir el resultado
        System.out.printf("Calorías quemadas: %.2f kcal%n", caloriasQuemadas);
    }
}
