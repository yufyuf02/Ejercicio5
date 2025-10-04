// Clase padre "Proceso"

public abstract class Proceso {
    
    // Usar "protected" en vez de "private" permite que las
    // clases hija puedan acceder ese atributo directamente.
    protected int PID;
    protected String nombre;

    // Constructor
    
    public Proceso(int PID, String nombre, Planificador planificador) {
        this.PID = PID;
        this.nombre = nombre;
        planificador.agregarProceso(this);  // Registra el proceso
    }

    // Métodos
    
    // El abstract hace que cada clase hija tenga-que
    // (sí o sí), implementar dicho método.
    public abstract String ejecutar();

    // Getters
    public int getPID() {
        return PID;
    }
    public String getNombre() {
        return nombre;
    }
}
