package enclase_2.clases;

public abstract class BaseCharacter implements Character {
    private String name;
    private int damege;
    private int defending;
    private int life;
    public BaseCharacter(String name) {
        this.name=name;
        damege=10;
        defending=10;
        life=100;
    }

    public BaseCharacter(String name, int damege, int defending, int life) {
        this.name=name;
        this.damege = damege;//daño
        this.defending = defending;//defensa
        this.life = life;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int toDamage() {
        return damege;
    }


    public int toDefending(int damegeEnemi) {
        if (defending > damegeEnemi) {
            return 0;
        } else {
            int finalDamege = damegeEnemi - defending;
            if (life > finalDamege) {
                life -= finalDamege;
                return finalDamege;
            } else if (life<finalDamege) {
                life=0;
                return finalDamege;

            }else{
                return 0;
            }
        }

    }
}
