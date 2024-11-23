public abstract class CanalNotificacion {
    protected String usuario;
    protected String mensaje;

    public CanalNotificacion(String usuario, String mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }
    public CanalNotificacion(){

    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public abstract void enviarNotificacion();

    @Override
    public String toString() {
        return "CanalNotificacion{" +
                "usuario='" + usuario + '\'' +
                ", mensaje='" + mensaje + '\'' +
                '}';
    }
}
