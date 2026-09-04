package soccerleaguesystem;

import java.util.ArrayList;

public class Schedule {

    private ArrayList<Team> teams;
    private ArrayList<Match> matches;

    public Schedule() {
        this.teams = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void addMatch(Match match) {
        matches.add(match);
    }

    public void updateTeamStatistics() {

        for (Match match : matches) {

            int homeGoals = 0;
            int awayGoals = 0;

            for (Goal goal : match.getGoals()) {

                Player scorer = goal.getScorer();

                if (match.getHomeTeam().getPlayers().contains(scorer)) {
                    homeGoals++;
                } else if (match.getAwayTeam().getPlayers().contains(scorer)) {
                    awayGoals++;
                }
            }

            match.getHomeTeam().setTotalGoals(
                    match.getHomeTeam().getTotalGoals() + homeGoals
            );

            match.getAwayTeam().setTotalGoals(
                    match.getAwayTeam().getTotalGoals() + awayGoals
            );

            if (homeGoals > awayGoals) {

                match.getHomeTeam().setPoints(
                        match.getHomeTeam().getPoints() + 3
                );

            } else if (homeGoals < awayGoals) {

                match.getAwayTeam().setPoints(
                        match.getAwayTeam().getPoints() + 3
                );

            } else {

                match.getHomeTeam().setPoints(
                        match.getHomeTeam().getPoints() + 1
                );

                match.getAwayTeam().setPoints(
                        match.getAwayTeam().getPoints() + 1
                );
            }
        }
    }

    public ArrayList<Team> rankTeams() {

        ArrayList<Team> rankedTeams = new ArrayList<>(teams);

        rankedTeams.sort((team1, team2) ->
                Integer.compare(team2.getPoints(), team1.getPoints())
        );

        return rankedTeams;
    }

    public void displayResultsTable() {

        System.out.println("===== Soccer League Results =====");

        ArrayList<Team> rankedTeams = rankTeams();

        for (Team team : rankedTeams) {

            System.out.println(
                    team.getTeamName() + " - Goals: " +
                            team.getTotalGoals() + " - Points: " +
                            team.getPoints()
            );
        }
    }

    public void displayMatchDetails(int matchId) {

        for (Match match : matches) {

            if (match.getMatchId() == matchId) {

                System.out.println(
                        match.getHomeTeam().getTeamName()
                                + " vs "
                                + match.getAwayTeam().getTeamName()
                );

                for (Goal goal : match.getGoals()) {

                    System.out.println(
                            goal.getScorer().getName()
                                    + " - Minute: "
                                    + goal.getMinute()
                    );
                }
            }
        }
    }

    public static void main(String[] args) {

        Schedule schedule = new Schedule();

        Team team1 = new Team(1, "Team 1");
        Team team2 = new Team(2, "Team 2");
        Team team3 = new Team(3, "Team 3");
        Team team4 = new Team(4, "Team 4");
        Team team5 = new Team(5, "Team 5");
        Team team6 = new Team(6, "Team 6");

        schedule.addTeam(team1);
        schedule.addTeam(team2);
        schedule.addTeam(team3);
        schedule.addTeam(team4);
        schedule.addTeam(team5);
        schedule.addTeam(team6);

        Player player1 = new Player(1, "Player 1", "Forward");
        Player player2 = new Player(2, "Player 2", "Midfielder");

        Player player3 = new Player(3, "Player 3", "Forward");
        Player player4 = new Player(4, "Player 4", "Defender");

        Player player5 = new Player(5, "Player 5", "Forward");
        Player player6 = new Player(6, "Player 6", "Midfielder");

        Player player7 = new Player(7, "Player 7", "Forward");
        Player player8 = new Player(8, "Player 8", "Midfielder");

        Player player9 = new Player(9, "Player 9", "Forward");
        Player player10 = new Player(10, "Player 10", "Midfielder");

        team1.addPlayer(player1);
        team1.addPlayer(player2);

        team2.addPlayer(player3);
        team2.addPlayer(player4);

        team3.addPlayer(player5);
        team3.addPlayer(player6);

        team4.addPlayer(player7);
        team4.addPlayer(player8);

        team5.addPlayer(player9);

        team6.addPlayer(player10);

        // Match 1: Team 1 vs Team 2 → 2 - 1
        Match match1 = new Match(1, team1, team2);
        schedule.addMatch(match1);

        Goal goal1 = new Goal(1, player1, 20);
        Goal goal2 = new Goal(1, player1, 45);
        Goal goal3 = new Goal(1, player3, 70);

        match1.addGoal(goal1);
        match1.addGoal(goal2);
        match1.addGoal(goal3);

        // Match 2: Team 3 vs Team 4 → 0 - 2
        Match match2 = new Match(2, team3, team4);
        schedule.addMatch(match2);

        Goal goal4 = new Goal(2, player7, 30);
        Goal goal5 = new Goal(2, player8, 65);

        match2.addGoal(goal4);
        match2.addGoal(goal5);

        // Match 3: Team 5 vs Team 6 → 1 - 1
        Match match3 = new Match(3, team5, team6);
        schedule.addMatch(match3);

        Goal goal6 = new Goal(3, player9, 25);
        Goal goal7 = new Goal(3, player10, 80);

        match3.addGoal(goal6);
        match3.addGoal(goal7);

        // Update statistics
        schedule.updateTeamStatistics();

        // Display results
        schedule.displayResultsTable();

        // Display match details
        schedule.displayMatchDetails(1);
        schedule.displayMatchDetails(2);
        schedule.displayMatchDetails(3);
    }
}