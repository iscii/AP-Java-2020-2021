// Implements the game of Craps logic

public class CrapsGame {
    private int point = 0;
    private boolean firstTurn = true;

    /**
     * Calculates the result of the next dice roll in the Craps game. The parameter
     * total is the sum of dots on two dice. point is set to the saved total, if the
     * game continues, or 0, if the game has ended. Returns 1 if player won, -1 if
     * player lost, 0 if player continues rolling.
     */
    public int processRoll(int total) {
        int result;

        if (firstTurn) {
            if (total == 7 || total == 11) {
                result = 1;
                point = 0;
            } else if (total == 2 || total == 3 || total == 12) {
                result = -1;
                point = 0;
            } else {
                result = 0;
                point += total;
                firstTurn = false;
            }
        } else {
            if (total == 7) {
                result = -1;
                point = 0;
                firstTurn = true;
            } else if (total == point) {
                result = 1;
                point = 0;
                firstTurn = true;
            } else {
                result = 0;
            }
        }

        return result;
    }

    /**
     * Returns the saved point
     */
    public int getPoint() {
        return point;
    }
}