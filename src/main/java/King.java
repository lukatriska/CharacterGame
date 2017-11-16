import java.util.concurrent.ThreadLocalRandom;

class King extends Character
{

    private static int power = ThreadLocalRandom.current().nextInt(5, 15);
    private static int hp = ThreadLocalRandom.current().nextInt(5, 15);


    King()
    {
        super(power, hp, "King");
    }

    @Override
    String kick(Character c)
    {

        int randomNum = ThreadLocalRandom.current().nextInt(1, 15);
        c.hp -= randomNum;

        return null;
    }
}
