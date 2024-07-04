public class Human extends Entity implements Food, TakeDamage {

    private boolean isWearingArmor;
    public Human(String name, int health, String abilities) {

        super(name, health, abilities);
        this.isWearingArmor = false;
    }


    @Override
    public void useAbility() {
        System.out.println(getName() + " uses a human-specific ability: " + getAbilities());

    }

    @Override
    public void eatFood() {
        System.out.println(STR."\{getName()} eats food to gain special effects.");
        setHealth(getHealth() + 10);
        System.out.println("Health regained: " + getHealth());

    }

    @Override
    public void takeDamage(int damage) {
        if(isWearingArmor){
            damage *= 0.9;
        }
        setHealth(getHealth() - damage);
        System.out.println(getName() + " takes " + damage + " damage, health is now " + getHealth());


    }

    public void wearArmor() {
        this.isWearingArmor = true;
        System.out.println(getName() + " is now wearing armor.");
    }

    public void removeArmor() {
        this.isWearingArmor = false;
        System.out.println(getName() + " has removed the armor.");
    }
}
