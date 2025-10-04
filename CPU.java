// Clase hija "CPU" de la clase padre "Proceso"
// Para procesos que necesitan de capacidad de cálculo (CPU)

public class CPU extends Proceso {
    
    public CPU (int PID, String nombre, Planificador planificador) {
        // El "super" llama al constructor de la clase padre
        super (PID, nombre, planificador);
    }

    @Override
    // Aquí ya lo definimos, no es abstracto
    public String ejecutar() {
        return "[" + PID + "] " + nombre + " - (sonidos de compu) algún proceso de CPU (más sonidos)";
    }
}