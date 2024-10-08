import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {
    public void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nivel(principante, intermedio, avanzado): ");
        String nivel = sc.next().toLowerCase();
        if (nivel.equals("principiante")) {
            System.out.println("Rutina de ejercicio semanal para principiantes:");
            System.out.println("Lunes: 20 minutos de caminata");
            System.out.println("Martes: 15 minutos de ejercicios de estiramiento");
            System.out.println("Miércoles: 20 minutos de ciclismo");
            System.out.println("Jueves: Descanso");
            System.out.println("Viernes: 15 minutos de ejercicios de fuerza (pesas ligeras)");
            System.out.println("Sábado: 30 minutos de yoga");
            System.out.println("Domingo: Descanso");
        } else if (nivel.equals("intermedio")) {
            System.out.println("Rutina de ejercicio semanal para intermedios:");
            System.out.println("Lunes: 30 minutos de carrera");
            System.out.println("Martes: 20 minutos de ejercicios de fuerza (pesas moderadas)");
            System.out.println("Miércoles: 30 minutos de natación");
            System.out.println("Jueves: 15 minutos de HIIT (Entrenamiento de Intervalo de Alta Intensidad)");
            System.out.println("Viernes: 30 minutos de ciclismo");
            System.out.println("Sábado: 20 minutos de yoga o pilates");
            System.out.println("Domingo: Descanso");
        } else if (nivel.equals("avanzado")) {
            System.out.println("Rutina de ejercicio semanal para avanzados:");
            System.out.println("Lunes: 45 minutos de carrera");
            System.out.println("Martes: 40 minutos de ejercicios de fuerza (pesas pesadas)");
            System.out.println("Miércoles: 30 minutos de natación con intervalos");
            System.out.println("Jueves: 30 minutos de HIIT");
            System.out.println("Viernes: 60 minutos de ciclismo");
            System.out.println("Sábado: 30 minutos de entrenamiento funcional");
            System.out.println("Domingo: 20 minutos de yoga para recuperación");
        } else {
            System.out.println("Nivel de condición física no reconocido. Por favor, ingresa 'principiante', 'intermedio' o 'avanzado'.");
        }
    }
}
