import java.util.Objects;

public class GameManager extends CharacterFactory
{

    private static int counter = 0;
    private static boolean aliveness;

    private static void fight(Character c1, Character c2)
    {

        System.out.println("Fighting " + c1.getName() + " vs " + c2.getName());
        System.out.println("HP of " + c1.getName() + " = " + c1.hp);
        System.out.println("HP of " + c2.getName() + " = " + c2.hp);
        System.out.println("--- --- --- --- --- ---");
        System.out.println("--- --- --- --- --- ---");
        System.out.println("--- --- --- --- --- ---");

        while (c1.isAlive() && c2.isAlive())
        {
            counter++;
            if (!Objects.equals(c1.getName(), "Hobbit")) {
                c1.kick(c2);
            } else {
                System.out.println("Hobbit's crying");
            }
            System.out.println(c2.getName() + " 2 got kicked");
            if (c2.hp > 0) {
                System.out.println("HP of " + c2.getName() + " = " + c2.hp);
            } else {
                System.out.println("He Dead");
                aliveness = false;

            }
            System.out.println("Power of " + c2.getName() + " = " + c2.power);
            System.out.println("--- --- --- --- --- ---");

            if (c2.isAlive() && aliveness) {
                if (!Objects.equals(c1.getName(), "Hobbit")) {
                    c1.kick(c2);
                } else {
                    System.out.println("Hobbit's crying");
                }
                System.out.println(c1.getName() + " 1 got kicked");
                if (c1.hp > 0) {
                    System.out.println("HP of " + c1.getName() + " = " + c1.hp);
                } else {
                    System.out.println("He Dead");
                }
                System.out.println("Power of " + c1.getName() + " = " + c1.power);
                System.out.println("--- --- --- --- --- ---");
                if (!c1.isAlive()) {
                    System.out.println("Player " + c2.getName() + " won!");
                }

            } else {
                System.out.println("Player " + c1.getName() + " won!");
                break;
            }

            if (counter > 20) {
                System.out.println("It's a tie!");
                break;
            }
//
        }

    }

    public static void main(String[] args)
    {
        fight(createCharacter(), createCharacter());
    }

}
