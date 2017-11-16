import org.junit.Before;
import org.junit.Test;

import static java.lang.Math.abs;
import static org.junit.Assert.*;

public class KnightTest extends CharacterFactory
{
    private Knight knight;
    private Character c;


    @Before
    public void initialisation()
    {
        knight = new Knight();
        c = createCharacter();
    }


    @Test
    public void testKick() throws Exception
    {

        int hpBeforeKick = c.hp;
        knight.kick(c);
        int absoluteHpValue = abs(abs(c.hp) - hpBeforeKick);
        assertTrue(absoluteHpValue >= 0 && absoluteHpValue <= 12 && absoluteHpValue < hpBeforeKick);

    }

}