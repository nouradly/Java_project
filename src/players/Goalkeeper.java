package players;

public class Goalkeeper extends Player {
    public Goalkeeper(String name) {
        super(name, "Goalkeeper");
    }

    @Override
    public void play() {
        System.out.println(getName() + " (GK) is saving shots!");
    }
}
