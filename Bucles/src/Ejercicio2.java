import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Ejercicio 2: Cálculo de salarios semanales
//Una empresa desea calcular el salario semanal de sus empleados basándose en las horas trabajadas y una tarifa fija por hora.
//Instrucciones:
//Pide al usuario ingresar la cantidad de empleados.
//Para cada empleado, pide ingresar las horas trabajadas.
//Usa un bucle para calcular el salario de cada empleado (suponiendo una tarifa fija de $15 por hora).
public class Ejercicio2 {
    public void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        final int tarifaPorHora = 15;
        System.out.println("Ingrese la cantidad de empleados: ");
        int n = sc.nextInt();
        Map<String,Integer> empleados = new HashMap<String,Integer>();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese nombre del empleado: ");
            String nombre = sc.next();
            System.out.println("Ingrese cantidad de horas:");
            int horas = sc.nextInt() ;
            int salario = horas * tarifaPorHora;
            empleados.put(nombre ,salario);
        }
        for (Map.Entry<String,Integer> entry : empleados.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
