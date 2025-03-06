package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class LogicaClientes {
    private List<Cliente> clientes = new ArrayList<>();
    private FiltroClientes filtro = new FiltroClientes();

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> obtenerClientesPorLocalidad(Localidad localidad) {
        return filtro.filtrarPorLocalidad(clientes, localidad);
    }

    public List<Cliente> obtenerClientesPorNombre(String nombre) {
        return filtro.filtrarPorNombre(clientes, nombre);
    }

    public List<Cliente> obtenerClientesConSaldo() {
        return filtro.filtrarConSaldo(clientes);
    }
}