# Principios SOLID 

# Trabajo Práctico 1: Principios SOLID

## 1. Principios SOLID

Mencione cuáles son los principios denominados SOLID y describa brevemente sus características.

## 2. Evaluación de principios SOLID en un código existente

### Caso: Transferencias superiores a $50,000 requieren notificación

En una organización, cuando se realizan transferencias superiores a los $50.000, se debe enviar un mail con información de dicha transferencia, notificando al auditor del área para que dé su aprobación.

Evaluar qué principio SOLID no se está cumpliendo y proponer una solución que mantenga la correctitud de los tests.

[Código completo](https://github.com/elagarrigue/AyDS-TP-SOLID/tree/master/src/ayds/tp1/ej2)

### Código original:

```java
public class AuditTransfMonet {

    public void transferenciaRealizada(Transferencia transferencia) {
        if (this.esTransferenciaImportante(transferencia)) {
            String auditor = this.obtenerDireccionMailAuditor();
            String mensaje = this.componerMensajeAviso(transferencia);
            ConexionMail conexionMail = null;

            try {
                conexionMail = this.abrirConexionMail();
                conexionMail.enviar(new Mail().to(auditor).withBody(mensaje));
            } finally {
                if (conexionMail != null) conexionMail.cerrar();
            }
        }
    }

    private boolean esTransferenciaImportante(Transferencia transferencia) {
        return transferencia.importe() > 50000;
    }

    private String obtenerDireccionMailAuditor() {
        return "mail-auditor";
    }

    private String componerMensajeAviso(Transferencia transferencia) {
        return "aviso-transferencia-importante";
    }

    private ConexionMail abrirConexionMail() {
        return ConexionMail.getInstance();
    }
}
```

## 3. Filtrado de clientes por atributo

### Evaluar el cumplimiento de SOLID en el siguiente código:

```java
public enum Localidad {
    NONE,
    BAHIA_BLANCA,
    TRES_ARROYOS
}

public class Cliente {
    public String nombre;
    public Localidad localidad;
    public float saldo;
    // getters, setters...
}

public class LogicaClientes {
    private FiltroClientes filtro = new FiltroClientes();
    ...
    public List<Cliente> getClientesPorLocalidad(Localidad localidad) {
        return filtro.filtroPorLocalidad(clientes, localidad);
    }
    public List<Cliente> getClientesPorNombre(String nombre) {
        return filtro.filtroPorNombre(clientes, nombre);
    }
    public List<Cliente> getClientesConSaldo() {
        return filtro.filtroConSaldo(clientes);
    }
    ...
}
```

Evaluar qué principio SOLID no se está cumpliendo y proponer una solución.

[Código completo](https://github.com/elagarrigue/AyDS-TP-SOLID/tree/master/src/ayds/tp1/ej3)

## 4. Notificación al cliente

### Evaluar SOLID en la notificación por Mail/SMS

```java
public class ProcesadorDeOrdenes {
    public void procesar(Orden orden) {
        if (orden.Isvalid() && new Repositorio().grabar(orden)) {
            NotificarPorMail.getInstance().enviarMensajeDeConfirmacion(orden);
        }
    }
}
```

Evaluar el cumplimiento de SOLID al agregar una notificación por SMS.

[Código completo](https://github.com/elagarrigue/AyDS-TP-SOLID/tree/master/src/ayds/tp1/ej4)

## 5. Capa de acceso a datos de solo lectura

### Problema de implementación de una interfaz OAD

```csharp
public interface IOad {
    void Insert(object entity);
    void Update(object id, object entity);
    void Delete(object id);
    object[] GetAll();
    object GetById(object id);
}

public class FacturaOadDatosReadOnly : IOad {
    public void Insert(object entity) {
        throw new ObjAccDatosReadOnlyException();
    }
    public void Update(object id, object entity) {
        throw new ObjAccDatosReadOnlyException();
    }
    public void Delete(object id) {
        throw new ObjAccDatosReadOnlyException();
    }
    public object[] GetAll() {
        // Obtener todas las facturas
    }
    public object GetById(object id) {
        // Obtener factura por ID
    }
}
```

Evaluar el cumplimiento de SOLID y proponer una solución.

## 6. Enviar email a contacto

```csharp
public class Contacto {
    public string Nombre;
    public string CuentaBancaria;
    public string Email;
}

public interface IMailSender {
    void Enviar(Contacto contacto, string cuerpoMensaje);
}
```

Evaluar qué principio SOLID no se cumple y cómo solucionarlo.

## 7. Análisis de código en un juego

Evaluar los principios SOLID en el siguiente código:

```java
public class Game {
    private KnifeEnemy enemy1;
    private GunEnemy enemy2;

    public void init() {
        enemy1 = new KnifeEnemy();
        enemy2 = new GunEnemy();
    }

    void run() {
        while (!endGame) {
            enemy1.doActionStab();
            enemy2.doActionShoot();
        }
    }
}

public class GunEnemy {
    public void doActionShoot() { }
}

public class KnifeEnemy {
    public void doActionStab() { }
}
```

Identificar dos principios SOLID no cumplidos y proponer una solución.
