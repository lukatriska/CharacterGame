import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElfTest extends CharacterFactory
{
    private Elf elf;
    private Character c;
    private int powerBefore;

    @Before
    public void initialisation()
    {
        elf = new Elf();
        c = createCharacter();
        powerBefore = c.power;
    }


    @Test
    public void testKick() throws Exception
    {
        elf.kick(c);
        if (powerBefore < elf.power) {
            assertTrue(c.hp == 0);
        }
        else {
            assertTrue(powerBefore > c.power);
        }
    }

}