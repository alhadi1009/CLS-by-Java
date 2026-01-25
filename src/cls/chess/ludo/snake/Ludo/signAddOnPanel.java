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
public class signAddOnPanel {
    public static ImageIcon IMGStar() {
        ImageIcon originalIcon = new ImageIcon(signAddOnPanel.class.getResource("Icon/star1.png"));
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }
   
      public static ImageIcon IMGDownArrow()
      {
           ImageIcon originalIcon = new ImageIcon(signAddOnPanel.class.getResource("Icon/arrowDown.png"));
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
      }
      
      public static ImageIcon IMGUpArrow()
      {
          ImageIcon originalIcon = new ImageIcon(signAddOnPanel.class.getResource("Icon/arrowUp.png"));
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
      }
      public static ImageIcon IMGRightArrow()
      {
          ImageIcon originalIcon = new ImageIcon(signAddOnPanel.class.getResource("Icon/arrowRight.png"));
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
      }
      public static ImageIcon IMGLeftArrow()
      {
       ImageIcon originalIcon = new ImageIcon(signAddOnPanel.class.getResource("Icon/arrowLeft.png"));
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);   
      }
      public static ImageIcon LudoIcon()
      {
           ImageIcon originalIcon = new ImageIcon(signAddOnPanel.class.getResource("Icon/LudoIcon.png"));
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage); 
      }
}

