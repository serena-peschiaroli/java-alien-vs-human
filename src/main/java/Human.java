public class Human extends Entity implements Food, TakeDamage {

    private boolean isWearingArmor;
    private int stamina;

    public Human(String name, int health, String abilities) {
        super(name, health, abilities);
        this.isWearingArmor = false;
        this.stamina = 100;
    }

    public boolean isWearingArmor() {
        return isWearingArmor;
    }

    public void setWearingArmor(boolean wearingArmor) {
        isWearingArmor = wearingArmor;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public void useAbility() {
        if (stamina >= 10) {
            System.out.println(getName() + " uses a human-specific ability: " + getAbilities());
            setStamina(getStamina() - 10);
            System.out.println("New stamina: " + getStamina());
        } else {
            System.out.println(getName() + " does not have enough stamina to use the ability.");
        }
    }

    @Override
    public void eatFood() {
        System.out.println(getName() + " eats food to gain special effects.");
        setHealth(getHealth() + 10);
        System.out.println("Health regained: " + getHealth());
        setStamina(getStamina() + 5);
        System.out.println("Stamina: " + getStamina());
    }

    @Override
    public void takeDamage(int damage) {
        if (isWearingArmor) {
            damage *= 0.9;
        }
        setHealth(getHealth() - damage);
        setStamina(getStamina() + 5);
        System.out.println(getName() + " takes " + damage + " damage, health is now " + getHealth());
    }

    public void wearArmor() {
        if (stamina >= 10) {
            this.isWearingArmor = true;
            setStamina(getStamina() - 10);
            System.out.println(getName() + " is now wearing armor. Armor consumes stamina.");
        } else {
            System.out.println(getName() + " does not have enough stamina to wear armor.");
        }
    }

    public void removeArmor() {
        this.isWearingArmor = false;
        setStamina(getStamina() + 10);
        System.out.println(getName() + " has removed the armor.");
    }
}
