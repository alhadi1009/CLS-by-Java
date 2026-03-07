package cls.chess.ludo.snake.Ludo;

import java.awt.Point;

public class BoardPaths {

    public static final int TOTAL_STEPS = 57;

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
        greenPath[0] = new Point(30, 170);   
        greenPath[1] = new Point(60,170);   
        greenPath[2] = new Point(90,170); 
        greenPath[3] = new Point(120, 170);
        greenPath[4] = new Point(150, 170);
        greenPath[5] = new Point(180, 140);
        greenPath[6] = new Point(180, 110);
        greenPath[7] = new Point(180, 80);
        greenPath[8] = new Point(180, 50);
        greenPath[9] = new Point(180, 20);
        greenPath[10] = new Point(180, -10);
        greenPath[11] = new Point(210, -10);
        greenPath[12] = new Point(240, -10); 
        greenPath[13] = new Point(240, 20);
        greenPath[14] = new Point(240, 50);
        greenPath[15] = new Point(240, 80);
        greenPath[16] = new Point(240, 110);
        greenPath[17] = new Point(240, 140);
        greenPath[18] = new Point(270,170);     
        greenPath[19] = new Point(300,170);
        greenPath[20] = new Point(330,170);
        greenPath[21] = new Point(360,170);
        greenPath[22] = new Point(390,170);
        greenPath[23] = new Point(420, 170); 
        greenPath[24] = new Point(420,200);
        greenPath[25] = new Point(420,230); 
        greenPath[26] = new Point(390,230);
        greenPath[27] = new Point(360,230);
        greenPath[28] = new Point(330,230);
        greenPath[29] = new Point(300,230);
        greenPath[30] = new Point(270,230);
        greenPath[31] = new Point(240,260);
        greenPath[32] = new Point(240,290);
        greenPath[33] = new Point(240,320);
        greenPath[34] = new Point(240,350);
        greenPath[35] = new Point(240,380);
        greenPath[36] = new Point(240,420);
        greenPath[37] = new Point(210, 420);
        greenPath[38] = new Point(180, 420);
        greenPath[39] = new Point(180,380);
        greenPath[40] = new Point(180,350);
        greenPath[41] = new Point(180,320);
        greenPath[42] = new Point(180,290);
        greenPath[43] = new Point(180,260);
        greenPath[44] = new Point(150,230);
        greenPath[45] = new Point(120,230);
        greenPath[46] = new Point(90,230);
        greenPath[47] = new Point(60,230);
        greenPath[48] = new Point(30,230);
        greenPath[49] = new Point(0,230);  
        greenPath[50] = new Point(0,200);
        greenPath[51] = new Point(30,200);
        greenPath[52] = new Point(60,200);
        greenPath[53] = new Point(90,200);
        greenPath[54] = new Point(120,200);
        greenPath[55] = new Point(150,200);// +1= HOme;
        greenPath[56] = new Point(210,200);
    }

    private static void setupRedPath() {
        // Fill redPath[0..55] with coordinates
        redPath[0] = new Point(240,20);  
        redPath[1] = new Point(240,50); 
        redPath[2] = new Point(240,80);
        redPath[3] = new Point(240,110);
        redPath[4] = new Point(240,140);
        redPath[5] = new Point(270,170);
        redPath[6] = new Point(300,170);
        redPath[7] = new Point(330,170);
        redPath[8] = new Point(360,170);
        redPath[9] = new Point(390,170);
        redPath[10] = new Point(420,170);
        redPath[11] = new Point(420, 200);
        redPath[12] = new Point(420, 230);
        redPath[13] = new Point(390,230);
        redPath[14] = new Point(360,230);
        redPath[15] = new Point(330,230);
        redPath[16] = new Point(300,230);
        redPath[17] = new Point(270,230);
        redPath[18] = new Point(240,260);
        redPath[19] = new Point(240,290);
        redPath[20] = new Point(240,320);
        redPath[21] = new Point(240,350);
        redPath[22] = new Point(240,380);
        redPath[23] = new Point(240, 420);
        redPath[24] = new Point(210, 420); 
        redPath[25] = new Point(180, 420);
        redPath[26] = new Point(180,380);
        redPath[27] = new Point(180,350);
        redPath[28] = new Point(180,320);
        redPath[29] = new Point(180,290);
        redPath[30] = new Point(180,260);
        redPath[31] = new Point(150,230);
        redPath[32] = new Point(120,230);
        redPath[33] = new Point(90,230);
        redPath[34] = new Point(60,230);
        redPath[35] = new Point(30,230);
        redPath[36] = new Point(0,230); //0k
        redPath[37] = new Point(0,200);
        redPath[38] = new Point(0,170);
        redPath[39] = new Point(30,170);
        redPath[40] = new Point(60,170);
        redPath[41] = new Point(90,170);
        redPath[42] = new Point(120,170);
        redPath[43] = new Point(150,170);
        redPath[44] = new Point(180,140);
        redPath[45] = new Point(180,110);
        redPath[46] = new Point(180,80);
        redPath[47] = new Point(180,50);
        redPath[48] = new Point(180,20);  
        redPath[49] = new Point(180,-10);
        redPath[50] = new Point(210,-10);
        redPath[51] = new Point(210,20);
        redPath[52] = new Point(210,50);
        redPath[53] = new Point(210,80);
        redPath[54] = new Point(210,110);
        redPath[55] = new Point(210,140); // +1 = home;
        redPath[56] = new Point(210,200);

    }

    private static void setupYellowPath() {
        // Fill yellowPath[0..55] with coordinates
       

yellowPath[0] = new Point(420,240);
yellowPath[1] = new Point(390,240);
yellowPath[2] = new Point(360,240);
yellowPath[3] = new Point(330,240);
yellowPath[4] = new Point(300,240);
yellowPath[5] = new Point(270,270);
yellowPath[6] = new Point(270,300);
yellowPath[7] = new Point(270,330);
yellowPath[8] = new Point(270,360);
yellowPath[9] = new Point(270,390);
yellowPath[10] = new Point(270,420);
yellowPath[11] = new Point(240,420);
yellowPath[12] = new Point(210,420);
yellowPath[13] = new Point(210,390);
yellowPath[14] = new Point(210,360);
yellowPath[15] = new Point(210,330);
yellowPath[16] = new Point(210,300);
yellowPath[17] = new Point(210,270);
yellowPath[18] = new Point(180,240);
yellowPath[19] = new Point(150,240);
yellowPath[20] = new Point(120,240);
yellowPath[21] = new Point(90,240);
yellowPath[22] = new Point(60,240);
yellowPath[23] = new Point(20,240);
yellowPath[24] = new Point(20,210);
yellowPath[25] = new Point(20,180);
yellowPath[26] = new Point(60,180);
yellowPath[27] = new Point(90,180);
yellowPath[28] = new Point(120,180);
yellowPath[29] = new Point(150,180);
yellowPath[30] = new Point(180,180);
yellowPath[31] = new Point(210,150);
yellowPath[32] = new Point(210,120);
yellowPath[33] = new Point(210,90);
yellowPath[34] = new Point(210,60);
yellowPath[35] = new Point(210,30);
yellowPath[36] = new Point(210,0);
yellowPath[37] = new Point(240,0);
yellowPath[38] = new Point(270,0);
yellowPath[39] = new Point(270,30);
yellowPath[40] = new Point(270,60);
yellowPath[41] = new Point(270,90);
yellowPath[42] = new Point(270,120);
yellowPath[43] = new Point(270,150);
yellowPath[44] = new Point(300,180);
yellowPath[45] = new Point(330,180);
yellowPath[46] = new Point(360,180);
yellowPath[47] = new Point(390,180);
yellowPath[48] = new Point(420,180);
yellowPath[49] = new Point(450,180);
yellowPath[50] = new Point(450,210);
yellowPath[51] = new Point(420,210);
yellowPath[52] = new Point(390,210);
yellowPath[53] = new Point(360,210);
yellowPath[54] = new Point(330,210);
yellowPath[55] = new Point(300,210);
yellowPath[56] = new Point(270,210);
    }

    private static void setupBluePath() {
        // Fill bluePath[0..55] with coordinates
    }

    public static int successMove(Point x, int val, int curTurn) {
        if (curTurn == 0) {
            int index = findPointIndex(BoardPaths.greenPath, x);
            System.out.println(index+ " Hello World!");
            for (int i = index; i <= val; i++) {

            }
            if(index==-1)return 0;
            else return index+val;
           
        }
       return -1;
    }

    public static int findPointIndex(Point[] path, Point target) {
        for (int i = 0; i < path.length; i++) {
            if (path[i] != null && path[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
