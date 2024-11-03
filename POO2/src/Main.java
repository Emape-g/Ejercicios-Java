//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, TipoPlaneta.TERRESTRE, true,1.0,2.0
        );


        Planeta jupiter = new Planeta("Júpiter", 79, 1.899E27, 1.4313E15, 139820, 750000000, TipoPlaneta.GASEOSO, true,11.56,3.55
        );


        System.out.println("Información del planeta Tierra:");
        tierra.imprimir();
        System.out.println("Densidad de la Tierra: " + tierra.calcularDensidad() + " kg/m³");
        System.out.println("¿Es planeta exterior? " + tierra.esPlanetaExterior());

        System.out.println("\nInformación del planeta Júpiter:");
        jupiter.imprimir();
        System.out.println("Densidad de Júpiter: " + jupiter.calcularDensidad() + " kg/m³");
        System.out.println("¿Es planeta exterior? " + jupiter.esPlanetaExterior());
    }
    }
