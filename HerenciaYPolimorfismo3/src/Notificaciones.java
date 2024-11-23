public class Notificaciones {
    private CanalNotificacion[] canales;
    private int contador;

    public Notificaciones(){

    }
    public Notificaciones(int capacidad) {
        canales = new CanalNotificacion[capacidad];
        contador = 0;
    }

    public CanalNotificacion[] getCanales() {
        return canales;
    }

    public void setCanales(CanalNotificacion[] canales) {
        this.canales = canales;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void agregarCanal(CanalNotificacion canal) {
        if (contador < canales.length) {
            canales[contador++] = canal;
        } else {
            System.out.println("Capacidad máxima de canales de notificación alcanzada.");
        }
    }

    public void enviarNotificaciones() {
        for (int i = 0; i < contador; i++) {
            canales[i].enviarNotificacion();
        }
    }

    public void personalizarMensaje(int indice, String nuevoMensaje) {
        if (indice >= 0 && indice < contador && canales[indice] instanceof Personalizable) {
            ((Personalizable) canales[indice]).personalizarMensaje(nuevoMensaje);
        } else {
            System.out.println("Índice de canal de notificación no válido o no personalizable.");
        }
    }

    public void mostrarCanales() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Canal de notificación " + (i + 1) + ": " + canales[i]);
        }
    }
}
