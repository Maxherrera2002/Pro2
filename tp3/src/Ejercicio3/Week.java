package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Week {
    public Week() {
        List<String> week = new ArrayList<>();
        //dias de la semana:
        week.add("Lunes");
        week.add("Martes");
        week.add("Miercoles");
        week.add("Jueves");
        week.add("Viernes");
        week.add("Sabado");
        week.add("Domingo");
        //Inserto "Juernes"
        week.add(3, "Juernes");
        System.out.println("\nLista de week, para comprobar si fue agregado juernes");
        for (String we : week){
            System.out.println(we);
        }
        //Mostrar 3 y 4 posicion
        System.out.println("\nEn la posicion 3: "+week.get(2) +
                " / En la posicion 4: "+week.get(3)+"\n");
        //Mostrar primero y ultimo
        System.out.println("\nPrimera posicion: "+week.get(week.size() - 1) +
                " / Ultima posicion: "+week.get(1)+"\n");
        //eliminar "juernes"
        week.remove("Juernes");
        System.out.println("\nLista de week, para comprobar si fue eliminado juernes");
        for (String we : week){
            System.out.println(we);
        }
        //Iterador crear
        Iterator<String> iterador = week.iterator();
        System.out.println("\nUsando la clase Iterator");
        while (iterador.hasNext()) {
            String we = iterador.next();
            System.out.println(we);
        }
        //Existe lunes
        if (week.contains("Lunes")){
            System.out.println("\nLa semana si tiene Lunes");
        }
        //Existe lunes o Lunes?
        String aux = "Lunes";//Aunque usando scanner podria ser cualquier palabra
        for (String we : week){
            if (we.equalsIgnoreCase(aux)){
                System.out.println("\nLa semana si tienes lunes");
                break;
            }
        }
        //Borrar todos los elementos
        week.clear();
        System.out.println("\nTamaño de Lista week: "+week.size());

    }
}
