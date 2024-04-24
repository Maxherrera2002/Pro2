import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {



        public static void main(String[] args) {
            Scanner read = new Scanner(System.in);

            try {

                System.out.print("Ingrese el primer número: ");
                double number1 = read.nextDouble();

                System.out.print("Ingrese el segundo número: ");
                double number2 = read.nextDouble();


                System.out.println("Elija la operación que desea realizar:");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.print("Ingrese el número de la operación: ");
                int option = read.nextInt();

                double result = 0;

                // Realizar la operación seleccionada
                switch (option) {
                    case 1:
                        result = number1 + number2;
                        break;
                    case 2:
                        result = number1 - number2;
                        break;
                    case 3:
                        result = number1 * number2;
                        break;
                    case 4:
                        if (number2 == 0) {
                            System.out.println("Error: No se puede dividir por cero.");
                            return;
                        }
                        result = number1 / number2;
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        return;
                }


                System.out.println("El resultado es: " + result);

            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar valores numéricos.");
            }
        }
    }

