package Ejercicio2;

public interface Notificador {
    void enviarMensaje(String destinatario, String mensaje);
}

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

public interface ReglaTransferencia {
    boolean esImportante(Transferencia transferencia);
}

public class ReglaMontoAlto implements ReglaTransferencia {
    public boolean esImportante(Transferencia transferencia) {
        return transferencia.importe() > 50000;
    }
}

public class AuditTransfMonet {
    private final ReglaTransferencia regla;
    private final Notificador notificador;

    public AuditTransfMonet(ReglaTransferencia regla, Notificador notificador) {
        this.regla = regla;
        this.notificador = notificador;
    }

    public void transferenciaRealizada(Transferencia transferencia) {
        if (regla.esImportante(transferencia)) {
            notificador.enviarMensaje("mail-auditor", "aviso-transferencia-importante");
        }
    }
}
// OCP
// SRP
// DIP