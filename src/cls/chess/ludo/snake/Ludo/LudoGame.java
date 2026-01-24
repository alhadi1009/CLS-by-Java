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
import javax.swing.*;

public class LudoGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ludo Game");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setBackground(Color.PINK);
frame.setSize(1000,1000);

JPanel adder=new JPanel();
adder.setBackground(Color.pink);
adder.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
LudoPanel panel = new LudoPanel();

adder.add(panel);
//frame.setLayout(new BorderLayout());

frame.add(adder, BorderLayout.CENTER);

frame.setLocationRelativeTo(null);
frame.setVisible(true);

    }
}
