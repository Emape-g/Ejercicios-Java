import java.util.Scanner;

public class Ejercicio6 {
    public void ejercicio6() {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantas horas al dia dormis?: ");

        int dormir = sc.nextInt();

        System.out.println("¿Cuantas horas haces ejercicio? ");

        int ejercicio = sc.nextInt();

        System.out.println("¿Cuantas comidas saludables comes al dia?");

        int comidas = sc.nextInt();
        String resultado = "";
        if (dormir >= 7 && dormir <= 9) {
            resultado += "Duerme bien. ";
        } else if (dormir < 7) {
            resultado += "Deberías dormir más horas. ";
        } else {
            resultado += "Demasiadas horas de sueño, asegúrate de que sea reparador. ";
        }


        if (ejercicio >= 1) {
            resultado += "Haces ejercicio suficiente. ";
        } else {
            resultado += "Intenta hacer más ejercicio. ";
        }


        if (comidas >= 3) {
            resultado += "Mantienes una buena alimentación. ";
        } else {
            resultado += "Intenta consumir más comidas saludables. ";
        }
        System.out.println(resultado);
    }
}
