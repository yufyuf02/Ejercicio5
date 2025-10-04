// Autora: Yu-Fong Chen
// Fecha: 03/10/2025
// Descripción: Polimorfismo

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Planificador planificador = new Planificador();

        // Procesos quemados para tener unos iniciales
        new CPU(planificador.obtenerSiguientePID(), "Compilando", planificador);
        new IO(planificador.obtenerSiguientePID(), "Leyendo CD", planificador);
        new Daemon(planificador.obtenerSiguientePID(), "Chequeando por viruses", planificador);

        int seleccion = 0;
        
        while (seleccion == 0) {

            System.out.println(
                "\n*** BIENVENIDO AL SISTEMA OPERATIVO ***\n" +
                "Procesos registrados: " + planificador.cantProcesos() + "\n"
            );
            System.out.println(
                "¿Qué le gustaría hacer?\n" +
                "(1) Ejecutar todos los procesos\n" +
                "(2) Crear un proceso\n" +
                "(3) Salir"
            );  
            seleccion = teclado.nextInt();
    
            if (seleccion == 1) {
    
                // Ejecuta los procesos
                ArrayList<String> resultados = planificador.ejecutarTodos();
                
                // Los imprime
                System.out.println("");
                for (String resultado : resultados) {
                System.out.println(resultado);
                }
                // System.out.println(":)\n");
                seleccion = 0;
            } else if (seleccion == 2) {
                System.out.println(
                    "¿Qué tipo de proceso quisiera crear?\n" +
                    "(1) CPU\n" +
                    "(2) Input/Output\n" +
                    "(3) Daemon"
                );
                seleccion = teclado.nextInt();
                
                if (seleccion == 1) {
                    int PID = planificador.obtenerSiguientePID();
                    System.out.println(
                    "Ingrese el nombre del proceso que quiere crear: ");
                    teclado.nextLine();              // >:(
                    String nombre = teclado.nextLine();
                    new CPU(PID, nombre, planificador);
                    System.out.println("Proceso CPU '" + nombre + "' creado.");
                    seleccion = 0;

                } else if (seleccion == 2) {
                    int PID = planificador.obtenerSiguientePID();
                    System.out.println(
                    "Ingrese el nombre del proceso que quiere crear: ");
                    teclado.nextLine();              // >:(
                    String nombre = teclado.nextLine();
                    new IO(PID, nombre, planificador);
                    System.out.println("Proceso IO '" + nombre + "' creado.");
                    seleccion = 0;
                    
                } else if (seleccion == 3) {
                    int PID = planificador.obtenerSiguientePID();
                    System.out.println("Ingrese el nombre del proceso que quiere crear: ");
                    teclado.nextLine();              // >:(
                    String nombre = teclado.nextLine();
                    new Daemon(PID, nombre, planificador);
                    System.out.println("Proceso Daemon '" + nombre + "' creado.");
                    seleccion = 0;

                } else {
                    System.out.println("Opción inválida");
                    seleccion = 0;
                }

            } else if (seleccion == 3) {
                System.out.println(":)");
            } else {
                System.out.println("Opción inválida");
                seleccion = 0;
            }
        }
    }
}
