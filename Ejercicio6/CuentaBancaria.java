// Clase Contacto con responsabilidad clara (solo datos personales)
public class Contacto {
    private String nombre;
    private String email;

    public Contacto(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}

public class CuentaBancaria {
    private String numeroCuenta;

    public CuentaBancaria(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
}

public interface INotificacionSender {
    void enviar(String destinatario, String cuerpoMensaje);
}

public class EmailSender implements INotificacionSender {
    @Override
    public void enviar(String destinatario, String cuerpoMensaje) {
        System.out.println("Enviando correo a " + destinatario + ": " + cuerpoMensaje);
    }
}

public class NotificacionService {
    private INotificacionSender sender;

    public NotificacionService(INotificacionSender sender) {
        this.sender = sender;
    }

    public void enviarMensaje(Contacto contacto, String mensaje) {
        sender.enviar(contacto.getEmail(), mensaje);
    }

    public static void main(String[] args) {
        Contacto contacto = new Contacto("Juan Pérez", "juan@email.com");
        INotificacionSender emailSender = new EmailSender();

        NotificacionService servicio = new NotificacionService(emailSender);
        servicio.enviarMensaje(contacto, "Hola Juan, este es tu mensaje");
    }
}
// DIP
// SRP
// OCP