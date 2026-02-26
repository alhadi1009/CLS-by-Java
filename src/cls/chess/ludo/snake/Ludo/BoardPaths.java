package cls.chess.ludo.snake.Ludo;

import java.awt.Point;

public class BoardPaths {
    public static final int TOTAL_STEPS = 56;

    public static Point[] greenPath = new Point[TOTAL_STEPS];
    public static Point[] redPath = new Point[TOTAL_STEPS];
    public static Point[] yellowPath = new Point[TOTAL_STEPS];
    public static Point[] bluePath = new Point[TOTAL_STEPS];

    static {
        setupGreenPath();
        setupRedPath();
        setupYellowPath();
        setupBluePath();
    }

    private static void setupGreenPath() {
        // Fill greenPath[0..55] with coordinates
        greenPath[0] = new Point(45, 35);    // home 1
greenPath[1] = new Point(45, 35);   // home 2
greenPath[2] = new Point(105 + 30, 35); // 1st board cell (135,35)
greenPath[3] = new Point(165, 35);
greenPath[4] = new Point(195, 35);
greenPath[5] = new Point(225, 35);
greenPath[6] = new Point(255, 35);
greenPath[7] = new Point(285, 35);
greenPath[8] = new Point(315, 35);
greenPath[9] = new Point(345, 35);
greenPath[10] = new Point(375, 35);
greenPath[11] = new Point(405, 35);
greenPath[12] = new Point(420, 60); // turn down
greenPath[13] = new Point(420, 90);
greenPath[14] = new Point(420, 120);
greenPath[15] = new Point(420, 150);
greenPath[16] = new Point(420, 180);
greenPath[17] = new Point(420, 210);
greenPath[18] = new Point(420, 240);
greenPath[19] = new Point(420, 270);
greenPath[20] = new Point(420, 300);
greenPath[21] = new Point(420, 330);
greenPath[22] = new Point(420, 360);
greenPath[23] = new Point(420, 390);
greenPath[24] = new Point(420, 420);
greenPath[25] = new Point(375, 420); // turn left
greenPath[26] = new Point(345, 420);
greenPath[27] = new Point(315, 420);
greenPath[28] = new Point(285, 420);
greenPath[29] = new Point(255, 420);
greenPath[30] = new Point(225, 420);
greenPath[31] = new Point(195, 420);
greenPath[32] = new Point(165, 420);
greenPath[33] = new Point(135, 420);
greenPath[34] = new Point(105, 420);
greenPath[35] = new Point(75, 420);
greenPath[36] = new Point(45, 420);
greenPath[37] = new Point(30, 390); // turn up
greenPath[38] = new Point(30, 360);
greenPath[39] = new Point(30, 330);
greenPath[40] = new Point(30, 300);
greenPath[41] = new Point(30, 270);
greenPath[42] = new Point(30, 240);
greenPath[43] = new Point(30, 210);
greenPath[44] = new Point(30, 180);
greenPath[45] = new Point(30, 150);
greenPath[46] = new Point(30, 120);
greenPath[47] = new Point(30, 90);
greenPath[48] = new Point(30, 60);
greenPath[49] = new Point(45, 45);  // green home entry start
greenPath[50] = new Point(75, 45);
greenPath[51] = new Point(105, 45);
greenPath[52] = new Point(105, 65);
greenPath[53] = new Point(105, 75);
greenPath[54] = new Point(105, 85);
greenPath[55] = new Point(105, 95);
    }

    private static void setupRedPath() {
        // Fill redPath[0..55] with coordinates
        redPath[1] = new Point(105, 35);   // home 2
redPath[2] = new Point(105 + 30, 35); // 1st board cell (135,35)
redPath[3] = new Point(165, 35);
redPath[4] = new Point(195, 35);
redPath[5] = new Point(225, 35);
redPath[6] = new Point(255, 35);
redPath[7] = new Point(285, 35);
redPath[8] = new Point(315, 35);
redPath[9] = new Point(345, 35);
redPath[10] = new Point(375, 35);
redPath[11] = new Point(405, 35);
redPath[12] = new Point(420, 60); // turn down
redPath[13] = new Point(420, 90);
redPath[14] = new Point(420, 120);
redPath[15] = new Point(420, 150);
redPath[16] = new Point(420, 180);
redPath[17] = new Point(420, 210);
redPath[18] = new Point(420, 240);
redPath[19] = new Point(420, 270);
redPath[20] = new Point(420, 300);
redPath[21] = new Point(420, 330);
redPath[22] = new Point(420, 360);
redPath[23] = new Point(420, 390);
redPath[24] = new Point(420, 420);
redPath[25] = new Point(375, 420); // turn left
redPath[26] = new Point(345, 420);
redPath[27] = new Point(315, 420);
redPath[28] = new Point(285, 420);
redPath[29] = new Point(255, 420);
redPath[30] = new Point(225, 420);
redPath[31] = new Point(195, 420);
redPath[32] = new Point(165, 420);
redPath[33] = new Point(135, 420);
redPath[34] = new Point(105, 420);
redPath[35] = new Point(75, 420);
redPath[36] = new Point(45, 420);
redPath[37] = new Point(30, 390); // turn up
redPath[38] = new Point(30, 360);
redPath[39] = new Point(30, 330);
redPath[40] = new Point(30, 300);
redPath[41] = new Point(30, 270);
redPath[42] = new Point(30, 240);
redPath[43] = new Point(30, 210);
redPath[44] = new Point(30, 180);
redPath[45] = new Point(30, 150);
redPath[46] = new Point(30, 120);
redPath[47] = new Point(30, 90);
redPath[48] = new Point(30, 60);
redPath[49] = new Point(45, 45);  // green home entry start
redPath[50] = new Point(75, 45);
redPath[51] = new Point(105, 45);
redPath[52] = new Point(105, 65);
redPath[53] = new Point(105, 75);
redPath[54] = new Point(105, 85);
redPath[55] = new Point(105, 95);
   
    }

    private static void setupYellowPath() {
        // Fill yellowPath[0..55] with coordinates
    }

    private static void setupBluePath() {
        // Fill bluePath[0..55] with coordinates
    }
}