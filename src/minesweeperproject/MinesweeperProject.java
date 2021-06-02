//package minesweeperproject;
//
//import java.awt.Color;
//import java.awt.Dimension;
//import java.util.LinkedList;
//import java.util.Random;
//import javax.swing.BorderFactory;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.WindowConstants;
//import javax.swing.border.LineBorder;
//
//public class MinesweeperProject {
//
//    private static int GAME_WIDTH = 376;
//    private static int GAME_HEIGHT = 500;
//    private static int ARRAY_W = 9;
//    private static int ARRAY_L = 9;
//
//    public static void main(String[] args) {
//        JButton[][] buttons = new JButton[ARRAY_W][ARRAY_L];
//        Random generator = new Random();
//        JFrame frame = new JFrame("Minesweeper");
//        JPanel panel = new JPanel();
//        
//        frame.setSize(GAME_WIDTH, GAME_HEIGHT);
//        frame.setVisible(true);
//        frame.setResizable(false);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        panel.setLayout(null);
//        frame.add(panel);
//        int br = 0;
//        int p = 0;
//        int q = 0;
//        int brJ = 0;
//        int brBombs = 0;
//        for (int i = 0; i < 9*40; i += 40) {
//            for (int j = 0; j < 9*40; j += 40) {
//                brJ++;
//                buttons[p][q] = new JButton();
//                if(brBombs < 9){
//                int a = generator.nextInt((8 - 0) + 0) + 1;
//                int b = generator.nextInt((8 - 0) + 0) + 1;
//                
//                System.out.println(a + " " + b);
//                }
//                int r = generator.nextInt((6 - 1) + 1) + 1;
////                JButton buttonMinesweeper = new JButton();
////                
////                if(br <= 10){
////                    int a = generator.nextInt((360 - 0) + 1) + 0;
////                    int b = generator.nextInt((360 - 0) + 1) + 0;
////                    
////                buttonMinesweeper.setBounds(a, b, 40, 40);
////                buttonMinesweeper.setBackground(Color.gray);
////                buttonMinesweeper.setText(69 + "");
////                buttonMinesweeper.setBorder(new LineBorder(Color.RED));
////                }
////                
////                buttonMinesweeper.setBounds(i, j, 40, 40);
////                buttonMinesweeper.setBackground(Color.gray);
//////                buttonMinesweeper.setText(i + "");
////                buttonMinesweeper.setBorder(new LineBorder(Color.BLACK));
////                panel.add(buttonMinesweeper);
////                br++;
//                
//                buttons[p][q].setBounds(i, j, 40, 40);
//                buttons[p][q].setBackground(Color.gray);
//                buttons[p][q].setForeground(Color.red);
//                buttons[p][q].setText(r + "");
//                buttons[p][q].setBorder(new LineBorder(Color.BLACK));
//                panel.add(buttons[p][q]);
//                if(brJ <= 8)
//                q++;
//                
//                
//                brBombs++;
//            }
//            p++;
//
//        }
//        frame.repaint();
//
//    }
//
//}







package minesweeperproject;

import java.awt.Color;
import java.awt.Dimension;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;

public class MinesweeperProject {

    private static int GAME_WIDTH = 376;
    private static int GAME_HEIGHT = 500;
    private static int ARRAY_W = 9;
    private static int ARRAY_L = 9;
    private static int NUM_OF_BOMBS = 15;

    public static void main(String[] args) {
        JButton[][] buttons = new JButton[ARRAY_W][ARRAY_L];
        Random generator = new Random();
        JFrame frame = new JFrame("Minesweeper");
        JPanel panel = new JPanel();

        frame.setSize(GAME_WIDTH, GAME_HEIGHT);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);
        frame.add(panel);
        int p = 0;
        int q = 0;
        int brJ = 0;
        int brBombs = 0;
       
        for (int i = 0; i < 15; i++) {
           
            int a = generator.nextInt((8 - 0) + 0) + 1;
            int b = generator.nextInt((8 - 0) + 0) + 1;
            System.out.println(a + " " + b);
            buttons[a][b] = new JButton();
            buttons[a][b].setBounds(a * 40, b * 40, 40, 40);
            buttons[a][b].setBackground(Color.gray);
            buttons[a][b].setForeground(Color.red);
            buttons[a][b].setBorder(new LineBorder(Color.BLACK));
            buttons[a][b].setText("X");
            panel.add(buttons[a][b]);
           
        }

        for (int i = 0; i < ARRAY_W * 40; i += 40) {
            for (int j = 0; j < ARRAY_L * 40; j += 40) {
                buttons[p][q] = new JButton();
                brJ++;
                int r = generator.nextInt((6 - 1) + 1) + 1;
               
               
                buttons[p][q].setBounds(i, j, 40, 40);
               
                buttons[p][q].setBackground(Color.gray);
                if(r == 1){
                    buttons[p][q].setForeground(Color.BLUE);
                    buttons[p][q].setText(r + "");
                }
               
                if(r == 2){
                    buttons[p][q].setForeground(Color.YELLOW);
                    buttons[p][q].setText(r + "");
                }
               
                if(r == 3){
                    buttons[p][q].setForeground(Color.PINK);
                    buttons[p][q].setText(r + "");
                }
               
                if(r == 4){
                    buttons[p][q].setForeground(Color.GREEN);
                    buttons[p][q].setText(r + "");
                }
               
                if(r == 5){
                    buttons[p][q].setForeground(Color.CYAN);
                    buttons[p][q].setText(r + "");
                }
               
                if(r == 6){
                    buttons[p][q].setForeground(Color.ORANGE);
                    buttons[p][q].setText(r + "");
                }
               
                buttons[p][q].setBorder(new LineBorder(Color.BLACK));
                panel.add(buttons[p][q]);
                if (brJ <= 8) {
                    q++;
                }

            }
            p++;

        }
        int br = 0;
        for (int i = 0; i < buttons.length; i++) {
           
            for (int j = 0; j < buttons.length; j++) {
                buttons[i][j] = new JButton();
                if(buttons[i][j].getText().equals("X")){
                    br++;
                }
            }
        }
        frame.repaint();
        System.out.println(br);
    }

}
