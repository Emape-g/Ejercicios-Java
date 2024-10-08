import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio1 {
    public void ejercicio1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digame su fecha de nacimiento: ");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fecha = sc.nextLine();
        LocalDate fechaNac = null;
        try {
            fechaNac = LocalDate.parse(fecha, formato);
            System.out.println(fechaNac);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int dia = fechaNac.getDayOfMonth();
        int mes = fechaNac.getMonthValue();
        String signo = null;

        if ((dia >= 21 && mes == 3) || (dia <= 19 && mes == 4)) signo = "Aries";
        if ((dia >= 20 && mes == 4) || (dia <= 20 && mes == 5)) signo = "Tauro";
        if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)) signo = "Géminis";
        if ((dia >= 21 && mes == 6) || (dia <= 22 && mes == 7)) signo = "Cáncer";
        if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)) signo = "Leo";
        if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)) signo ="Virgo";
        if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) signo ="Libra";
        if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)) signo = "Escorpio";
        if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) signo = "Sagitario";
        if ((dia >= 22 && mes == 12) || (dia <= 19 && mes == 1)) signo = "Capricornio";
        if ((dia >= 20 && mes == 1) || (dia <= 18 && mes == 2)) signo = "Acuario";
        if ((dia >= 19 && mes == 2) || (dia <= 20 && mes == 3)) signo = "Piscis";
        System.out.println("Tu signo es "+signo);
        signo = signo.toLowerCase();
        if (signo.equals("aries")) {
            System.out.println("Hoy es un buen día para tomar decisiones audaces.");
        } else if (signo.equals("tauro")) {
            System.out.println("La estabilidad que has buscado está cerca, ten paciencia.");
        } else if (signo.equals("géminis")) {
            System.out.println("Tu curiosidad te llevará a nuevas oportunidades hoy.");
        } else if (signo.equals("cáncer")) {
            System.out.println("Escucha tus emociones, te guiarán por el camino correcto.");
        } else if (signo.equals("leo")) {
            System.out.println("Es un gran día para mostrar tu liderazgo y carisma.");
        } else if (signo.equals("virgo")) {
            System.out.println("Presta atención a los detalles en el trabajo, evitarás errores.");
        } else if (signo.equals("libra")) {
            System.out.println("Busca el equilibrio en tus relaciones personales.");
        } else if (signo.equals("escorpio")) {
            System.out.println("Tu intuición está fuerte hoy, confía en tus instintos.");
        } else if (signo.equals("sagitario")) {
            System.out.println("Una aventura inesperada podría estar esperándote.");
        } else if (signo.equals("capricornio")) {
            System.out.println("La perseverancia será clave para alcanzar tus metas.");
        } else if (signo.equals("acuario")) {
            System.out.println("Hoy es el día para pensar fuera de lo común.");
        } else if (signo.equals("piscis")) {
            System.out.println("Deja que tu creatividad fluya, te sorprenderás con los resultados.");
        } else {
            System.out.println("Error: signo no encontrado.");
        }
        }
    }


