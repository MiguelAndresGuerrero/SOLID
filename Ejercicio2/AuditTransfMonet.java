package Ejercicio2;

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