import java.util.Scanner;

public class Ejercicio5 {
    public void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        int random = (int) (Math.random() * 3);
        System.out.println(random);
        System.out.println("Elige piedra, papel o tijera: ");
        String eleccion = sc.nextLine();
        int jugador1 = 0;
        switch (eleccion.toLowerCase()) {
            case "piedra":
                jugador1 = 0;
                break;
            case "papel":
                jugador1 = 1;
                break;
            case "tijera":
                jugador1 = 2;
                break;
            default:
                System.out.println("No existe esa elección");
                break;
        }

        if (jugador1 == random) {
            System.out.println("Empate");
        } else {
            switch (jugador1) {
                case 0:
                    if (random == 1) {
                        System.out.println("Gana la máquina (papel envuelve piedra)");
                    } else {
                        System.out.println("Gana el jugador 1 (piedra aplasta tijera)");
                    }
                    break;
                case 1:
                    if (random == 2) {
                        System.out.println("Gana la máquina (tijera corta papel)");
                    } else {
                        System.out.println("Gana el jugador 1 (papel envuelve piedra)");
                    }
                    break;
                case 2:
                    if (random == 0) {
                        System.out.println("Gana la máquina (piedra aplasta tijera)");
                    } else {
                        System.out.println("Gana el jugador 1 (tijera corta papel)");
                    }
                    break;

            }
        }
    }
}