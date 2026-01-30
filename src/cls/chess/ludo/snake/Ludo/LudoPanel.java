/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cls.chess.ludo.snake.Ludo;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class LudoPanel extends JPanel {
      private ArrayList<JLayeredPane> greenPawns = new ArrayList<>();
      private ArrayList<JLayeredPane> redPawns = new ArrayList<>();
      private ArrayList<JLayeredPane>yellowPawns = new ArrayList<>();
      private ArrayList<JLayeredPane>bluePawns = new ArrayList<>();
final static int PerCell=30;
   final static int NumberOfSquare=15;
    int cnt=0;
    
    LudoPanel(){
        this.setLayout(null);
       this.setPreferredSize(new Dimension(450, 450)); 
     ImageIcon star = signAddOnPanel.IMGStar(); 
     loadImg(star);
  

     
     setupGreenPawns();
     setupRedPawns();
     setupYellowPawns();
     setupbluePawns();
             
             
     // Down arrow;
     ImageIcon arrow = signAddOnPanel.IMGDownArrow();
     JLabel y= new JLabel(arrow);
            y.setBounds(210,0, 27, 27); 
            this.add(y);
     
    // Up arrow;
    arrow = signAddOnPanel.IMGUpArrow();
    y=new JLabel(arrow);
     y.setBounds(210,420, 27, 27); 
            this.add(y);
    // Right arrow;
    
    arrow = signAddOnPanel.IMGRightArrow();
    y=new JLabel(arrow);
     y.setBounds(0,210, 27, 27); 
            this.add(y);
    // Left arrow;
    arrow = signAddOnPanel.IMGLeftArrow();
    y=new JLabel(arrow);
     y.setBounds(420,210, 27, 27); 
            this.add(y);
            
    
 

               
    }
    
    
  private void setupGreenPawns() {
        // Positions for the 4 green pawns
        int[][] positions = {
            {45, 35},
            {105, 35},
            {45, 95},
            {105, 95}
        };

        for (int i = 0; i < 4; i++) {
            JLayeredPane pawn = PawnLocation.addPawnGreenCircle(positions[i][0], positions[i][1]);
            greenPawns.add(pawn);        // store in ArrayList
            this.add(pawn);              // add to panel
        }
    }
  
 private void setupRedPawns() {
        // Positions for the 4 red pawns
        int[][] positions = {
            {315, 35},
            {375, 35},
            {315, 95},
            {375, 95}
        };

        for (int i = 0; i < 4; i++) {
            JLayeredPane pawn = PawnLocation.addPawnRedCircle(positions[i][0], positions[i][1]);
            redPawns.add(pawn);        // store in ArrayList
            this.add(pawn);             // add to panel
        }
    }
 
 private void setupYellowPawns()
 {
     int [][] positions = 
     {
         {315,305},
         {375, 305},
         {315, 365},
         {375, 365}
     };
             for(int i=0;i<4;i++)
             {
                 JLayeredPane pawn = PawnLocation.addPawnYellowCircle(positions[i][0],positions[i][1]);
                 yellowPawns.add(pawn);
                 this.add(pawn);
             }
 }
 private void setupbluePawns()
 {
     int [][] positions = 
     {
         {45,305},
         {105,305},
         {45,365},
         {105,365}
         
     };
     for (int i = 0; i < 4; i++) {
            JLayeredPane pawn = PawnLocation.addPawnBlueCircle(positions[i][0], positions[i][1]);
            bluePawns.add(pawn);        // store in ArrayList
            this.add(pawn);             // add to panel
        }
   
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
         g2D.fillRect(270, 270, 180, 30);    g2D.fillRect(420, 270, 30, 180);
         g2D.fillRect(270, 270, 30, 180);    g2D.fillRect(270, 420, 180, 30);

          // Extra Part
         g2D.fillRect(270, 210, 150, 30);   g2D.fillRect(390, 240, 30, 30);
         
           // Triangle Part
           
            pxar = new int[]{270,270,225};
           pyar = new int[]{270,180,225};
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
         
        g2D.fillRect(0, 270, 180, 30);  g2D.fillRect(150, 270, 30, 180);
        g2D.fillRect(0, 420, 180, 30); g2D.fillRect(0, 270, 30, 180);
        
        // Extra Part
        g2D.fillRect(210, 270, 30, 150); g2D.fillRect(180, 390, 30, 30);
        
        
         // Triangle Part
           
            pxar = new int[]{180,270,225};
           pyar = new int[]{270,270,225};
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
    for(int row= 180;row<=240;row+=30)
    {
        for(int col=0;col<=150;col+=30)
        {
            g2D.drawRect(row, col, 30, 30);
        }
    }
    for(int row= 180;row<=240;row+=30)
    {
        for(int col=270;col<=450;col+=30)
        {
            g2D.drawRect(row, col, 30, 30);
        }
    }
    for(int row= 0;row<=150;row+=30)
    {
        for(int col=180;col<=240;col+=30)
        {
            g2D.drawRect(row, col, 30, 30);
        }
    }
     for(int row= 270;row<=450;row+=30)
    {
        for(int col=180;col<=240;col+=30)
        {
            g2D.drawRect(row, col, 30, 30);
        }
    }
     
       
        
    }
    
   final void loadImg(ImageIcon x)
    {
        
        int[] imx=new int[]{180,360,240,60};
        int[] imy=new int[]{60,180,360,240};
        for(int i=0;i<4;i++)
        {JLabel y= new JLabel(x);
            y.setBounds(imx[i], imy[i], 27, 27); 
            this.add(y);
        }
        
        
    }
    public JLayeredPane getGreenPawn(int index) {
        if (index < 0 || index >= greenPawns.size()) return null;
        return greenPawns.get(index);
    }
    public JLayeredPane getRedPawn(int index) {
        if (index < 0 || index >= redPawns.size()) return null;
        return redPawns.get(index);
    }
    public JLayeredPane getYellowPawn(int index) {
        if (index < 0 || index >= yellowPawns.size()) return null;
        return yellowPawns.get(index);
    }
    public JLayeredPane getBluePawn(int index) {
        if (index < 0 || index >= bluePawns.size()) return null;
        return bluePawns.get(index);
    }
    
}
