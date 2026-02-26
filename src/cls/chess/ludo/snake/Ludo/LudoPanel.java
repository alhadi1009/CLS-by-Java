/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cls.chess.ludo.snake.Ludo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class LudoPanel extends JPanel {

    JLayeredPane temp1, temp2;

    private Point[][] homePositions = new Point[4][4]; //NEW
// Current steps of each pawn on their respective paths
    private int[] greenPawnStep = new int[4];   // Green pawns
    private int[] redPawnStep = new int[4];     // Red pawns
    private int[] yellowPawnStep = new int[4];  // Yellow pawns
    private int[] bluePawnStep = new int[4];    // Blue pawns    

    private ArrayList<JLayeredPane> greenPawns = new ArrayList<>();
    private ArrayList<JLayeredPane> redPawns = new ArrayList<>();
    private ArrayList<JLayeredPane> yellowPawns = new ArrayList<>();
    private ArrayList<JLayeredPane> bluePawns = new ArrayList<>();
    final static int PerCell = 30;
    final static int NumberOfSquare = 15;
    private int selectedGreenPawn = -1;
    private int selectedRedPawn = -1;
    private int selectedYellowPawn = -1;
    private int selectedBluePawn = -1;

    private int currentTurn = 0; // 0=green, 1=red, 2=yellow, 3=blue

    LudoPanel() {
        this.setLayout(null);
        this.setPreferredSize(new Dimension(450, 450));
        ImageIcon star = signAddOnPanel.IMGStar();
        loadImg(star);
        setupHomePositions();

        setupGreenPawns();
        setupRedPawns();
        setupYellowPawns();
        setupbluePawns();

        // Down arrow;
        ImageIcon arrow = signAddOnPanel.IMGDownArrow();
        JLabel y = new JLabel(arrow);
        y.setBounds(210, 0, 27, 27);
        this.add(y);

        // Up arrow;
        arrow = signAddOnPanel.IMGUpArrow();
        y = new JLabel(arrow);
        y.setBounds(210, 420, 27, 27);
        this.add(y);
        // Right arrow;

        arrow = signAddOnPanel.IMGRightArrow();
        y = new JLabel(arrow);
        y.setBounds(0, 210, 27, 27);
        this.add(y);
        // Left arrow;
        arrow = signAddOnPanel.IMGLeftArrow();
        y = new JLabel(arrow);
        y.setBounds(420, 210, 27, 27);
        this.add(y);

        for (int i = 0; i < 4; i++) {
            greenPawnStep[i] = -1;
            redPawnStep[i] = -1;
            yellowPawnStep[i] = -1;
            bluePawnStep[i] = -1;
        }

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                ArrayList<JLayeredPane> pawns = null;

                switch (currentTurn) {
                    case 0 ->
                        pawns = greenPawns;
                    case 1 ->
                        pawns = redPawns;
                    case 2 ->
                        pawns = yellowPawns;
                    case 3 ->
                        pawns = bluePawns;
                }

                if (pawns == null) {
                    return; // current turn invalid
                }
                Point click = e.getPoint();
                for (int i = 0; i < pawns.size(); i++) {
                    JLayeredPane pawn = pawns.get(i);
                    Rectangle bounds = SwingUtilities.convertRectangle(pawn.getParent(), pawn.getBounds(), LudoPanel.this);
                    if (bounds.contains(click)) {
                        // selected pawn set korbo turn-er hisabe
                        switch (currentTurn) {
                            case 0 ->
                                selectedGreenPawn = i;
                            case 1 ->
                                selectedRedPawn = i;
                            case 2 ->
                                selectedYellowPawn = i;
                            case 3 ->
                                selectedBluePawn = i;
                        }
                        System.out.println("Selected pawn: " + i + " for player " + currentTurn);
                        break;
                    }
                }
            }
        });

    }

    private void setupGreenPawns() {

        for (int i = 0; i < 4; i++) {
            Point p = homePositions[0][i];
            JLayeredPane pawn = PawnLocation.addPawnGreenCircle(p.x, p.y);
            greenPawns.add(pawn);        // store in ArrayList
            this.add(pawn);              // add to panel
        }
    }

    private void setupRedPawns() {
        // Positions for the 4 red pawns

        for (int i = 0; i < 4; i++) {
            Point p = homePositions[1][i];

            JLayeredPane pawn = PawnLocation.addPawnRedCircle(p.x, p.y);
            redPawns.add(pawn);        // store in ArrayList
            this.add(pawn);             // add to panel
        }
    }

    private void setupYellowPawns() {

        for (int i = 0; i < 4; i++) {
            Point p = homePositions[2][i];

            JLayeredPane pawn = PawnLocation.addPawnYellowCircle(p.x, p.y);
            yellowPawns.add(pawn);
            this.add(pawn);
        }
    }

    private void setupbluePawns() {

        for (int i = 0; i < 4; i++) {
            Point p = homePositions[3][i];
            JLayeredPane pawn = PawnLocation.addPawnBlueCircle(p.x, p.y);
            bluePawns.add(pawn);        // store in ArrayList
            this.add(pawn);             // add to panel
        }

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;

        // This is First Square of Ludo in My game . 
        // Rectangle Part
        g2D.setColor(Color.WHITE);
        g2D.fillRect(0, 0, PerCell * NumberOfSquare, PerCell * NumberOfSquare);
        g2D.setPaint(Color.decode("#00796B"));// Color select
        g2D.fillRect(0, 0, 30, 180);
        g2D.fillRect(0, 150, 180, 30);
        g2D.fillRect(150, 0, 30, 150);
        g2D.fillRect(0, 0, 150, 30);
        // Extra Part
        g2D.fillRect(30, 180, 30, 60);
        g2D.fillRect(60, 210, 150, 30);
        // Triangle Part
        int[] pxar = {180, 180, 225};
        int[] pyar = {180, 270, 225};
        g2D.fillPolygon(pxar, pyar, 3);

        // Circle part of mid
        g2D.setStroke(new BasicStroke(2));
        g2D.fillArc(105, 45, 30, 30, 180, 180);
        g2D.fillArc(105, 45, 30, 30, 180, -180);

        g2D.fillArc(105, 105, 30, 30, 180, 180);
        g2D.fillArc(105, 105, 30, 30, 180, -180);

        g2D.fillArc(45, 45, 30, 30, 180, 180);
        g2D.fillArc(45, 45, 30, 30, 180, -180);

        g2D.fillArc(45, 105, 30, 30, 180, 180);
        g2D.fillArc(45, 105, 30, 30, 180, -180);

        // The End of my first Part code. . . 
        // This is second Square of Ludo in my Game.....
        //Rectangle Part
        g2D.setPaint(Color.decode("#8E0038"));// Color select
        g2D.fillRect(270, 0, 180, 30);
        g2D.fillRect(420, 0, 30, 180);
        g2D.fillRect(270, 150, 180, 30);
        g2D.fillRect(270, 0, 30, 180);
        // Extra Part
        g2D.fillRect(210, 30, 30, 150);
        g2D.fillRect(240, 30, 30, 30);

        // Triangle Part
        pxar = new int[]{180, 270, 225};
        pyar = new int[]{180, 180, 225};
        g2D.fillPolygon(pxar, pyar, 3);

        // Circle part of mid 
        g2D.setStroke(new BasicStroke(2));

        g2D.fillArc(375, 45, 30, 30, 180, 180);
        g2D.fillArc(375, 45, 30, 30, 180, -180);

        g2D.fillArc(315, 105, 30, 30, 180, 180);
        g2D.fillArc(315, 105, 30, 30, 180, -180);

        g2D.fillArc(315, 45, 30, 30, 180, 180);
        g2D.fillArc(315, 45, 30, 30, 180, -180);

        g2D.fillArc(375, 105, 30, 30, 180, 180);
        g2D.fillArc(375, 105, 30, 30, 180, -180);
        // The End of my Second Part code. . . 

        // This is Third Square of Ludo in my Game.....
        //Rectangle Part
        g2D.setPaint(Color.decode("#CC5500"));// Color select
        g2D.fillRect(270, 270, 180, 30);
        g2D.fillRect(420, 270, 30, 180);
        g2D.fillRect(270, 270, 30, 180);
        g2D.fillRect(270, 420, 180, 30);

        // Extra Part
        g2D.fillRect(270, 210, 150, 30);
        g2D.fillRect(390, 240, 30, 30);

        // Triangle Part
        pxar = new int[]{270, 270, 225};
        pyar = new int[]{270, 180, 225};
        g2D.fillPolygon(pxar, pyar, 3);

        // Circle part of mid 
        g2D.setStroke(new BasicStroke(2));

        g2D.fillArc(375, 315, 30, 30, 180, 180);
        g2D.fillArc(375, 315, 30, 30, 180, -180);

        g2D.fillArc(315, 315, 30, 30, 180, 180);
        g2D.fillArc(315, 315, 30, 30, 180, -180);

        g2D.fillArc(315, 375, 30, 30, 180, 180);
        g2D.fillArc(315, 375, 30, 30, 180, -180);

        g2D.fillArc(375, 375, 30, 30, 180, 180);
        g2D.fillArc(375, 375, 30, 30, 180, -180);
        // The End of my Third Part code. . . 

        // This is Fourth Square of Ludo in my Game.....
        //Rectangle Part
        g2D.setColor(Color.decode("#283593"));// Color set 

        g2D.fillRect(0, 270, 180, 30);
        g2D.fillRect(150, 270, 30, 180);
        g2D.fillRect(0, 420, 180, 30);
        g2D.fillRect(0, 270, 30, 180);

        // Extra Part
        g2D.fillRect(210, 270, 30, 150);
        g2D.fillRect(180, 390, 30, 30);

        // Triangle Part
        pxar = new int[]{180, 270, 225};
        pyar = new int[]{270, 270, 225};
        g2D.fillPolygon(pxar, pyar, 3);

        // Circle part of mid
        g2D.setStroke(new BasicStroke(2));
        g2D.fillArc(105, 315, 30, 30, 180, 180);
        g2D.fillArc(105, 315, 30, 30, 180, -180);

        g2D.fillArc(105, 375, 30, 30, 180, 180);
        g2D.fillArc(105, 375, 30, 30, 180, -180);

        g2D.fillArc(45, 315, 30, 30, 180, 180);
        g2D.fillArc(45, 315, 30, 30, 180, -180);

        g2D.fillArc(45, 375, 30, 30, 180, 180);
        g2D.fillArc(45, 375, 30, 30, 180, -180);

        g2D.setColor(Color.decode("#000000"));// CAN BE USED #696969;;and 1 instead of .1f; 
        g2D.setStroke(new BasicStroke(.1F));
        g2D.drawRect(0, 0, 480, 480);
        for (int row = 180; row <= 240; row += 30) {
            for (int col = 0; col <= 150; col += 30) {
                g2D.drawRect(row, col, 30, 30);
            }
        }
        for (int row = 180; row <= 240; row += 30) {
            for (int col = 270; col <= 450; col += 30) {
                g2D.drawRect(row, col, 30, 30);
            }
        }
        for (int row = 0; row <= 150; row += 30) {
            for (int col = 180; col <= 240; col += 30) {
                g2D.drawRect(row, col, 30, 30);
            }
        }
        for (int row = 270; row <= 450; row += 30) {
            for (int col = 180; col <= 240; col += 30) {
                g2D.drawRect(row, col, 30, 30);
            }
        }

    }

    final void loadImg(ImageIcon x) {

        int[] imx = new int[]{180, 360, 240, 60};
        int[] imy = new int[]{60, 180, 360, 240};
        for (int i = 0; i < 4; i++) {
            JLabel y = new JLabel(x);
            y.setBounds(imx[i], imy[i], 27, 27);
            this.add(y);
        }

    }
//    public JLayeredPane getGreenPawn(int index) {
//        if (index < 0 || index >= greenPawns.size()) return null;
//        return greenPawns.get(index);
//    }
//    public JLayeredPane getRedPawn(int index) {
//        if (index < 0 || index >= redPawns.size()) return null;
//        return redPawns.get(index);
//    }
//    public JLayeredPane getYellowPawn(int index) {
//        if (index < 0 || index >= yellowPawns.size()) return null;
//        return yellowPawns.get(index);
//    }
//    public JLayeredPane getBluePawn(int index) {
//        if (index < 0 || index >= bluePawns.size()) return null;
//        return bluePawns.get(index);
//    }

    private void setupHomePositions() {
        // GREEN
        homePositions[0][0] = new Point(45, 35);
        homePositions[0][1] = new Point(105, 35);
        homePositions[0][2] = new Point(45, 95);
        homePositions[0][3] = new Point(105, 95);

        // RED
        homePositions[1][0] = new Point(315, 35);
        homePositions[1][1] = new Point(375, 35);
        homePositions[1][2] = new Point(315, 95);
        homePositions[1][3] = new Point(375, 95);

        // YELLOW
        homePositions[2][0] = new Point(315, 305);
        homePositions[2][1] = new Point(375, 305);
        homePositions[2][2] = new Point(315, 365);
        homePositions[2][3] = new Point(375, 365);

        // BLUE
        homePositions[3][0] = new Point(45, 305);
        homePositions[3][1] = new Point(105, 305);
        homePositions[3][2] = new Point(45, 365);
        homePositions[3][3] = new Point(105, 365);
    }
    // GREEN

    public void moveGreenPawn(int pawnIndex, int steps) {
        greenPawnStep[pawnIndex] += steps;
        if (greenPawnStep[pawnIndex] >= BoardPaths.TOTAL_STEPS) {
            greenPawnStep[pawnIndex] = BoardPaths.TOTAL_STEPS - 1;
        }
        Point p = BoardPaths.greenPath[greenPawnStep[pawnIndex]];
        greenPawns.get(pawnIndex).setLocation(p.x, p.y);
        repaint();
    }

// RED
    public void moveRedPawn(int pawnIndex, int steps) {
        redPawnStep[pawnIndex] += steps;
        if (redPawnStep[pawnIndex] >= BoardPaths.TOTAL_STEPS) {
            redPawnStep[pawnIndex] = BoardPaths.TOTAL_STEPS - 1;
        }
        Point p = BoardPaths.redPath[redPawnStep[pawnIndex]];
        redPawns.get(pawnIndex).setLocation(p.x, p.y);
        repaint();
    }

// YELLOW
    public void moveYellowPawn(int pawnIndex, int steps) {
        yellowPawnStep[pawnIndex] += steps;
        if (yellowPawnStep[pawnIndex] >= BoardPaths.TOTAL_STEPS) {
            yellowPawnStep[pawnIndex] = BoardPaths.TOTAL_STEPS - 1;
        }
        Point p = BoardPaths.yellowPath[yellowPawnStep[pawnIndex]];
        yellowPawns.get(pawnIndex).setLocation(p.x, p.y);
        repaint();
    }

// BLUE
    public void moveBluePawn(int pawnIndex, int steps) {
        bluePawnStep[pawnIndex] += steps;
        if (bluePawnStep[pawnIndex] >= BoardPaths.TOTAL_STEPS) {
            bluePawnStep[pawnIndex] = BoardPaths.TOTAL_STEPS - 1;
        }
        Point p = BoardPaths.bluePath[bluePawnStep[pawnIndex]];
        bluePawns.get(pawnIndex).setLocation(p.x, p.y);
        repaint();
    }
// Green

    public int getSelectedGreenPawn() {
        return selectedGreenPawn;
    }

    public void setSelectedGreenPawn(int index) {
        this.selectedGreenPawn = index;
    }

// Red
    public int getSelectedRedPawn() {
        return selectedRedPawn;
    }

    public void setSelectedRedPawn(int index) {
        this.selectedRedPawn = index;
    }

// Yellow
    public int getSelectedYellowPawn() {
        return selectedYellowPawn;
    }

    public void setSelectedYellowPawn(int index) {
        this.selectedYellowPawn = index;
    }

// Blue
    public int getSelectedBluePawn() {
        return selectedBluePawn;
    }

    public void setSelectedBluePawn(int index) {
        this.selectedBluePawn = index;
    }

    public void movedPawn(String player, int value) {
        ArrayList<JLayeredPane> pawns = null;
        int[] steps = null;
        Point[] path = null;
        int playerIndex = -1;
        switch (player) {
            case "Green" -> {
                pawns = greenPawns;
                steps = greenPawnStep;
                path = BoardPaths.greenPath;
                playerIndex = 0;
            }
            case "Red" -> {
                pawns = redPawns;
                steps = redPawnStep;
                path = BoardPaths.redPath;
                playerIndex = 1;

            }
            case "Yellow" -> {
                pawns = yellowPawns;
                steps = yellowPawnStep;
                path = BoardPaths.yellowPath;
                playerIndex = 2;
            }
            case "Blue" -> {
                pawns = bluePawns;
                steps = bluePawnStep;
                path = BoardPaths.bluePath;
                playerIndex = 3;
            }
            default -> {
                return;
            }
        }

//        for (int i = 0; i < 4; i++) {
//            System.out.println(steps[i]);
//        }
//        steps[0] = 1;
//        
        for (int i = 0; i < pawns.size(); i++) {
            // যদি pawn home এ থাকে (-1) এবং dice 6 আসে
            JLayeredPane oldPawn = pawns.get(i);
            if (steps[i] == -1 && value == 6) {
                Point pt = homePositions[playerIndex][i];
                System.out.print(homePositions[playerIndex][i]);

                temp2 = oldPawn;
                //pawns.get(i).setLocation(pt.x, pt.y);
                switch (playerIndex) {
                    case 0 ->
                        temp1 = ChangeDice.addPawnGreenCircle(pt.x, pt.y);
                    case 1 ->
                        temp1 = ChangeDice.addPawnRedCircle(pt.x, pt.y);
                    case 2 ->
                        temp1 = ChangeDice.addPawnYellowCircle(pt.x, pt.y);
                    case 3 ->
                        temp1 = ChangeDice.addPawnBlueCircle(pt.x, pt.y);
                    default ->
                        throw new IllegalStateException("Unexpected value: " + playerIndex);
                }
                this.remove(oldPawn);
                this.add(temp1);
                pawns.set(i, temp1);
                // AD action listener ; 
                // steps[i] = 0; // board এ প্রবেশ

                repaint();
            } // যদি pawn already board এ থাকে
            if (steps[i] != -1 && steps[i] + value < BoardPaths.TOTAL_STEPS) {
//                steps[i] += value;               // <-- step update
                Point pt = path[steps[i]];       // <-- updated position

                temp2 = oldPawn;

                switch (playerIndex) {
                    case 0 ->
                        temp1 = ChangeDice.addPawnGreenCircle(pt.x, pt.y);
                    case 1 ->
                        temp1 = ChangeDice.addPawnRedCircle(pt.x, pt.y);
                    case 2 ->
                        temp1 = ChangeDice.addPawnYellowCircle(pt.x, pt.y);
                    case 3 ->
                        temp1 = ChangeDice.addPawnBlueCircle(pt.x, pt.y);
                    default ->
                        throw new IllegalStateException("Unexpected value: " + playerIndex);
                }
                System.out.print(pt.x + "  " + pt.y);
                //  temp1.setBounds(pt.x, pt.y, 40, 40);          // <-- ensure bounds
                if (oldPawn != null) {
                    this.remove(oldPawn);   // remove old first
                }
                this.add(temp1, JLayeredPane.PALETTE_LAYER); // add new in proper layer
                pawns.set(i, temp1);                         // update ArrayList

                repaint();
            }
        }
    }

}
