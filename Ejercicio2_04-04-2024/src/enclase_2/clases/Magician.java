package enclase_2.clases;

public class Magician extends BaseCharacter{
    int mana;


    public Magician(String name) {
        super(name);
        mana=100;
        setLife(300);
        setDamege(150);
        setDefending(50);
    }

    public Magician(String name, int damege, int defending, int life, int mana) {
        super(name, damege, defending, life);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public int toDamage() {
        if (mana>=20){
            mana-=20;
            return super.toDamage();
        }else{
            return 0;
        }

    }

    @Override
    public int toDefending(int damegeEnemi) {
        return super.toDefending(damegeEnemi);
    }

}
