package cls.chess.ludo.snake.Ludo;

import java.awt.*;
import javax.swing.*;

public class LudoGame extends JFrame {

    private Dice dice = new Dice();   // ✅ Dice object class level এ
    private JLabel diceResult;  
    private GameState gameState;// Dice number দেখানোর জন্য

    public LudoGame() {

        setTitle("Ludo Game..");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setLocationRelativeTo(null);

        ImageIcon icon = signAddOnPanel.LudoIcon();
        setIconImage(icon.getImage());

         gameState = new GameState(4);
        setupUI();   // UI setup আলাদা method এ
        setVisible(true);
    }

    private void setupUI() {

        JPanel adder = new JPanel();
        adder.setBackground(Color.PINK);
        adder.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));

        // Ludo Board
        JPanel panel = new LudoPanel();
        adder.add(panel);

        // Dice Panel
        JPanel dicePanel = new JPanel();
        dicePanel.setLayout(new FlowLayout());
        dicePanel.setBackground(Color.PINK);

        JButton diceBtn = new JButton("Roll Dice");
        diceBtn.setPreferredSize(new Dimension(120, 50));

        diceResult = new JLabel("INF");
        diceResult.setFont(new Font("Arial", Font.BOLD, 30));

        // 🎲 Dice Action
        diceBtn.addActionListener(e -> {
            int value = dice.roll();
            diceResult.setText(String.valueOf(value));
            System.out.println("Dice rolled: " + value);
            
             int current = gameState.getCurrentPlayer(); // int
System.out.println("Current Player: " + PlayerColor.getName(current));


 gameState.nextTurn();  

            
        });

        dicePanel.add(diceBtn);
        dicePanel.add(diceResult);

        adder.add(dicePanel);

        add(adder, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new LudoGame();
        
        
    }
}