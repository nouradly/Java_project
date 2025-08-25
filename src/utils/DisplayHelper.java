package utils;

import teams.Team;
import players.Player;

public class DisplayHelper {
    public static void showTeamDetails(Team team) {
        System.out.println("Team: " + team.getName());
        if (team.getCoach() != null) {
            System.out.println("Coach: " + team.getCoach().getName());
        }
        System.out.println("Players:");
        for (Player p : team.getPlayers()) {
            System.out.println("- " + p.getName() + " (" + p.getPosition() + ")");
        }
    }
}
