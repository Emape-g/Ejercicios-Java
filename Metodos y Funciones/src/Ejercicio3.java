import java.sql.Struct;
import java.util.Scanner;
//Una pequeña empresa de servicios tiene una lista de clientes a los que debe enviar facturas, pero quiere procesar solo aquellos que tengan facturas pendientes por más de $500.
//
//**Instrucciones**:
//- Crea un arreglo `clientes` que almacene los nombres de los clientes y un arreglo `facturasPendientes` con el monto de sus facturas pendientes.
//- Escribe una función `enviarFacturas` que imprima los nombres de los clientes con facturas mayores a $500.
public class Ejercicio3 {
    public void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        String[] clientes = {"Carlos Pérez", "Ana Gómez", "Luis Fernández", "María Rodríguez", "Jorge Martínez", "Laura Sánchez", "Ricardo López", "Isabel Hernández"};


        double[] facturasPendientes = {150.75, 600.50, 450.00, 230.30, 500.10, 700.60, 390.90, 210.45};
        enviarFacturas(clientes,facturasPendientes);
    }
    public void enviarFacturas(String[] clientes, double[] facturasPendientes) {
        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500){
                System.out.println("El cliente "+clientes[i]+" tiene una factura mas grande de 500");
            }
        }
    }
}
