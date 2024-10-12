

public class Ejercicio1 {
    public void ejercicio1() {
        int suma = 0;
        for(int i = 1 ; i <= 1000 ; i++){
            for(int j = 1 ; j < i ; j++){
                if (i%j == 0){
                    suma += j;
                }
            }
            if(suma == i){
                System.out.println("Este es un numero perfecto "+i);
            }
            suma = 0;
        }

    }
}
