/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cls.chess.ludo.snake.Ludo;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;

/**
 *
 * @author Al Hadi
 */
public class ChangeDice {
   
  
  public static JLayeredPane addPawnGreenCircle(int x, int y) {

    // parent cell (Ludo cell)
    JLayeredPane layeredPane = new JLayeredPane();
    layeredPane.setLayout(null);
    layeredPane.setBounds(x, y, 40, 40);
    layeredPane.setFocusable(false);

    // bottom pawn (25x25)
    JLabel redPawn = new JLabel(Pawn.GreenPawn());
    redPawn.setBounds(3,5, 25, 25);   // inside 40x40
    redPawn.setFocusable(false);

    // top pawn (25x25)
    JLabel greenPawn = new JLabel(Pawn.ChangeCircle());
    greenPawn.setBounds(-2, 7, 35, 35);  // slightly up
    greenPawn.setFocusable(false);

    // Z-index (top > bottom)
    layeredPane.add(greenPawn, Integer.valueOf(1));
    layeredPane.add(redPawn, Integer.valueOf(2));   

    return layeredPane;
}
  public static JLayeredPane addPawnRedCircle(int x, int y) {

    // parent cell (Ludo cell)
    JLayeredPane layeredPane = new JLayeredPane();
    layeredPane.setLayout(null);
    layeredPane.setBounds(x, y, 40, 40);
    layeredPane.setFocusable(false);

    // bottom pawn (25x25)
    JLabel redPawn = new JLabel(Pawn.RedPawn());
    redPawn.setBounds(3,5, 25, 25);   // inside 40x40
    redPawn.setFocusable(false);

    // top pawn (25x25)
    JLabel greenPawn = new JLabel(Pawn.ChangeCircle());
    greenPawn.setBounds(-2, 7, 35, 35);  // slightly up
    greenPawn.setFocusable(false);

    // Z-index (top > bottom)
    layeredPane.add(greenPawn, Integer.valueOf(1));
    layeredPane.add(redPawn, Integer.valueOf(2));   

    return layeredPane;
}
  public static JLayeredPane addPawnYellowCircle(int x, int y) {

    // parent cell (Ludo cell)
    JLayeredPane layeredPane = new JLayeredPane();
    layeredPane.setLayout(null);
    layeredPane.setBounds(x, y, 40, 40);
    layeredPane.setFocusable(false);

    // bottom pawn (25x25)
    JLabel redPawn = new JLabel(Pawn.YellowPawn());
    redPawn.setBounds(3,5, 25, 25);   // inside 40x40
    redPawn.setFocusable(false);

    // top pawn (25x25)
    JLabel greenPawn = new JLabel(Pawn.ChangeCircle());
    greenPawn.setBounds(-2, 7, 35, 35);  // slightly up
    greenPawn.setFocusable(false);

    // Z-index (top > bottom)
    layeredPane.add(greenPawn, Integer.valueOf(1));
    layeredPane.add(redPawn, Integer.valueOf(2));   
    
    return layeredPane;
}
public static JLayeredPane addPawnBlueCircle(int x, int y) {

    // parent cell (Ludo cell)
    JLayeredPane layeredPane = new JLayeredPane();
    layeredPane.setLayout(null);
    layeredPane.setBounds(x, y, 40, 40);
    layeredPane.setFocusable(false);

    // bottom pawn (25x25)
    JLabel redPawn = new JLabel(Pawn.BluePawn());
    redPawn.setBounds(3,5, 25, 25);   // inside 40x40
    redPawn.setFocusable(false);

    // top pawn (25x25)
    JLabel greenPawn = new JLabel(Pawn.ChangeCircle());
    greenPawn.setBounds(-2, 7, 35, 35);  // slightly up
    greenPawn.setFocusable(false);

    // Z-index (top > bottom)
    layeredPane.add(greenPawn, Integer.valueOf(1));
    layeredPane.add(redPawn, Integer.valueOf(2));   
    
    return layeredPane;
}
    
}
