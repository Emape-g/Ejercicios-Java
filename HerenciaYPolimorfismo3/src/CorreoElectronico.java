public class CorreoElectronico extends CanalNotificacion implements Personalizable {
    private String direccionCorreo;

    public CorreoElectronico(String usuario, String mensaje, String direccionCorreo) {
        super(usuario, mensaje);
        this.direccionCorreo = direccionCorreo;
    }
    public CorreoElectronico(){

    }
    public String getDireccionCorreo() {
        return direccionCorreo;
    }

    public void setDireccionCorreo(String direccionCorreo) {
        this.direccionCorreo = direccionCorreo;
    }

    @Override
    public void enviarNotificacion() {
        // Simulación del proceso de envío de correo electrónico
        System.out.println("Enviando correo a " + direccionCorreo + " con el mensaje: " + mensaje);
    }

    @Override
    public void personalizarMensaje(String nuevoMensaje) {
        this.mensaje = nuevoMensaje;
        System.out.println("Mensaje personalizado para " + usuario + ": " + mensaje);
    }

    @Override
    public String toString() {
        return super.toString() + ", CorreoElectronico{" +
                "direccionCorreo='" + direccionCorreo + '\'' +
                '}';
    }
}
