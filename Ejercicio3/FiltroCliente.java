package Ejercicio3;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroCliente {
    public List<Cliente> filtrarPorLocalidad(List<Cliente> clientes, Localidad localidad) {
        return clientes.stream()
                .filter(cliente -> cliente.getLocalidad() == localidad)
                .collect(Collectors.toList());
    }

    public List<Cliente> filtrarPorNombre(List<Cliente> clientes, String nombre) {
        return clientes.stream()
                .filter(cliente -> cliente.getNombre().equalsIgnoreCase(nombre))
                .collect(Collectors.toList());
    }

    public List<Cliente> filtrarConSaldo(List<Cliente> clientes) {
        return clientes.stream()
                .filter(cliente -> cliente.getSaldo() > 0)
                .collect(Collectors.toList());
    }
}
