package cls.chess.ludo.snake.Ludo;

public class PlayerColor {
    public static final int RED = 0;
    public static final int BLUE = 1;
    public static final int GREEN = 2;
    public static final int YELLOW = 3;

    // Optional: রঙের নাম বের করার জন্য helper method
    public static String getName(int color) {
        switch (color) {
            case RED: return "Red";
            case BLUE: return "Blue";
            case GREEN: return "Green";
            case YELLOW: return "Yellow";
            default: return "Unknown";
        }
    }
}