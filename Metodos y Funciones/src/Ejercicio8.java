//Una empresa de servicios necesita llevar el control de las horas trabajadas por sus empleados durante una semana.
//
//**Instrucciones**:
//- Crea un arreglo `empleados` con los nombres de los empleados y otro arreglo `horasTrabajadas` con las horas trabajadas en la semana.
//- Escribe una función `calcularPagoSemanal` que calcule el pago semanal (a razón de $15 por hora trabajada).
public class Ejercicio8 {
    public void ejercicio8() {
        String[] empleados = {"Juan Pérez", "María Gómez", "Carlos Fernández", "Ana Martínez",
                "Luis Rodríguez", "Elena Díaz", "Ricardo López", "Sofía Ramírez"};


        int[] horasTrabajadas = {40, 38, 45, 30, 50, 37, 42, 48};
        calcularPagoSemanal(empleados,horasTrabajadas);
    }
    public void calcularPagoSemanal(String[] empleados,int[] horasTrabajadas) {
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("El pago semanal del empleado "+ empleados[i] + " es de " + (horasTrabajadas[i]*15));
        }
    }
}
