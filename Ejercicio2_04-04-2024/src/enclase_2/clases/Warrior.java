package enclase_2.clases;

public class Warrior extends BaseCharacter {
    int energy;

    public Warrior(String name) {
        super(name);
        this.energy = 100;
        setLife(700);
        setDamege(80);
        setDefending(110);
    }

    public Warrior(String name, int damege, int defending, int life, int energy) {
        super(name, damege, defending, life);
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public int toDamage() {
        if(energy>=10){
            energy-=10;
            return super.toDamage();
        }else {
            return 0;
        }

    }

    @Override
    public int toDefending(int damegeEnemi) {
        return super.toDefending(damegeEnemi);
    }
}
