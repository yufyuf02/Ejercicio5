// Clase hija "IO" (Input/Output) de la clase padre "Proceso"
// Para procesos que usarían dispositivos externos

public class IO extends Proceso{

    public IO (int PID, String nombre, Planificador planificador) {
        // El "super" llama al constructor de la clase padre
        super (PID, nombre, planificador);
    }

    @Override
    // Aquí ya lo definimos, no es abstracto
    public String ejecutar() {
        return "[" + PID + "] " + nombre + " - (sonidos de compu) algún proceso de I/O (más sonidos)";
    }
}