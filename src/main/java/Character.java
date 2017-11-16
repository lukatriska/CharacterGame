public class Character {

    int power, hp = 0;
    private String name;


    boolean isAlive() {
        if (this.hp < 0) {
            return false;
        } else {
            return true;
        }
    }

    Character(int power, int hp, String name) {
        this.power = power;
        this.hp = hp;
        this.name = name;
    }



    String kick(Character c) {
        return null;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
