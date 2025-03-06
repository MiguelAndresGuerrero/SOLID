package Ejercicio5;

public class FacturaRead implements IOadLectura<Factura> {
    @Override
    public Factura[] obtenerTodos() {
        return new Factura[0];
    }

    @Override
    public Factura obtenerPorId(Object id) {
        return null;
    }
}
