package Ejercicio2;

public class ReglaMontoAlto implements ReglaTransferencia {
    public boolean esImportante(Transferencia transferencia) {
        return transferencia.importe() > 50000;
    }
}
