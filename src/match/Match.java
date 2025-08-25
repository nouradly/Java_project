package match;

import teams.Team;

public class Match {
    private Team team1;
    private Team team2;
    private Referee referee;
    private int score1;
    private int score2;

    public Match(Team team1, Team team2, Referee referee, int score1, int score2) {
        this.team1 = team1;
        this.team2 = team2;
        this.referee = referee;
        this.score1 = score1;
        this.score2 = score2;
    }

    public void displayMatchInfo() {
        System.out.println("Referee: " + referee.getName());
        System.out.println("Score: " + team1.getName() + " " + score1 + " - " + score2 + " " + team2.getName());

        if (score1 > score2) {
            System.out.println("Winner: " + team1.getName());
        } else if (score2 > score1) {
            System.out.println("Winner: " + team2.getName());
        } else {
            System.out.println("The match ended in a draw.");
        }
    }
}
