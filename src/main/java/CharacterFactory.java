import java.util.Random;

class CharacterFactory {

    static Character createCharacter() {

        Character[] chars = new Character[]{new Knight(), new Hobbit(), new King(), new Elf()};
        Random rand = new Random();
        return chars[rand.nextInt(chars.length)];

    }

}
