import java.util.Scanner;
/*Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
calcule e imprima el costo total del viaje.*/
public class Ejercicio5 {
    public void ejercicio5() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese distancia del viaje en kílometros: ");

        int kilometros = sc.nextInt();

        System.out.println("Ingrese cantidad de combustible que consume por kilómetro en litros ");

        int litros = sc.nextInt();

        System.out.println("Ingrese el precio del combustible por litro: ");

        double combustible = sc.nextDouble();

        double tolal = (kilometros * litros)*combustible;

        System.out.println("El costo total del viaje es de: "+tolal);


    }
}
