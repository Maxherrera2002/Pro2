import Cuentass.Savings_account;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int saldoInicialAhorros, opc, aux = 0, cantidadDepositar, cantidadRetirar;
        Scanner teclado = new Scanner(System.in);
        Savings_account cuenta1 = null;

        do {
            System.out.println("Bienvenido a SU BANCO");
            System.out.println("1. Crear cuenta de ahorros");
            System.out.println("2. Consignar dinero en la cuenta de ahorros");
            System.out.println("3. Retirar de la cuenta de ahorros");
            System.out.println("4. Mostrar información de la cuenta de ahorros");
            System.out.println("5. Salir");
            System.out.print("Escoja su opcion: \t");
            opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Cuenta de ahorros");
                    System.out.print("Ingrese saldo inicial: $ ");
                    saldoInicialAhorros = teclado.nextInt();
                    cuenta1 = new Savings_account(saldoInicialAhorros, 0);
                    if (!cuenta1.getActive())
                        System.out.println("Cuenta inactiva, debe poseer mas de 10.000$ para mantener activa su cuenta ");
                    else {
                        System.out.println("Su cuenta de ahorros ha sido Aactivada");
                        aux = 1;
                    }
                    break;
                case 2:
                    if (aux == 1) {
                        System.out.print("Ingresar cantidad a consignar: $");
                        cantidadDepositar = teclado.nextInt();
                        cuenta1.to_deposit(cantidadDepositar);
                    } else
                        System.out.println("No se ha creado la cuenta de ahorros");
                    break;
                case 3:
                    if (aux == 1) {
                        System.out.print("Ingresar cantidad a retirar: $");
                        cantidadRetirar = teclado.nextInt();
                        cuenta1.to_withdraw(cantidadRetirar);
                    } else
                        System.out.println("No se ha creado la cuenta de ahorros");
                    break;
                case 4:
                    if (aux == 1) {
                        System.out.println("Información de la Cuenta de ahorros");
                        cuenta1.to_sprint();
                    } else
                        System.out.println("No se ha creado la cuenta de ahorros");
                    break;
                case 5:
                    System.out.println("Gracias por visitar el sistema del banco");
                    break;
                default:
                    System.out.println("Ingrese una de las opciones validas");
            }
        } while (opc!=5);
    }
}