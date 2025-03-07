package Ejercicio2;

public class Mail {
    private final String destinatario;
    private final String mensaje;

    public Mail(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }
}

// SRP
// DIP