import Ejer10.LibroDeTexto;
import Ejer10.LibroDeTextoUNC;
import Ejer10.Novelas;
import Ejer8.Gerente;
import Ejer8.Trabajadores;
import Ejer9.Circulo;
import Ejer9.Rectangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean auxWhile = true;
        while (auxWhile) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un ejercicio(0 para salir, -1 para limpiar consola): ");
            String auxAct = scanner.nextLine();
            int activity = Integer.parseInt(auxAct);
            switch (activity) {
                case -1:
                    for (int i = 0; i < 50; ++i) System.out.println();
                    break;
                case 0:
                    System.out.println("Finaliza el TP1");
                    auxWhile = false;
                    break;
                case 1:
                    System.out.println("--- --- Ejercicio 1 --- ---");
                    System.out.println("Un TAD es un tipo abstracto de datos, es un tipo de dato inependiente con sus propias propiedades y operaciones definidas por un especificacion");
                    System.out.println("--- --- FIN Ejercicio 1 --- ---");
                    break;
                case 2:
                    System.out.println("--- --- Ejercicio 2 --- ---");
                    System.out.println("El encapsulamiento sucede en la orientacion programacion orientada a objetos(POO), y es la capacidad de ocultar(encapsular)\n" +
                            "los datos de un objeto(ya sean atributtos, metodos, etc)");
                    System.out.println("-- FIN Ejercicio 2 -->");
                    break;
                case 3:
                    System.out.println("--- --- Ejercicio 3 --- ---");
                    System.out.println("los procedimientos, metodos y funciones, todas son usadas con un proposito especifico y en su mayoria para tareas que se\n" +
                            "repiten varias veces, por otro lado, las funciones a diferencia de los metodos y procedimientos, necesita devolver un valor,\n" +
                            "un procedimiento y metodo no necesitan, necesariamente, devolver un valor, por otro lado, los metodos a diferencia de los otros\n" +
                            "dos, es en escencia una funcion pero a diferencia de estas, los metodos estan relacionados a una clase de objeto especifica.");
                    System.out.println("--- --- FIN Ejercicio 3 --- ---");
                    break;
                case 4:
                    System.out.println("--- --- Ejercicio 4 --- ---");
                    System.out.println("UML, es un lenguaje de modelo unificado para el modelado de sistemas de software(estructura, comportamiento, etcetc)\n" +
                            "y se representa la clase en un rectangulo, en la parte superior su nombre, en el medio sus atributos y por debajo los metodos");
                    System.out.println("-- FIN Ejercicio 4 -->");
                    break;
                case 5:
                    System.out.println("--- --- Ejercicio 5 --- ---");
                    System.out.println("* \"Primera letra en mayuscula\" --> solo se aplica a las clases(aunque se puede escribir en minuscula, por convencion no se hace)\n" +
                            "* \"Primera letra en minuscula\" --> solo se aplica a atributos(y metodos)\n" +
                            "* \"Final\" --> se aplica a clases, atributos y metodos\n" +
                            "* \"Static\" --> se aplica a clases, atributos y metodos\n" +
                            "* \"Public\" --> se aplica a clases, atributos y metodos\n" +
                            "* \"Private\" --> se aplica a clases, atributos y metodos");
                    System.out.println("--- --- FIN Ejercicio 5 --- ---");
                    break;
                case 6:
                    System.out.println("--- --- Ejercicio 6 --- ---");
                    System.out.println("-------Un constructor…\n" +
                            "o Es el método principal para ejecutar un programa. --> **Falso**\n" +
                            "o Crea instancias. --> **Verdadero**\n" +
                            "o Devuelve el valor de un atributo privado. --> **Falso**\n" +
                            "o Tiene sentencia return. --> **Falso**\n" +
                            "o Siempre existe uno por defecto, sin parámetros ni inicializaciones de atributos. --> **Verdadero**\n" +
                            "o Se puede sobreescribir. --> **Verdadero**\n" +
                            "o Se puede sobrecargar. --> **Verdadero**\n" +
                            "o Su nombre se escribe con mayúscula. --> **Falso**\n" +
                            "o Su calificador de acceso es static. --> **Falso**\n" +
                            "o Su tipo de devolución no se indica y corresponde a la clase. --> **Verdadero**\n" +
                            "------- Un método…\n" +
                            "o Puede tener múltiples parámetros con el mismo nombre, siempre y cuando tengan tipos\n" +
                            "diferentes. --> **Falso\n" +
                            "o Puede sobrecargarse. --> **Verdadero**\n" +
                            "o Puede sobreescribirse. --> **Verdadero**\n" +
                            "o Puede ser static. --> **Verdadero**\n" +
                            "o Puede ser tanto public como protected, pero no private. --> **Falso**\n" +
                            "o Un método puede tener un modificador de acceso final. --> **Verdadero**");
                    System.out.println("--- --- FIN Ejercicio 6 --- ---");
                    break;
                case 7:
                    System.out.println("--- --- Ejercicio 7 --- ---");
                    System.out.println("a- Se necesita que cualquiera pueda acceder al color de un vehículo. Entonces, declaro color como:\n" +
                            "-->Public<--\n" +
                            "b- Se necesita que color se pueda acceder a través no sólo de vehículo, sí no ahora también de\n" +
                            "Buses, y como todos sabemos un bus es un tipo de vehículo, entonces también deberá tener\n" +
                            "acceso a color. Entonces, declaro color como: --> un atributo protegido <--\n" +
                            "a- Se necesita que color se pueda acceder solamente para vehículo. Entonces, declaro color como: un atributo privado");
                    System.out.println("--- --- FIN Ejercicio 7 --- ---");
                    break;
                case 8:
                    System.out.println("--- --- Ejercicio 8 --- ---");
                    Gerente g1 = new Gerente("Jere", 18, "2000", "mucha", "Seguridad");
                    Trabajadores t1 = new Trabajadores("Nico", 20, "1000", "Media", "Limpieza");
                    System.out.println("El gerente habla: ");
                    g1.organizadorDept();
                    System.out.println("El Trabajador habla: ");
                    t1.produciendoArea();
                    System.out.println("--- --- FIN Ejercicio 8 --- ---");
                    break;
                case 9:
                    System.out.println("--- --- Ejercicio 9 --- ---");
                    Circulo circulo = new Circulo(6);
                    Rectangulo rectangulo = new Rectangulo(4, 10);

                    System.out.println("Círculo:");
                    System.out.println("Área: " + circulo.calcularArea());
                    System.out.println("Perímetro: " + circulo.calcularPerimetro());

                    System.out.println("\nRectángulo:");
                    System.out.println("Área: " + rectangulo.calcularArea());
                    System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
                    System.out.println("--- --- FIN Ejercicio 9 --- ---");
                    break;
                case 10:
                    System.out.println("--- --- Ejercicio 10 --- ---");
                    Novelas ln1 = new Novelas("Los tres cerditos", "Joseph Jacobs", 23.300, "Fabula");
                    LibroDeTexto lt1 = new LibroDeTexto("Programacion", "Steave jobs", 2000, "3°");
                    LibroDeTextoUNC ltUCN1 = new LibroDeTextoUNC("Colombia", "presidente de colombia", 0, "1°","Facultad Colombiana");
                    System.out.println("\nNovela");
                    ln1.imprimirInformacion();
                    System.out.println("\nLibro de texto");
                    lt1.imprimirInformacion();
                    System.out.println("\nLibro de texto Colombiano");
                    ltUCN1.imprimirInformacion();
                    System.out.println("--- --- FIN Ejercicio 10 --- ---");
                    break;
                default:
                    System.out.println("Ingrese un numero correcto (1-10)");
                    break;
            }

        }

    }
}