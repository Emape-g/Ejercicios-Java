//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SistemaNotificaciones {
    public static void main(String[] args) {
        Notificaciones sistemaNotificaciones = new Notificaciones(5);

        // Crear canales de notificación
        CorreoElectronico correo1 = new CorreoElectronico("Juan Pérez", "¡Hola Juan!", "juan.perez@example.com");
        MensajeTexto mensaje1 = new MensajeTexto("Ana López", "¡Hola Ana!", "1234567890");

        // Agregar canales de notificación al sistema
        sistemaNotificaciones.agregarCanal(correo1);
        sistemaNotificaciones.agregarCanal(mensaje1);

        // Mostrar canales de notificación disponibles
        System.out.println("Canales de notificación disponibles:");
        sistemaNotificaciones.mostrarCanales();

        // Personalizar mensajes
        sistemaNotificaciones.personalizarMensaje(0, "¡Hola Juan! ¿Cómo estás?");
        sistemaNotificaciones.personalizarMensaje(1, "¡Hola Ana! ¿Te gustaría recibir notificaciones?");

        // Mostrar canales de notificación después de personalizar
        System.out.println("Canales de notificación después de personalizar:");
        sistemaNotificaciones.mostrarCanales();

        // Enviar notificaciones
        sistemaNotificaciones.enviarNotificaciones();
    }
}