public abstract class Entity {

    private String name;
    private int health;
    private String abilities;

    //constructor
    public Entity(String name, int health, String abilities) {
        this.name = name;
        this.health = health;
        this.abilities = abilities;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    //methods

    public abstract void useAbility();

}
