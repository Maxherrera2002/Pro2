package enclase_2;

import enclase_2.clases.Magician;
import enclase_2.clases.Rogue;
import enclase_2.clases.Warrior;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        boolean finaly=false;
        String option;
        System.out.println("Ingresar nombre");
        finaly=true;

        while (!finaly){
            System.out.println("Crea un personaje, (Mago[1], Guerrero[2], Picaro[3])");
            option= leer.nextLine();
            if (option.equals("1")){
                System.out.println("Ingresar nombre");
                Magician j1=new Magician(leer.nextLine());
                finaly=true;
            } else if (option.equals("2")) {
                System.out.println("Ingresar nombre");
                Warrior j1 =new Warrior(leer.nextLine());
                finaly=true;
            } else if (option.equals("3")) {
                System.out.println("Ingresar nombre");
                Rogue j1=new Rogue(leer.nextLine());
                finaly=true;
            }else {
                System.out.println("ingresar una opcion correcta");
            }
        }

        System.out.println("---   ---  ---  --");

        Warrior enemi=new Warrior("jefe final");

        finaly=false;

        System.out.println("Se acerca un enemigo");

        System.out.println("vida del enemigo: "+enemi.getLife());
        System.out.println("defensa:");
        int aux;

        while (!finaly){
            System.out.println("[1] atacar");
            System.out.println("[2] correr");

            option= leer.nextLine();

            if(option.equals("1")){
                aux=enemi.toDefending(j1.toDamage());
                System.out.println("---   ---  ---  --");
                if (aux!=0){

                    System.out.println("le has hecho "+aux+" de daño");
                    System.out.println("vida actual del enemigo: "+enemi.getLife());
                } else if (aux==0 && enemi.getLife()>0 ) {
                    System.out.println("tu daño no a tenindo efecto");

                }else if (aux==0 && enemi.getLife()==0){
                    System.out.println("mataste a tu enemigo has ganado");
                }
            } else if (option.equals("2")) {
                System.out.println("has escapadoo");
                System.out.println("finn...");
                break;

            }else{
                System.out.println("ingresar una opcion valida");
                continue;
            }


            System.out.println("El enemigo te ataca");
            aux=j1.toDefending(enemi.toDamage());
            if (aux!=0){

                System.out.println("te han hecho "+aux+" de daño");
                System.out.println("tu vida actual: "+j1.getLife());

            } else if (aux==0 && j1.getLife()>0 ) {
                System.out.println("El daño del enemigo no ha tenido efecto");

            }else if (aux==0 && j1.getLife()==0){
                System.out.println("te han matado has perdido");
                break;
            }

            System.out.println("---  ---  ---");
        }


    }
}
