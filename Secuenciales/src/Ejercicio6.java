import java.util.Scanner;

public class Ejercicio6 {
    public void ejercicio6() {
        Scanner sc = new Scanner(System.in);
        String[] materias = {"Matemáticas", "Historia", "Ciencias", "Lengua", "Inglés"};
        int diasSemana = 7;

        // Pedir al usuario cuántas horas puede estudiar al día
        System.out.print("¿Cuántas horas puedes estudiar al día? ");
        int horasPorDia = sc.nextInt();

        // Calcular el total de horas disponibles en la semana
        int horasTotales = horasPorDia * diasSemana;

        // Generar un plan de estudio distribuyendo las horas por materia
        int horasPorMateria = horasTotales / materias.length;
        int horasRestantes = horasTotales % materias.length; // Para distribuir horas adicionales si no son divisibles

        System.out.println("\nPlan de estudio semanal:");

        // Distribuir horas por materia
        for (int i = 0; i < materias.length; i++) {
            int horasAsignadas = horasPorMateria;

            // Distribuir las horas restantes entre las primeras materias
            if (i < horasRestantes) {
                horasAsignadas++;
            }

            System.out.println(materias[i] + ": " + horasAsignadas + " horas");
        }
    }
}
