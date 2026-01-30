/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cls.chess.ludo.snake.Ludo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.net.URL;
import javax.swing.*;

public class LudoGame extends JFrame {
    LudoGame()
    { ImageIcon icon = signAddOnPanel.IMGDownArrow();

      //  this.setIconImage(icon.getImage());
        ImageIcon image = new ImageIcon("Icon/LudoIcon.png");
this.setIconImage(image.getImage());


        
        
        this.setBackground(Color.PINK);

    }

    public static void main(String[] args) {
       
    LudoGame frame = new LudoGame();
    frame.setTitle("Ludo Game..");
    
    ImageIcon icon = signAddOnPanel.LudoIcon();
frame.setIconImage(icon.getImage());

        
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//frame.setBackground(Color.PINK);
frame.setSize(1000,1000);

JPanel adder=new JPanel();
adder.setBackground(Color.pink);
adder.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
JPanel panel = new LudoPanel();

adder.add(panel);
//frame.setLayout(new BorderLayout());

   JPanel dicePanel = new JPanel();
dicePanel.setLayout(new FlowLayout());
dicePanel.setBackground(Color.PINK);
JButton diceBtn = new JButton("Roll Dice");
diceBtn.setPreferredSize(new Dimension(100, 50));
dicePanel.add(diceBtn);
adder.add(dicePanel);

    
  // frame.add(panel);
frame.add(adder, BorderLayout.CENTER);
frame.setLocationRelativeTo(null);
frame.setVisible(true);

    }
}
