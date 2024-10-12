import java.util.Scanner;
//Una empresa desea conocer el promedio de satisfacción de sus clientes basado en encuestas de calificación de 1 a 5.
//
//**Instrucciones**:
//- Crea un arreglo `calificaciones` con las puntuaciones de satisfacción de los clientes.
//- Escribe una función `calcularPromedioSatisfaccion` que recorra el arreglo y calcule el promedio de satisfacción.
public class Ejercicio5 {
    public void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        int[] calificaciones = {5, 4, 3, 5, 4, 5, 2, 4};
        System.out.println(calcularPromedioSatisfaccion(calificaciones));
    }
    public int calcularPromedioSatisfaccion(int[] calificaciones) {
        int promedio = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            promedio += calificaciones[i];

        }
        return promedio;
    }
}
