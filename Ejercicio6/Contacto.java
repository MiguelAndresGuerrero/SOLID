package Ejercicio6;

public class Contacto {
    private String Nombre;
    private String CuentaBancaria;
    private String Email;

    public String getNombre(String Nombre) {
        return Nombre;
    }

    public String setCuentaBancaria(String CuentaBancaria) {
        return CuentaBancaria;
    }

    public String getEmail(String Email) {
        return Email;
    }

    public void setContacto(String newEmail, String newNombre,  String newCuentaBancaria) {
        this.Email = Email;
        this.Nombre = Nombre;
        this.CuentaBancaria = CuentaBancaria;
    }
}