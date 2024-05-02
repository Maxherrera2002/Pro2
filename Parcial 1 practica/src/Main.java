

import clases.*;


import java.util.*;

public class Main {


    public static void main(String[] args) {
        Person people;//guardar clase persona
        Athlete athlete;//guardar clase atleta
        Headquarters headquarters;// guardar clase sede
        NationalTeam nationalTeam;//guardar clase equipo nacional

        int optio2=0;//es una variable aux

        boolean bandera = true;
        Scanner read = new Scanner(System.in);
        int option;
        while (bandera) {
            System.out.println("--- * --- * --- * --- * ---");
            System.out.println("Ingresar opcion. [-1] para terminar. ");
            System.out.println("[1] Crear una persona.");
            System.out.println("[2] Crear Atletas");
            System.out.println("[3] Crea Sede, Instalacion y Prueba");
            System.out.println("[4] crear equipo nacional");
            try {

                option = read.nextInt();

                switch (option) {

                    case -1:
                        bandera = false;
                        System.out.println("Fin Parcial 1");
                        break;
                    case 1:
                        people=option1();
                        System.out.println("Persona creada");
                        System.out.println("Nombre: "+people.getName());
                        System.out.println("DNI: "+people.getDni());
                        break;
                    case 2:

                        athlete=option2();
                        System.out.println("Atleta creado");
                        showAthlete(athlete);
                        break;
                    case 3:
                        headquarters=createHeadquarters();
                        showHeadquarters(headquarters);

                        System.out.println("---    --    ---");
                        System.out.println("Es hora de agregar la primera prueba");
                        headquarters.addTest(createTest());

                        System.out.println("---    --    ---");
                        System.out.println("Es hora de agregar la segunda prueba");
                        headquarters.addTest(createTest());
                        System.out.println("*---*---*---*");
                        while (optio2 != 3){
                            System.out.println("Quieres ver la prueba [1] o prueba [2]");
                            System.out.println("[3] para terminar");
                            try {
                                optio2= read.nextInt();
                                switch (optio2) {

                                    case 1:
                                        showTest(headquarters.getTest(1));
                                        System.out.println("--   --");
                                        break;
                                    case 2:
                                        showTest(headquarters.getTest(2));
                                        System.out.println("--   --");
                                        break;
                                    case 3:
                                        break;
                                }
                            }catch (InputMismatchException e){
                                System.out.println("Error: Ingrese un numero entero valido");
                                read.nextLine();
                            }

                        }
                        break;
                    case 4:
                        nationalTeam=createNationalTeam();
                        showNationalTeam(nationalTeam);
                        break;

                }
            }catch (InputMismatchException e){
                System.out.println("Error: Ingrese un numero entero valido");
                read.nextLine();
            }


        }
    }

public static Person option1(){
    Scanner read = new Scanner(System.in);
        int dni;
        String name;
        boolean bandera=true;
        while (true){
            System.out.println("Ingresar DNI");
          try {
              dni= read.nextInt();
              read.nextLine();
              break;
          }catch (InputMismatchException e){
              System.out.println("Error: Ingrese un numero entero valido");
              read.nextLine();
          }
        }

        while (true){
            System.out.println("Ingresar nombre");
        try {
            name= read.nextLine();
            break;
        }catch (InputMismatchException e){
            System.out.println("Error: Ingrese un String valido");
            read.nextLine();
        }
       }
    return new Person(dni,name);
}//crea persona

public static Athlete option2(){
        Person p1=option1();
        Scanner read=new Scanner(System.in);
        List<Athlete>athletes=new ArrayList<>();//atletas
        int age;//edad
        double height=0;//altura
        double weight=0;//peso

        while (true) {
            System.out.println("Ingresar Edad");
            try {
                age = read.nextInt();
                read.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un numero entero valido");
                read.nextLine();
            }
        }
            while (true) {
                System.out.println("Ingresar altura");
                try {
                    height = read.nextDouble();
                    read.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Ingrese un numero valido// Al ingresar numero colocar (,) y no (.)");
                    read.nextLine();
                }
            }
            while (true) {
                System.out.println("Ingresar peso");
                try {
                    weight = read.nextDouble();
                    read.nextLine();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Ingrese un numero valido// Al ingresar numero colocar (,) y no (.)");
                    read.nextLine();
                }
            }

        Athlete athlete=new Athlete(p1, height, age,  weight);
        return athlete;

}//crea atleta
public static void showAthlete(Athlete athlete){//muestra atributos atleta
    System.out.println("Nombre: "+athlete.getName());
    System.out.println("Edad: "+athlete.getAge());
    System.out.println("DNI: "+athlete.getDni());
    System.out.println("Altura: "+athlete.getHeight());
    System.out.println("Peso: "+athlete.getWeight());
    System.out.println("IMC: "+athlete.calculateBMI());
    if(athlete.thereisExtraWeight()){
        double weight = athlete.getWeight();
        System.out.println(athlete.getName()+" esta "+athlete.Overweight()+"kg pasado de su peso ideal");
    }else {
        System.out.println(athlete.getName()+" no esta pasado de peso");
    }

}//muestra datos de persona



public static Test createTest(){//crea prueba
    Scanner read=new Scanner(System.in);
    int code;//codigo
    String title;//titulo
    List<Athlete> athletes=new ArrayList<>();//atletas

    while (true){
        System.out.println("Ingresar codigo de prueba");
        try {
            code= read.nextInt();
            read.nextLine();
            break;
        }catch (InputMismatchException e){
            System.out.println("Ingresa un numero entero");
            read.nextLine();
        }
    }

    System.out.println("Ingresar titulo");
    title=read.nextLine();

    System.out.println("---       ---");

    System.out.println("Creacion atleta 1");
    athletes.add(option2());

    System.out.println("---       ---");

    System.out.println("Creacion atleta 2");
    athletes.add(option2());

    System.out.println("---       ---");

    System.out.println("Creacion atleta 3");
    athletes.add(option2());

    System.out.println("---       ---");
    Test test=new Test(code,  title, athletes);
    System.out.println("Codigo de prueba ingresado: "+test.getCode());
    System.out.println("Titulo: "+test.getTitle());
    System.out.println("Atleta 1: "+test.getAthlete(1).getName());
    System.out.println("Atleta 2: "+test.getAthlete(2).getName());
    System.out.println("Atleta 3: "+test.getAthlete(3).getName());
    return test;
}

public static Headquarters createHeadquarters(){
    Scanner read=new Scanner(System.in);
    int phase;//fase
    String date;//fecha
    String hour;//hora




    while (true){
        System.out.println("Ingresar fase");
        try {
              phase= read.nextInt();
              read.nextLine();

              if (phase>0){
                  break;
              }else {
                  System.out.println("Ingresar numero mayor a 0");
              }
        }catch (InputMismatchException e){
            System.out.println("Error: ingresar numero entero");
            read.nextLine();
        }
    }


    int aux=0;
    while (true){

        System.out.println("Ingresar fecha de la sede formato dd/mm/yyyy");
        date=read.nextLine();

            for (int i = 0; i < date.length(); i++) {
                char c = date.charAt(i);
                if (i == 2 || i == 5) {
                    if (c != '/') {
                        aux += 1;
                    }
                } else {
                    if (!Character.isDigit(c)) {
                        aux += 1;
                    }
                }
            }
            if (aux==0){
                break;
            }else {
                System.out.println("ERROR: ingresar una fecha con formato dd/mm/yyyy");
                aux=0;
            }

    }
    while (true){

        System.out.println("Ingresar hora");
        try {
            hour=read.nextLine();
            break;
        }catch (InputMismatchException e){
            System.out.println("ERROR: ingresar una hora");
        }
    }

    Headquarters headquarters=new Headquarters(phase, date, hour, createInstallation());
    return headquarters;
}// crea sede


public static Installation createInstallation(){
        Scanner read=new Scanner(System.in);
    System.out.println("Creacion de Instalacion");
    System.out.println("Ingresar categoria");
        String category= read.nextLine();
    System.out.println("Ingresar localizacion");
        String location= read.nextLine();
    System.out.println("Ingresar nombre de instalacion");
    String name= read.nextLine();
    System.out.println("Ingresar tipo");
    String type= read.nextLine();
    return new Installation(category,location,name,type);
} //crea una instalacion



public static void showHeadquarters(Headquarters headquarters){ //sout de datos de sede
    System.out.println("Fecha: "+headquarters.getDate());
    System.out.println("Hora: "+headquarters.getHour());
    System.out.println("Fase: "+headquarters.getPhase());
    System.out.println("Nombre de la instalacion cargada: "+headquarters.getInstallation().getName());
}//sout de datos de sede

public static void showTest(Test test){//muestra datos test
    Scanner read=new Scanner(System.in);
    int opt;
    System.out.println("Codigo: de prueba ingresado "+test.getCode());
    System.out.println("Titulo: "+test.getTitle());
    while (true) {
        System.out.println("¿Que atleta quieres ver?");
        try {
            opt= read.nextInt();
            read.nextLine();
            if(opt>0 && opt <4){
              break;
            }else {
                System.out.println("ERROR: Ingresar numero entero entre 1 y 3");
            }
        }catch (InputMismatchException e){
            System.out.println("ERROR: Ingresar numero entero entre 1 y 3");
            read.nextLine();
        }
    }
    System.out.println("El atleta en la posicion "+opt+" es: ");
    Athlete a=test.getAthlete(opt);
    showAthlete(a);
}//muestra datos test

public static NationalTeam createNationalTeam(){
    Scanner read=new Scanner(System.in);
    String colour;//color
    String country;//pais

    System.out.println("Ingresar color del equipo nacional");
    colour= read.nextLine();

    System.out.println("Ingresar pais del equipo");
    country=read.nextLine();

    NationalTeam nationalTeam=new NationalTeam(colour, country);
    System.out.println("---   ---   --");

    System.out.println("ingresar atleta 1");
    nationalTeam.addAthlete(option2());

    System.out.println("---   ---   --");
    System.out.println("ingresar atleta 1");
    nationalTeam.addAthlete(option2());

    System.out.println("---   ---   --");
    System.out.println("ingresar atleta 1");
    nationalTeam.addAthlete(option2());

    System.out.println("---   ---   --");
    return nationalTeam;
}
public static void showNationalTeam(NationalTeam nat){

    System.out.println("Color equipo: "+nat.getColour());
    System.out.println("Pais: "+nat.getColour());

    System.out.println("Atleta 1: ");
    showAthlete(nat.getAthlete(1));
    System.out.println("Atleta 2: ");
    showAthlete(nat.getAthlete(2));
    System.out.println("Atleta 3: ");
    showAthlete(nat.getAthlete(3));
}

}