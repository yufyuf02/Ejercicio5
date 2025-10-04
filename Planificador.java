import java.util.ArrayList;

public class Planificador {
    private ArrayList<Proceso> procesos;
    private int siguientePID;

    public Planificador() {
        procesos = new ArrayList<>();
    }

    // Agrega un proceso a la lista "procesos"
    public void agregarProceso(Proceso proceso) {
        procesos.add(proceso);
    }

    // Ejecuta todos los procesos
    public ArrayList<String> ejecutarTodos() {
        ArrayList<String> resultados = new ArrayList<>();
        for (Proceso proceso : procesos) {
            String resultado = proceso.ejecutar();
            resultados.add(resultado);
        }
        return resultados;
    }

    // Método que retorna el siguiente PID disponible
    public int obtenerSiguientePID() {
        return siguientePID++;
    }
    // Método adicional para mostrar la cantidad de procesos
    public int cantProcesos() {
        return procesos.size();
    }
}
