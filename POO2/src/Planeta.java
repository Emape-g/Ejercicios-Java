enum TipoPlaneta {
    GASEOSO,TERRESTRE,ENANO
}
public class Planeta {
    String nombre = null;
    int cantSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    double distanciaMediaSol = 0;
    TipoPlaneta tipo;
    boolean observalbe = false;
    double periodoOrbital = 0;
    double periodoRotacion = 0;
    Planeta() {

    }
    Planeta(String nombre, int cantSatelites, double masa, double volumen, int diametro, double distanciaMediaSol, TipoPlaneta tipo,boolean observalbe, double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantSatelites = cantSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaSol = distanciaMediaSol;
        this.tipo = tipo;
        this.observalbe = observalbe;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;

    }
    void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("CantSatelites: " + cantSatelites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " km³");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Distancia media al Sol: " + distanciaMediaSol + " millones de km");
        System.out.println("Tipo de planeta: " + tipo);
        System.out.println("Observalbe: " + observalbe);
        System.out.println("Periodo Orbital: " + periodoOrbital);
        System.out.println("Periodo Rotacion: " + periodoRotacion);

    }
    public double calcularDensidad(){
        return masa/volumen;
    }
    public boolean esPlanetaExterior() {
        double distanciaEnKm = distanciaMediaSol * 149597870;
        return distanciaEnKm > 3.4 * 149597870;
    }

}
