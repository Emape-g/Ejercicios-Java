import java.lang.reflect.Array;
import java.util.ArrayList;

public class Alumno {
    private String nombreCompleto;
    private long legajo;
    private ArrayList<Nota> notas;

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public Alumno(String nombreCompleto, long legajo, ArrayList<Nota> notas) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.notas = notas;
    }

    public Alumno(String nombreCompleto, long legajo) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
    }
    public Alumno(){

    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }
    public void agregarNota(Nota nota) {
        this.notas.add(nota);
    }

    public double calcularPromedio() {
        if (notas.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (Nota nota : notas) {
            suma += nota.getNotaExamen();
        }
        return suma / notas.size();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreCompleto + ", Legajo: " + legajo + ", Notas: " + notas;
    }
}
