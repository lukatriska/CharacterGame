import org.junit.Before;
import org.junit.Test;

import static java.lang.Math.abs;
import static org.junit.Assert.*;

public class KingTest extends CharacterFactory
{

    private King king;
    private Character c;


    @Before
    public void initialisation()
    {
        king = new King();
        c = createCharacter();
    }


    @Test
    public void testKick() throws Exception
    {

        int hpBeforeKick = c.hp;
        king.kick(c);
        int absoluteHpValue = abs(abs(c.hp) - hpBeforeKick);
        assertTrue(absoluteHpValue >= 0 && absoluteHpValue <= 15 && absoluteHpValue < hpBeforeKick);

    }

}