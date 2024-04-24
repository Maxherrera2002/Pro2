import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int[] numbers = new int[10];
        for(int i=0; i<10;i++){
            System.out.println("Ingresar el numero que va en la posicion "+(i+1)+": ");
            numbers[i]= read.nextInt();
        }


        int max=0;
        int positionmax= 0;

        for (int i=0; i<10;i++){
            if(numbers[i] > max){
                max=numbers[i];
                positionmax=i;
            }
        }

        int maxcousin=0;
        int positionmaxcousin=0;

        for (int i=0;i<10;i++){
            if(numbers[i]>maxcousin && isCousin(numbers[i])) {

                maxcousin=numbers[i];
                positionmaxcousin=i;
            }
        }

        System.out.println("El mayor numero ingresado es "+max+" y se encuentra en la posicion "+(positionmax+1));
        if (maxcousin>0) {
            System.out.println("El mayor numero ingresado que sea primo es " + maxcousin + " y se encuentra en la posicion " + (positionmaxcousin + 1));
        }else{
            System.out.println("No se encontro un numero primo");
        }



        int [] numbers2=new int[10];
        int aux=0;

        for (int i = 100; i <= 300; i++) {
            if (isCousin(i)) {
                numbers2[aux] = i;
                aux++;
                if (aux == 10)
                    break;
            }
        }

        System.out.print("los primeros 10 numeros primos son entre 100 y 300 son: |");

        for (int i=0;i<10;i++){
            System.out.print(numbers2[i]);
            System.out.print("|");
        }
        System.out.println("");

        System.out.println("Posiciones de los números terminados en 4 de la primera lista de numeros");
        aux=0;

        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 10 == 4) {
                System.out.println("El número " +numbers[i] + " está en la posición " + (i + 1));
                aux+=1;
            }
        }
        if (aux==0){
            System.out.println("No se encontro numero terminado en 4");
        }

        System.out.println("cantidad de veces que se repite el numero maximo de la primera lista de numeros");
        aux=0;
        for (int i=0;i<10;i++){
            if (numbers[i]==max){
                aux+=1;
            }
        }
        System.out.println("El numero maximo "+max+" se repitio un total de "+aux+" veces.");

    }
    public static boolean isCousin(int n){
        if(n<=1 ){
            return false;
        }
        for (int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}