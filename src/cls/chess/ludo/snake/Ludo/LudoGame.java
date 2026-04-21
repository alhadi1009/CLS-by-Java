package cls.chess.ludo.snake.Ludo;

import java.awt.*;
import javax.swing.*;

public class LudoGame extends JFrame {

    boolean dc = true;
    int value = 0, game_State = 2;
    private Dice dice = new Dice();   
    private JLabel diceResult;
    private GameState gameState;

    public LudoGame() {

        setTitle("Ludo Game..");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setLocationRelativeTo(null);

        ImageIcon icon = signAddOnPanel.LudoIcon();
        setIconImage(icon.getImage());

        gameState = new GameState(game_State);
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

        // BUTTON LISTENER
        diceBtn.addActionListener(e -> {
            if (GameControl.change) {
              //  GameControl.change=false;
                
                int values = dice.roll();
                diceResult.setText(String.valueOf(values));
                System.out.println("Dice rolled: " + values);
                value = values;
              System.out.println("This is value: "+value);
                int current = gameState.getCurrentPlayer();
                System.out.println(current);
                System.out.println("Current Player: " + PlayerColor.getName(current));

                int pawnIndex = -1;
                String _Current = PlayerColor.getName(current);
                int count=0;
                switch (_Current) {
                    case "Green": {
                        GameControl.mode=0;
                      count=  ((LudoPanel) panel).movedPawn("Green", value);
                        pawnIndex = ((LudoPanel) panel).getSelectedGreenPawn();
                        break;
                    }
                    case "Red": {
                      GameControl.mode=1;

                       count= ((LudoPanel) panel).movedPawn("Red", value);
                        pawnIndex = ((LudoPanel) panel).getSelectedRedPawn();
                        break;
                    }
                    case "Yellow": {
                      GameControl.mode=2;

                      count=  ((LudoPanel) panel).movedPawn("Yellow", value);
                        pawnIndex = ((LudoPanel) panel).getSelectedYellowPawn();
                        break;
                    }
                    case "Blue": {
               GameControl.mode=3;

                       count= ((LudoPanel) panel).movedPawn("Blue", value);
                        pawnIndex = ((LudoPanel) panel).getSelectedBluePawn();
                        break;
                    }
                    default: {
                        pawnIndex = -1; // optional
                        break;
                    }
                }
//                if (pawnIndex == -1) {
//                    System.out.println("Select a pawn first! Turn cannot proceed.");
//                    return;
//
//                }
               if(count!=0)
               {
                   GameControl.change=false;
System.out.println("change:"+count);
        }
                if(value !=6)
                {
                    System.out.println("here iam");
                     gameState.nextTurn();
                }
                

            }

            dc = false;
//    int current = gameState.getCurrentPlayer();
//    System.out.println("Current Player: " + PlayerColor.getName(current));
//
//    int pawnIndex = -1;
//String _Current=PlayerColor.getName(current);
//    switch (_Current) {
//    case "Green": {
//           ((LudoPanel) panel).movedPawn("Green",value);
//        pawnIndex = ((LudoPanel) panel).getSelectedGreenPawn();
//        break;
//    }
//    case "Red": {
//         ((LudoPanel) panel).movedPawn("Red",value);
//        pawnIndex = ((LudoPanel) panel).getSelectedRedPawn();
//        break;
//    }
//    case "Yellow": {
//         ((LudoPanel) panel).movedPawn("Yellow",value);
//        pawnIndex = ((LudoPanel) panel).getSelectedYellowPawn();
//        break;
//    }
//    case "Blue": {
//         ((LudoPanel) panel).movedPawn("Blue",value);
//        pawnIndex = ((LudoPanel) panel).getSelectedBluePawn();
//        break;
//    }
//    default: {
//        pawnIndex = -1; // optional
//        break;
//    }
//  }
            // This is last part; 
//            if (dc) {
//                if (value != 6) {
//                    gameState.nextTurn();
//                } else {
//                    System.out.println("Rolled 6! Extra turn.");
//                }
//            } else {
//                gameState.nextTurn();
//                dc = true;
//            }

//    if (pawnIndex == -1) {
//        System.out.println("Select a pawn first! Turn cannot proceed.");
//        return ;
//      
//       
//    }
            // Move the selected pawn
//    switch (current) {
//        case 0 -> {
//            ((LudoPanel) panel).moveGreenPawn(pawnIndex, value);
//            ((LudoPanel) panel).setSelectedGreenPawn(-1);
//        }
//        case 1 -> {
//            ((LudoPanel) panel).moveRedPawn(pawnIndex, value);
//            ((LudoPanel) panel).setSelectedRedPawn(-1);
//        }
//        case 2 -> {
//            ((LudoPanel) panel).moveYellowPawn(pawnIndex, value);
//            ((LudoPanel) panel).setSelectedYellowPawn(-1);
//        }
//        case 3 -> {
//            ((LudoPanel) panel).moveBluePawn(pawnIndex, value);
//            ((LudoPanel) panel).setSelectedBluePawn(-1);
//        }
//    }
            // ✅ Turn management
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
