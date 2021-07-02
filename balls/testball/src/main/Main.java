package src.main;

import java.awt.*;
import javax.swing.*;
import src.render.*;

public class Main {

    public static void main(String[] args) {
        /* Calling Constructor */
        new Main();
    }

    public Main() {
        /* https://stackoverflow.com/questions/6567870/what-does-swingutilities-invokelater-do */
        EventQueue.invokeLater(new Runnable() {  
        /* Runnable with anonymous class*/
            @Override
            public void run() {
                try 
                {
                    UIManager.setLookAndFeel(
                            UIManager.getSystemLookAndFeelClassName());
                    /* https://docs.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html */
                } 
                catch (Exception ex) {
                    ex.printStackTrace();
                }

                JFrame frame = new JFrame("BALLS");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                Balls balls = new Balls();
                frame.add(balls);
                frame.setSize(400, 400);
                frame.setVisible(true);
                frame.setResizable(false);

                new Thread(new BounceEngine(balls)).start();

            }
        });
    }
}



