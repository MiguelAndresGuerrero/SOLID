package Ejercicio2;

import java.time.LocalDate;

public class Transferencia {
    private final int importe;
    private final String cuentaOrigen;
    private final String cuentaDestino;
    private final LocalDate fecha;

    public Transferencia(int importe) {
        this.importe = importe;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.fecha = LocalDate.now();
    }

    public int getImporte() {
        return importe;
    }

    public String getCuentaOrigen() {
        return cuentaOrigen;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}
// SRP
// OCP