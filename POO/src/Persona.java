public class Persona {
    String nombre;
    String apellidos;
    String numeroDocumentoIdentidad;
    int anioNacimiento;
    String paisNacimiento;
    char  genero;

    Persona (String nombre,String apellidos,String numeroDocumentoIdentidad,int anioNacimiento,String paisNacimiento,char  genero){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.numeroDocumentoIdentidad=numeroDocumentoIdentidad;
        this.anioNacimiento = anioNacimiento;
        this.paisNacimiento = paisNacimiento;
        if (genero == 'H' || genero == 'M') {
            this.genero = genero;
        } else {
            throw new IllegalArgumentException("Género inválido. Debe ser 'H' para Hombre o 'M' para Mujer.");
        }

    }
    void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellidos);
        System.out.println("Numero Documento: "+numeroDocumentoIdentidad);
        System.out.println("Anio: "+anioNacimiento);
        System.out.println("Pais: "+paisNacimiento);
        System.out.println("Genero: "+genero);
        System.out.println();
    }
}
