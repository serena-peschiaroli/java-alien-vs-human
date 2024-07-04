public class Alien extends Entity implements Food, TakeDamage {
    private int mana;

    public Alien(String name, int health, String abilities) {
        super(name, health, abilities);
        this.mana = 100; // Initial mana for the Alien
    }

    // Getter for mana
    public int getMana() {
        return mana;
    }

    // Setter for mana
    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public void useAbility() {
        if (mana >= 10) {
            System.out.println(getName() + " uses an alien-specific ability: " + getAbilities());
            setMana(getMana() - 10);
            System.out.println("Mana remaining: " + getMana());
        } else {
            System.out.println(getName() + " does not have enough mana to use the ability.");
        }
    }

    @Override
    public void eatFood() {
        System.out.println(getName() + " eats alien food to gain special effects.");
        setMana(getMana() + 10);
        System.out.println("Mana increased: " + getMana());
    }

    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
        System.out.println(getName() + " takes " + damage + " damage, health is now " + getHealth());
    }

    public void regenerateHealth() {
        if (mana >= 10) {
            System.out.println(getName() + " regenerates health.");
            setHealth(getHealth() + 10);
            setMana(getMana() - 10);
            System.out.println("Health regenerated to: " + getHealth());
            System.out.println("Mana remaining: " + getMana());
        } else {
            System.out.println(getName() + " does not have enough mana to regenerate health.");
        }
    }

    public void mutate() {
        System.out.println(getName() + " mutates into a different form.");
        setHealth(getHealth() - 5);
        setMana(getMana() + 15);
        System.out.println("Health after mutation: " + getHealth());
        System.out.println("Mana after mutation: " + getMana());
    }
}
