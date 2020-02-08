package stensaxpåse;

public class spelare {

	
	int score;
    int wins;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins += wins;
    }

    public void resetScore() {
        this.score = 0;
    }

}

