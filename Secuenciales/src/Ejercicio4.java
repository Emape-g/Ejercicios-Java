import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {
    public void ejercicio4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digame su estado de ánimo (feliz, triste, enérgico, relajado): ");
        String estado = sc.nextLine().toLowerCase();
        if (estado.equals("feliz")) {
            System.out.println("Canciones recomendadas para estar feliz:");
            System.out.println("- Happy - Pharrell Williams");
            System.out.println("- Don't Worry Be Happy - Bobby McFerrin");
            System.out.println("- Walking on Sunshine - Katrina and the Waves");
        } else if (estado.equals("triste")) {
            System.out.println("Canciones recomendadas para estar triste:");
            System.out.println("- Someone Like You - Adele");
            System.out.println("- Fix You - Coldplay");
            System.out.println("- The Night We Met - Lord Huron");
        } else if (estado.equals("enérgico")) {
            System.out.println("Canciones recomendadas para estar enérgico:");
            System.out.println("- Eye of the Tiger - Survivor");
            System.out.println("- Can't Stop the Feeling - Justin Timberlake");
            System.out.println("- Wake Me Up - Avicii");
        } else if (estado.equals("relajado")) {
            System.out.println("Canciones recomendadas para estar relajado:");
            System.out.println("- Weightless - Marconi Union");
            System.out.println("- River Flows in You - Yiruma");
            System.out.println("- Sunflower - Post Malone & Swae Lee");
        } else {
            System.out.println("Estado de ánimo no reconocido. Por favor, ingresa feliz, triste, enérgico o relajado.");
        }
        }
    }
