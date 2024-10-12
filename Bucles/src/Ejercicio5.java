import java.util.Scanner;
//Ejercicio 5: Cálculo de horas extras
//Una empresa desea calcular las horas extras trabajadas por sus empleados. Si un empleado trabaja más de 40 horas en la semana, las horas adicionales se consideran horas extras.
//Instrucciones:
//Pide al usuario ingresar el número de empleados.
//Usa un bucle para ingresar las horas trabajadas por cada empleado.
//Si un empleado trabajó más de 40 horas, calcula y muestra las horas extras.
public class Ejercicio5 {
    public void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de empleados: ");
        int empleados = sc.nextInt();
        int i = 0;
        while (i < empleados) {
            System.out.println("Ingrese las horarios horas semanales del empleado: "+(i+1));
            int horas = sc.nextInt();
            if (horas > 40 ) {
                System.out.println("las horas extras son "+(horas-40));
            }
            i += 1;

        }
    }
}
