public class MensajeTexto extends CanalNotificacion implements Personalizable {
    private String numeroTelefono;

    public MensajeTexto(String usuario, String mensaje, String numeroTelefono) {
        super(usuario, mensaje);
        this.numeroTelefono = numeroTelefono;
    }
    public MensajeTexto(){

    }
    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviarNotificacion() {
        // Simulación del proceso de envío de mensaje de texto
        System.out.println("Enviando mensaje de texto a " + numeroTelefono + " con el mensaje: " + mensaje);
    }

    @Override
    public void personalizarMensaje(String nuevoMensaje) {
        this.mensaje = nuevoMensaje;
        System.out.println("Mensaje personalizado para " + usuario + ": " + mensaje);
    }

    @Override
    public String toString() {
        return super.toString() + ", MensajeTexto{" +
                "numeroTelefono='" + numeroTelefono + '\'' +
                '}';
    }
}