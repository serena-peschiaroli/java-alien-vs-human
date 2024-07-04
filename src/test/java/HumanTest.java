import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {

    private Human human;

    @BeforeEach
    public void setUp() {
        human = new Human("John", 100, "Special Attack");
    }

    @Test
    public void testUseAbility() {
        human.useAbility();
        assertEquals(90, human.getStamina());
    }

    @Test
    public void testEatFood() {
        human.eatFood();
        assertEquals(110, human.getHealth());
        assertEquals(105, human.getStamina());
    }

    @Test
    public void testTakeDamageWithoutArmor() {
        human.takeDamage(20);
        assertEquals(80, human.getHealth());
    }

    @Test
    public void testTakeDamageWithArmor() {
        human.wearArmor();
        human.takeDamage(20);
        assertEquals(82, human.getHealth()); // 20 damage reduced by 10% = 18 damage
    }

    @Test
    public void testWearArmor() {
        human.wearArmor();
        assertTrue(human.isWearingArmor());
        assertEquals(90, human.getStamina());
    }

    @Test
    public void testRemoveArmor() {
        human.wearArmor();
        human.removeArmor();
        assertFalse(human.isWearingArmor());
        assertEquals(100, human.getStamina());
    }
}
