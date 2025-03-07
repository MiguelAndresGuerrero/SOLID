package Ejercicio2;


class main {
    public static void main(String[] args) {
        Transferencia transferencia = new Transferencia(50000);

        ReglaTransferencia regla = new ReglaMontoAlto();

        Notificador notificador = new NotificadorEmail();

        AuditTransfMonet auditor = new AuditTransfMonet(regla, notificador);

        auditor.transferenciaRealizada(transferencia);

        System.out.println("Operación finalizada.");
    }
}
