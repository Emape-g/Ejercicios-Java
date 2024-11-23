import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurant {
    private ArrayList<Plato> platosMenu;

    public MenuRestaurant() {
        this.platosMenu = new ArrayList<>();
    }

    public void cargarPlatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de platos a cargar: ");
        int cantidadPlatos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < cantidadPlatos; i++) {
            System.out.print("Ingrese el nombre del plato: ");
            String nombreCompleto = scanner.nextLine();
            System.out.print("Ingrese el precio del plato: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea
            System.out.print("¿Es una bebida? (true/false): ");
            boolean esBebida = scanner.nextBoolean();
            scanner.nextLine(); // Consumir el salto de línea

            Plato plato = new Plato(nombreCompleto, precio, esBebida);

            if (!esBebida) {
                System.out.print("Ingrese la cantidad de ingredientes: ");
                int cantidadIngredientes = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                for (int j = 0; j < cantidadIngredientes; j++) {
                    System.out.print("Ingrese el nombre del ingrediente: ");
                    String nombreIngrediente = scanner.nextLine();
                    System.out.print("Ingrese la cantidad del ingrediente: ");
                    double cantidad = scanner.nextDouble();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Ingrese la unidad de medida del ingrediente: ");
                    String unidadMedida = scanner.nextLine();

                    Ingrediente ingrediente = new Ingrediente(nombreIngrediente, cantidad, unidadMedida);
                    plato.agregarIngrediente(ingrediente);
                }
            }

            platosMenu.add(plato);
        }
    }

    public void mostrarMenu() {
        System.out.println("\nMenú del Restaurante:");
        for (Plato plato : platosMenu) {
            System.out.println(plato);
        }
    }
}