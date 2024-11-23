import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {
    private ArrayList<Alumno> alumnos;

    public CargaNotas() {
        this.alumnos = new ArrayList<>();
    }

    public void cargarAlumnos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.print("Ingrese el nombre completo del alumno: ");
            String nombreCompleto = scanner.nextLine();
            System.out.print("Ingrese el legajo del alumno: ");
            long legajo = scanner.nextLong();
            scanner.nextLine(); // Consumir el salto de línea

            Alumno alumno = new Alumno(nombreCompleto, legajo);

            System.out.print("Ingrese la cantidad de notas para " + nombreCompleto + ": ");
            int cantidadNotas = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            while (cantidadNotas < 1) {
                System.out.println("Debe ingresar al menos 1 nota.");
                System.out.print("Ingrese la cantidad de notas para " + nombreCompleto + ": ");
                cantidadNotas = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
            }

            for (int j = 0; j < cantidadNotas; j++) {
                System.out.print("Ingrese la cátedra de la nota " + (j + 1) + ": ");
                String catedra = scanner.nextLine();
                System.out.print("Ingrese la nota del examen: ");
                double notaExamen = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea

                Nota nota = new Nota(catedra, notaExamen);
                alumno.agregarNota(nota);
            }

            alumnos.add(alumno);
        }
    }

    public void mostrarInformacion() {
        System.out.println("\nInformación de los alumnos y sus notas:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
            System.out.println("Promedio de notas: " + alumno.calcularPromedio());
        }
    }
}
