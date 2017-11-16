import java.util.concurrent.ThreadLocalRandom;

class Knight extends Character{

    private static int power = ThreadLocalRandom.current().nextInt(2, 12);
    private static int hp = ThreadLocalRandom.current().nextInt(2, 21);


    Knight() {
        super(power, hp, "Knight");
    }

    @Override
    String kick(Character c) {

        int randomNum = ThreadLocalRandom.current().nextInt(0, 12);
        c.hp -= randomNum;

        return null;
    }
}
