package players;

public class Defender extends Player {
    public Defender(String name) {
        super(name, "Defender");
    }

    @Override
    public void play() {
        System.out.println(getName() + " (DF) is defending strongly!");
    }
}
