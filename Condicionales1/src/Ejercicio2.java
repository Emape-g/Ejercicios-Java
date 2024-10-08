import java.util.Scanner;

public class Ejercicio2 {
    public void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio de su producto: ");
        double precio = sc.nextInt();
        System.out.println("Ingrese su categoria( estudiante, adulto o jubilado) : ");
        String categoria = sc.next();
        double descuento=0;
        switch (categoria.toLowerCase()) {
            case "estudiante":
                descuento = 0.10;
                break;
            case "adulto":
                descuento = 0.05;
                break;
            case "jubilado":
                descuento = 0.15;
                break;
            default:
                System.out.println("Error: categoría no reconocida. Por favor, elige entre estudiante, adulto o jubilado.");
        }
        precio = precio-(precio*descuento);
        System.out.println("El precio es: " + precio+ " se le hizo un descuento de "+100*descuento);
    }
}
