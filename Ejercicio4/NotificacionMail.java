package Ejercicio4;

public class NotificacionMail {
    public void enviarMensajeDeConfirmacion(Orden orden) {
        System.out.println("Enviando confirmación por correo para la orden: " + orden.getId());
    }
}
// SRP