package soccerleaguesystem;

public class Goal {

    private int matchId;
    private Player scorer;
    private int minute;

    public Goal(int matchId, Player scorer, int minute) {
        this.matchId = matchId;
        this.scorer = scorer;
        this.minute = minute;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public Player getScorer() {
        return scorer;
    }

    public void setScorer(Player scorer) {
        this.scorer = scorer;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}