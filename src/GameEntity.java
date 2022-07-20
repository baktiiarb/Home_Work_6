public class GameEntity {
    private int damage;
    private int health;
    public GameEntity(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }



    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHeals() {
        return health;
    }

    public void setHeals(int heals) {
        this.health = heals;
    }


}


