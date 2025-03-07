package Ejercicio2;

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
