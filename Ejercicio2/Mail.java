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

public class MailBuilder {
    private String destinatario;
    private String mensaje;

    public MailBuilder to(String destinatario) {
        this.destinatario = destinatario;
        return this;
    }

    public MailBuilder withBody(String mensaje) {
        this.mensaje = mensaje;
        return this;
    }

    public Mail build() {
        return new Mail(destinatario, mensaje);
    }
}
// SRP
// DIP