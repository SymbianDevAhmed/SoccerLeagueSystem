package soccerleaguesystem;

import java.util.ArrayList;

public class Team {

    private int teamId;
    private String teamName;
    private int totalGoals;
    private int points;
    private ArrayList<Player> players;

    public Team(int teamId, String teamName) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.totalGoals = 0;
        this.points = 0;
        this.players = new ArrayList<>();
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTotalGoals() {
        return totalGoals;
    }

    public void setTotalGoals(int totalGoals) {
        this.totalGoals = totalGoals;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}