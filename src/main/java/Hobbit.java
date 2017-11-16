class Hobbit extends Character
{

    Hobbit()
    {
        super(0, 3, "Hobbit");
    }

    String kick(Character c)
    {
        toCry();
        return "hobbit.Kick() has been called";
    }

    String toCry() {
        System.out.println("Hobbit's crying");
        return "Hobbit's crying";
    }

}
