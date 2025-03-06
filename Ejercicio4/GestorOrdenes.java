package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class GestorOrdenes {
    private List<Orden> ordenes = new ArrayList<>();

    public void agregarOrden(Orden orden) {
        ordenes.add(orden);
    }
}