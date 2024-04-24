import clases.Equipment;
import clases.Player;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player player1= new Player("Mati", "delantero", 10);
        Player player2= new Player("Manu", "delantero", 6);
        Player player3= new Player("Nacho", "defensa", 4);
        Player player4= new Player("Julian", "arquero", 1);

        Equipment equipment=new Equipment();
        equipment.addPlayer(player1);
        equipment.addPlayer(player2);
        equipment.addPlayer(player3);
        equipment.addPlayer(player4);

        System.out.println("*--* Jugadores *--*");
         for (Player player:equipment){
             System.out.println("Nombre: "+player.getName());
             System.out.println("Posicion: "+player.getPosition());
             System.out.println("Numero de camiseta: "+player.getNumbertshirt());
         }
    }
}