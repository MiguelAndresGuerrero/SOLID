package Ejercicio2;

import java.time.LocalDate;

public class Transferencia {
    private int importe;
    private String cuentaOrigen = new String();
    private String cuentaDestino = new String();
    private LocalDate fecha;

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

    public int importe() {
        return importe;
    }
}
// SRP
// OCP