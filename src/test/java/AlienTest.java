import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlienTest {

    private Alien alien;

    @BeforeEach
    public void setUp() {
        alien = new Alien("Xorx", 150, "Telepathy");
    }

    @Test
    public void testUseAbility() {
        alien.useAbility();
        assertEquals(90, alien.getMana());
    }

    @Test
    public void testEatFood() {
        alien.eatFood();
        assertEquals(110, alien.getMana());
    }

    @Test
    public void testTakeDamage() {
        alien.takeDamage(20);
        assertEquals(130, alien.getHealth());
    }

    @Test
    public void testRegenerateHealth() {
        alien.regenerateHealth();
        assertEquals(160, alien.getHealth());
        assertEquals(90, alien.getMana());
    }

    @Test
    public void testMutate() {
        alien.mutate();
        assertEquals(145, alien.getHealth());
        assertEquals(115, alien.getMana());
    }
}
