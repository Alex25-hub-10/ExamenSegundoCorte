package org.Alex;
import java.util.Scanner;

public class ExamenSegundoCorte {
    static Scanner sc = new Scanner(System.in);

    static void menu() {
        System.out.println("==============================");
        System.out.println("CONTROL DE CALIFICACIONES");
        System.out.println("==============================");
        System.out.println("1. Registrar calificaciones");
        System.out.println("2. Mostrar estadísticas");
        System.out.println("3. Salir");
        System.out.println("Seleccione una opción:");
        int opc = sc.nextInt();
        switch (opc){
            case 1:
                System.out.println("==============================");
                System.out.println("Registrar estudiante");
                System.out.println("==============================");
                System.out.println("¿Cuantos estudiantes registrara?");
            case 2:
                System.out.println("==============================");
                System.out.println("Estadisticas del grupo");
                System.out.println("==============================");
            case 3:
                System.out.println("Fin del programa.");
        }
        }
        public static void main (String[] args){
            menu();
        }
    }
