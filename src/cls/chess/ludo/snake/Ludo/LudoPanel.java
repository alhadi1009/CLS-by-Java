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
        
        
        
        
        g2D.setColor(Color.WHITE);
        g2D.fillRect(0, 0, PerCell*NumberOfSquare, PerCell*NumberOfSquare);
       g2D.setPaint(Color.decode("#00796B"));
       g2D.fillRect(0, 0, 30, 180);       g2D.fillRect(0, 150, 180, 30);   
       g2D.fillRect(150,0,30,150);        g2D.fillRect(0, 0, 150, 30);
       
        g2D.fillRect(30, 180, 30, 60);    g2D.fillRect(60, 210, 150, 30);
        
        
        
        
        
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
