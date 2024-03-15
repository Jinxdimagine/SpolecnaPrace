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

    private void addbuttons(){
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        functionsButtons[0] = button1;
        functionsButtons[1] = button2;
        functionsButtons[2] = button3;
        functionsButtons[3] = button4;
        functionsButtons[4] = button5;
        functionsButtons[5] = button6;
        functionsButtons[6] = button7;
        functionsButtons[7] = button8;
        functionsButtons[8] = button9;
    }

    private void addPanel(){
        panel = new JPanel();
        panel.setBounds(0,0,600,600);
        panel.setLayout(new GridLayout(3,3,0,0));
        for(JButton fuctionsButtons :functionsButtons){
            panel.add(fuctionsButtons);
        }
    }

}
