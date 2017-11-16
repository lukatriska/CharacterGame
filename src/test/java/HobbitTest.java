import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HobbitTest extends CharacterFactory
{

    private Hobbit hobbit;
    private Character c;
    private String expectedFromKick;
    private String expectedFromToCry;

    @Before
    public void initialisation()
    {
        hobbit = new Hobbit();
        c = createCharacter();
        expectedFromKick = "hobbit.Kick() has been called";
        expectedFromToCry = "Hobbit's crying";
    }

    @Test
    public void testKick() throws Exception
    {
        assertEquals(expectedFromKick, hobbit.kick(c));
    }

    @Test
    public void testToCry() throws Exception
    {
        assertEquals(expectedFromToCry, hobbit.toCry());
    }

}