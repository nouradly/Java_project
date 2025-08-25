import match.Match;
import match.Referee;
import players.*;
import teams.Coach;
import teams.Team;
import utils.InputHelper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Football Management System ===");

        // === First Team ===
        String team1Name = InputHelper.readString("Enter first team name: ");
        String coach1Name = InputHelper.readString("Enter coach name for " + team1Name + ": ");
        Coach coach1 = new Coach(coach1Name);

        Team team1 = new Team(team1Name, coach1);
        addPlayersToTeam(team1);

        // === Second Team ===
        String team2Name = InputHelper.readString("Enter second team name: ");
        String coach2Name = InputHelper.readString("Enter coach name for " + team2Name + ": ");
        Coach coach2 = new Coach(coach2Name);

        Team team2 = new Team(team2Name, coach2);
        addPlayersToTeam(team2);

        // === Referee ===
        String refereeName = InputHelper.readString("Enter referee name: ");
        Referee referee = new Referee(refereeName);

        // === Scores ===
        int score1 = InputHelper.readInt("Enter score for " + team1Name + ": ");
        int score2 = InputHelper.readInt("Enter score for " + team2Name + ": ");

        // === Match ===
        Match match = new Match(team1, team2, referee, score1, score2);

        // === Display Summary ===
        System.out.println("\n=== Match Summary ===");
        team1.displayTeamInfo();
        System.out.println();
        team2.displayTeamInfo();
        System.out.println();
        match.displayMatchInfo();
    }

    private static void addPlayersToTeam(Team team) {
        int numPlayers = InputHelper.readInt("How many players for " + team.getName() + "? ");
        List<Player> players = new ArrayList<>();

        for (int i = 0; i < numPlayers; i++) {
            String playerName = InputHelper.readString("Enter player name: ");
            int choice = InputHelper.readInt(
                    "Choose position (1-Forward, 2-Midfielder, 3-Defender, 4-Goalkeeper): "
            );

            Player player;
            switch (choice) {
                case 1 -> player = new Forward(playerName);
                case 2 -> player = new Midfielder(playerName);
                case 3 -> player = new Defender(playerName);
                case 4 -> player = new Goalkeeper(playerName);
                default -> {
                    System.out.println("Invalid choice, defaulting to Forward.");
                    player = new Forward(playerName);
                }
            }
            players.add(player);
        }

        for (Player p : players) {
            team.addPlayer(p);
        }
    }
}
