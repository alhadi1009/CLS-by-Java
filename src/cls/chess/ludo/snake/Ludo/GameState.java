package cls.chess.ludo.snake.Ludo;

public class GameState {

    private int[] players;   // Active players (use PlayerColor constants)
    private int currentPlayerIndex;  // কার beurt
    private int[][] pawnPositions;   // 4 pawns per player

    public GameState(int numberOfPlayers) {
        // Supported: 2, 3, 4
        players = new int[numberOfPlayers];
        switch(numberOfPlayers) {
            case 2:
                players[0] = PlayerColor.GREEN;
                players[1] = PlayerColor.YELLOW;
                break;
            case 3:
                players[0] = PlayerColor.GREEN;
                players[1] = PlayerColor.RED;
                players[2] = PlayerColor.YELLOW;
                break;
            case 4:
                players[0] = PlayerColor.GREEN;
                players[1] = PlayerColor.RED;
                players[2] = PlayerColor.YELLOW;
                players[3] = PlayerColor.BLUE;
                break;
            default:
                throw new IllegalArgumentException("Only 2, 3, or 4 players allowed");
        }

        currentPlayerIndex = 0;

        // initialize pawn positions (-1 = home)
        pawnPositions = new int[numberOfPlayers][4];
        for(int i = 0; i < numberOfPlayers; i++)
            for(int j = 0; j < 4; j++)
                pawnPositions[i][j] = -1;
    }

    public int getCurrentPlayer() {
        return players[currentPlayerIndex]; // returns int (PlayerColor constant)
    }

    public void nextTurn() {
        currentPlayerIndex = (currentPlayerIndex + 1) % players.length;
    }

    public int[] getPawnPositions(int player) {
        for(int i = 0; i < players.length; i++) {
            if(players[i] == player)
                return pawnPositions[i];
        }
        return null;
    }

    public void setPawnPosition(int player, int pawnIndex, int position) {
        for(int i = 0; i < players.length; i++) {
            if(players[i] == player) {
                pawnPositions[i][pawnIndex] = position;
                return;
            }
        }
    }
}