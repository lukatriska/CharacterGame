class Elf extends Character
{

    Elf() {
        super(10, 10, "Elf");
    }


    String kick(Character c)
    {

        if (c.power < this.power) {
            c.hp = 0;
        }
        else {
            c.power--;
        }

        return null;
    }

}
