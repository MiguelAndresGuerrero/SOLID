package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class conexionMail {

    private static volatile conexionMail instance;
    private final List<Mail> queue = new ArrayList<>();

    private conexionMail() {}

    public static conexionMail getInstance() {
        if(instance == null) {
            synchronized (conexionMail.class){
                if (instance == null) {
                    instance = new conexionMail();
                }
            }
        }
        return instance;
    }

    public void cerrar() {

    }

    public void enviar(Mail mail) {
        queue.add(mail);
    }

    public List<Mail> getQueue() {
        return List.copyOf(queue);
    }
}
// SRP
// OCP
// DIP