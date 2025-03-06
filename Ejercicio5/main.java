package Ejercicio5;

public interface IOadLectura<T> {
    T[] obtenerTodos();
    T obtenerPorId(Object id);
}

public interface IOadEscritura<T> {
    void insertar(T entidad);
    void actualizar(Object id, T entidad);
    void eliminar(Object id);
}

public interface IOad<T> extends IOadLectura<T>, IOadEscritura<T> { }
// ISP