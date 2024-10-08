import java.util.Scanner;

public class Ejercicio1 {
    public void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su genero favorito( acción, comedia, drama o ciencia ficción) : ");
        String genero = sc.nextLine();
        switch (genero.toLowerCase()) {
            case "acción":
                System.out.println("Te recomendamos ver 'Mad Max: Fury Road'.");
                break;
            case "comedia":
                System.out.println("Te recomendamos ver 'Superbad'.");
                break;
            case "drama":
                System.out.println("Te recomendamos ver 'The Shawshank Redemption'.");
                break;
            case "ciencia ficción":
                System.out.println("Te recomendamos ver 'Inception'.");
                break;
            default:
                System.out.println("Error: género no reconocido. Por favor, elige entre acción, comedia, drama o ciencia ficción.");
                break;
        }
    }
}
