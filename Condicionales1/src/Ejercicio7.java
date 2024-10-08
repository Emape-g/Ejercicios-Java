import java.util.Scanner;

public class Ejercicio7 {
    public void ejercicio7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuál es tu estado de ánimo? (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = sc.nextLine().toLowerCase();


        switch (estadoAnimo) {
            case "feliz":
                System.out.println("¡Genial! Puedes disfrutar de una salida con amigos o ver tu película favorita.");
                break;
            case "triste":
                System.out.println("Está bien sentirse así. Te recomiendo escuchar música relajante o leer un buen libro.");
                break;
            case "enérgico":
                System.out.println("¡Fantástico! Es un buen momento para hacer ejercicio o salir a correr.");
                break;
            case "relajado":
                System.out.println("Perfecto. Considera hacer yoga o meditar para mantener esa paz.");
                break;
            default:
                System.out.println("Estado de ánimo no reconocido. Por favor, elige entre feliz, triste, enérgico o relajado.");
                break;
        }
    }
}
