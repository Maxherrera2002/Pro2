import Ejercicio2.Executer;
import Ejercicio3.Week;
import Ejercicio4.Execute;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""

                    Ingrese el numero de una de las opciones:
                    Ejercicios no codificados ---> 1 \s
                    Ejercicios codificados ---> 2\s
                    Salir ---> 0""");
            String auxAct = scanner.nextLine();
            int activity = Integer.parseInt(auxAct);
            if (activity == 1) {
                noCode();
            } else if (activity == 2) {
                codification();
            } else if (activity == 0) {
                System.out.println("Gracias por ver los ejercicios TP3 de Jeremias De Miguel");
                break;
            }else {
                System.out.println("Ingrese un numero correcto");
            }
        }
    }
    public static void noCode(){
        System.out.println("Se mostrara por pantalla los ejercicio de respuestas que no contienen codigo, para mejor calidad leerlo desde el propio archivo, 'exercisenocode.md'");
        String directorioActual = System.getProperty("user.dir");
        String rutaCarpetaSuperior = directorioActual + File.separator + "TPN3/"+"src";
        String rutaArchivo = rutaCarpetaSuperior+ File.separator +"exercisenocode.md";
        try {
            Scanner scanner = new Scanner(new File(rutaArchivo));
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + e.getMessage());
        }
    }
    public static void codification(){
        boolean auxWhile = true;
        while (auxWhile) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un ejercicio(0 para salir, -1 para limpiar consola): ");
            String auxAct = scanner.nextLine();
            int activity = Integer.parseInt(auxAct);
            switch (activity) {
                case -1 -> {
                    for (int i = 0; i < 50; ++i) System.out.println();
                }
                case 0 -> {
                    System.out.println("Finaliza el TP1");
                    auxWhile = false;
                }
                case 1 -> {
                    System.out.println("-- Ejercicio 1 -->");
                    System.out.println("-- FIN Ejercicio 1 -->");
                }
                case 2 -> {
                    System.out.println("-- Ejercicio 2 -->");
                    new Executer();
                    System.out.println("-- FIN Ejercicio 2 -->");
                }
                case 3 -> {
                    System.out.println("-- Ejercicio 3 -->");
                    new Week();
                    System.out.println("-- FIN Ejercicio 3 -->");
                }
                case 4 -> {
                    System.out.println("-- Ejercicio 4 -->");
                    new Execute();
                    System.out.println("-- FIN Ejercicio 4 -->");
                }
                case 5 -> {
                    System.out.println("-- Ejercicio 5 -->");
                    System.out.println("-- FIN Ejercicio 5 -->");
                }
                default -> System.out.println("Ingrese un numero correcto");
            }

        }
    }
}