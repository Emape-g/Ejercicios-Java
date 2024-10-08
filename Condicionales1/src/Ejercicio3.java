import java.util.Scanner;

public class Ejercicio3 {
    public void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es su género de libro favorito (fantasía, misterio, romance, ciencia ficción): ");
        String genero = sc.nextLine();
        switch (genero.toLowerCase()) {
            case "fantasía":
                System.out.println("Te recomendamos leer 'El Hobbit' de J.R.R. Tolkien.");
                break;
            case "misterio":
                System.out.println("Te recomendamos leer 'El Código Da Vinci' de Dan Brown.");
                break;
            case "romance":
                System.out.println("Te recomendamos leer 'Orgullo y Prejuicio' de Jane Austen.");
                break;
            case "ciencia ficción":
                System.out.println("Te recomendamos leer 'Dune' de Frank Herbert.");
                break;
            default:
                System.out.println("Error: género no reconocido. Por favor, elige entre fantasía, misterio, romance o ciencia ficción.");
                break;
        }
    }


}
