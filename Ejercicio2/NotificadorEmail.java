package Ejercicio2;

public class NotificadorEmail implements Notificador {
    public void enviarMensaje(String destinatario, String mensaje) {
        ConexionMail conexionMail = null;
        try {
            conexionMail = ConexionMail.getInstance();
            conexionMail.enviar(new Mail().to(destinatario).withBody(mensaje));
        } finally {
            if (conexionMail != null) conexionMail.cerrar();
        }
    }
}
