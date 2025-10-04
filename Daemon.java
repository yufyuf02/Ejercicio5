// Clase hija "Daemon" de la clase padre "Proceso"
// Para procesos que trabajan en segundo plano

public class Daemon extends Proceso {

    public Daemon (int PID, String nombre, Planificador planificador) {
        // El "super" llama al constructor de la clase padre
        super (PID, nombre, planificador);
    }

    @Override
    // Aquí ya lo definimos, no es abstracto
    public String ejecutar() {
        return "[" + PID + "] " + nombre + " - (sonidos de compu) (funcionamiento en segundo plano) (más sonidos)";
    }
}