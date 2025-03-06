package Ejercicio5;

public class Factura implements IOadLectura<Factura>, IOadEscritura<Factura> {
    @Override
    public void insertar(Factura entidad) {
    }

    @Override
    public void actualizar(Object id, Factura entidad) {
    }

    @Override
    public void eliminar(Object id) {
    }

    @Override
    public Factura[] obtenerTodos() {
        return new Factura[0];
    }

    @Override
    public Factura obtenerPorId(Object id) {
        return null;
    }
}