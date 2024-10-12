import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
//Ejercicio 1: Cálculo del tiempo dedicado a cada actividad
//Un alumno quiere medir el tiempo total que dedica a sus actividades académicas y personales durante el día.
//Instrucciones:
//Pide al usuario que ingrese las horas dedicadas a cada actividad: estudiar, hacer ejercicios, leer, y tiempo libre.
//Usa un bucle para registrar las horas y luego calcula el tiempo total dedicado.
public class Ejercicio1 {
    public void ejercicio1(){
        Scanner sc = new Scanner(System.in);
        Map<String, Double> actividades = new HashMap<String, Double>();
        actividades.put("Estudiar", 0.0);
        actividades.put("Ejercicio", 0.0);
        actividades.put("Leer", 0.0);
        actividades.put("Tiempo", 0.0);

        for (String actividad : actividades.keySet()){
            System.out.println("Ingrese horas que dedica a la actividad: "+actividad);
            Double horas = sc.nextDouble();
            actividades.put(actividad, horas);
        }
        double total = 0;
        for (double horas : actividades.values()){
            total += horas;
        }

        System.out.println("El total de horas que dedica a todas sus actividades es de: "+total);
    }
}
