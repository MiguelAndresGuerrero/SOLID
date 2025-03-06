package Ejercicio3;

public class Cliente {
    private String nombre;
    private Localidad localidad;
    private float saldo;

    public Cliente(String nombre, Localidad localidad, float saldo) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public float getSaldo() {
        return saldo;
    }
}