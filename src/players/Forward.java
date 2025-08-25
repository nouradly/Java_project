package players;

public class Forward extends Player {
    public Forward(String name) {
        super(name, "Forward");
    }

    @Override
    public void play() {
        System.out.println(getName() + " (FW) is attacking and scoring!");
    }
}
