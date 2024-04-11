package enclase_2.clases;

public class Rogue extends BaseCharacter{
    private boolean hidden;

    public Rogue(String name) {
        super(name);
        this.hidden = false;
        setLife(400);
        setDamege(140);
        setDefending(65);
    }

    public Rogue(String name, int damege, int defending, int life) {
        super(name, damege, defending, life);
        this.hidden = false;
    }

    @Override
    public int toDamage() {
        return super.toDamage();
    }

    @Override
    public int toDefending(int damegeEnemi) {
        if (hidden){
            return 0;
        }else {
            return super.toDefending(damegeEnemi);
        }
    }
}
