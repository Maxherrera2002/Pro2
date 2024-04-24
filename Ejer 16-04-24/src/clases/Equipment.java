package clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Equipment implements Iterable<Player>{
    private List<Player> players;

    public Equipment() {
        players=new ArrayList<>();
    }

    public Equipment(List<Player> players) {
        this.players = players;
    }
    public void addPlayer(Player player){
        players.add(player);
    }

    @Override
    public Iterator<Player> iterator() {
        return new EquipmentIterator();
    }
    public class EquipmentIterator implements Iterator<Player> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index< players.size();
        }

        @Override
        public Player next() {
            return players.get(index++);
        }
    }

}
