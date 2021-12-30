package pl.mkluzniak;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // JLayeredPane = Swing container that provides a third dimension for positioning components
        //                ex. depth, Z-index

        JLabel label1 = new JLabel(); //makeing labels with properties
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.blue);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.green);
        label3.setBounds(150, 150, 200, 200);

        JLayeredPane layeredPane = new JLayeredPane();//adding layered pane
        layeredPane.setBounds(0, 0, 500, 500);
        layeredPane.add(label1, Integer.valueOf(1));//adding labels into layered pane (window)
        layeredPane.add(label2, Integer.valueOf(3));//set for layer priority
        layeredPane.add(label3, JLayeredPane.DEFAULT_LAYER);//works the same like previous one

        JFrame frame = new JFrame();//adding frame with properties
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(null);
        frame.setVisible(true);


    }
}
