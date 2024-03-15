import javax.swing.*;
import java.awt.*;

public class Field extends JFrame {

    JFrame frame;
    JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
    JButton[] functionsButtons = new JButton[9];
    JPanel panel;
    Field(){
        frame =new JFrame();
        frame.setSize(600,600);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(panel);
    }



}
