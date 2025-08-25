package players;

public class Midfielder extends Player {
    public Midfielder(String name) {
        super(name, "Midfielder");
    }

    @Override
    public void play() {
        System.out.println(getName() + " (MF) is controlling the midfield!");
    }
}
