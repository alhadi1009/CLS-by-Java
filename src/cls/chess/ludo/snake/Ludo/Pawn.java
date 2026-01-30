/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cls.chess.ludo.snake.Ludo;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Al Hadi
 */
public class Pawn {
   public static ImageIcon GreenPawn()
   {
       ImageIcon originalIcon=new ImageIcon(Pawn.class.getResource("Icon/Pawn1.png"));
               Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
   }
    public static ImageIcon BluePawn()
   {
       ImageIcon originalIcon=new ImageIcon(Pawn.class.getResource("Icon/Pawn4.png"));
               Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
   }
    public static ImageIcon YellowPawn()
   {
       ImageIcon originalIcon=new ImageIcon(Pawn.class.getResource("Icon/Pawn3.png"));
               Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
   }
    public static ImageIcon RedPawn()
   {
       ImageIcon originalIcon=new ImageIcon(Pawn.class.getResource("Icon/Pawn2.png"));
               Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
   }
    public static ImageIcon REDCircle()
   {
       ImageIcon originalIcon=new ImageIcon(Pawn.class.getResource("Icon/red.png"));
               Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
   }
    public static ImageIcon ChangeCircle()
   {
       ImageIcon originalIcon=new ImageIcon(Pawn.class.getResource("Icon/Circle2.png"));
               Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
   }
   

    
}
