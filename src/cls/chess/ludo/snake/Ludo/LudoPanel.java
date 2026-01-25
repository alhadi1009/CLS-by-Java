/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cls.chess.ludo.snake.Ludo;
import javax.swing.*;
import java.awt.*;

public class LudoPanel extends JPanel {

    final static int PerCell = 30;
    final static int NumberOfSquare = 15;
    LudoPanel(){
       this.setPreferredSize(new Dimension(450, 450)); 
               
    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2D= (Graphics2D) g;
        
        
        // This is First Square of Ludo in My game . 
        // Rectangle Part
        g2D.setColor(Color.WHITE);
        g2D.fillRect(0, 0, PerCell*NumberOfSquare, PerCell*NumberOfSquare);
       g2D.setPaint(Color.decode("#00796B"));// Color select
       g2D.fillRect(0, 0, 30, 180);       g2D.fillRect(0, 150, 180, 30);   
       g2D.fillRect(150,0,30,150);        g2D.fillRect(0, 0, 150, 30);
       // Extra Part
        g2D.fillRect(30, 180, 30, 60);    g2D.fillRect(60, 210, 150, 30);
        // Triangle Part
        int[] pxar={180,180,225};
        int[] pyar={180,270,225};
        g2D.fillPolygon(pxar,pyar,3);
        
         // Circle part of mid
         g2D.setStroke(new BasicStroke(2));
         g2D.drawArc(105, 45, 30, 30, 180, 180);
         g2D.drawArc(105, 45, 30, 30, 180, -180);
         
         g2D.drawArc(105, 105, 30, 30, 180, 180);
         g2D.drawArc(105, 105, 30, 30, 180, -180);
         
         g2D.drawArc(45, 45, 30, 30, 180, 180);
         g2D.drawArc(45, 45, 30, 30, 180, -180);
         
         g2D.drawArc(45, 105, 30, 30, 180, 180);
         g2D.drawArc(45, 105, 30, 30, 180, -180);
         
         // The End of my first Part code. . . 
         
         // This is second Square of Ludo in my Game.....
         //Rectangle Part
          g2D.setPaint(Color.decode("#8E0038"));// Color select
          g2D.fillRect(270, 0, 180, 30);     g2D.fillRect(420, 0, 30, 180);
          g2D.fillRect(270, 150, 180, 30);   g2D.fillRect(270, 0, 30, 180);
          // Extra Part
          g2D.fillRect(210,30,30,150);    g2D.fillRect(240, 30, 30, 30);
          
          // Triangle Part
           pxar = new int[]{180,270,225};
           pyar = new int[]{180,180,225};
          g2D.fillPolygon(pxar, pyar, 3);
          
          // Circle part of mid 
            g2D.setStroke(new BasicStroke(2));
            
         g2D.drawArc(375, 45, 30, 30, 180, 180);
         g2D.drawArc(375, 45, 30, 30, 180, -180);
         
         g2D.drawArc(315, 105, 30, 30, 180, 180);
         g2D.drawArc(315, 105, 30, 30, 180, -180);
         
         g2D.drawArc(315, 45, 30, 30, 180, 180);
         g2D.drawArc(315, 45, 30, 30, 180, -180);
         
         g2D.drawArc(375, 105, 30, 30, 180, 180);
         g2D.drawArc(375, 105, 30, 30, 180, -180);
         // The End of my Second Part code. . . 
         
         // This is Third Square of Ludo in my Game.....
         //Rectangle Part
         
         g2D.setPaint(Color.decode("#C9A227"));// Color select
         


          
          
         
         
         
         
        

        
        
        
        
        
        
         g2D.setColor(Color.GRAY);
    g2D.setStroke(new BasicStroke(.1f));
    for (int row = 0; row < NumberOfSquare; row++) {
        for (int col = 0; col < NumberOfSquare; col++) {
            int x = col * PerCell;
            int y = row * PerCell;
            g2D.drawRect(x, y, PerCell, PerCell);
        }
    }
       
        
    }
}
