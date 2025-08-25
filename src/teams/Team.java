package teams;

import players.Player;
import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;
    private Coach coach;

    public Team(String name, Coach coach) {
        this.name = name;
        this.coach = coach;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public String getName() { return name; }
    public List<Player> getPlayers() { return players; }
    public Coach getCoach() { return coach; }


    public void displayTeamInfo() {
        System.out.println("Team: " + name);
        System.out.println("Coach: " + coach.getName());
        System.out.println("Players:");
        for (Player p : players) {
            System.out.println("- " + p.getName() + " (" + p.getPosition() + ")");
        }
    }
}
