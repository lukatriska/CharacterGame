import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CharacterTest extends CharacterFactory
{

    private Character c1;
    private Character c2;
    private String[] names;

    @Before
    public void initialisation()
    {
        c1 = createCharacter();
        c2 = createCharacter();
        names = new String[]{"Elf", "Hobbit", "King", "Knight"};
    }

    @Test
    public void testIsAlive() throws Exception
    {
        if (c1.isAlive()) {
            assertTrue(c1.hp >= 0);
        } else {
            assertTrue(c1.hp < 0);
        }
    }

    @Test
    public void testKick() throws Exception
    {
        assertEquals(null, c1.kick(c2));
    }

    @Test
    public void testGetName() throws Exception
    {
        Arrays.asList(names).contains(c1.getName());
    }

    @Test
    public void testSetName() throws Exception
    {
        String newName = "some other name";
        c1.setName(newName);
        assertEquals(c1.getName(), newName);
    }

}