package enclase_2.clases;

public abstract class BaseCharacter implements Character {
    int damege;
    int defending;

    public BaseCharacter() {
    }

    public BaseCharacter(int damege, int defending) {
        this.damege = damege;
        this.defending = defending;
    }

    public int getDamege() {
        return damege;
    }

    public void setDamege(int damege) {
        this.damege = damege;
    }

    public int getDefending() {
        return defending;
    }

    public void setDefending(int defending) {
        this.defending = defending;
    }


    public int toDamage() {
        return 0;
    }


    public int toDefending() {
        return 0;
    }
}
