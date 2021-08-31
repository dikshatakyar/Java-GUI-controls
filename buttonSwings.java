import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class buttonF extends JFrame {
    JButton b1,b2;
    buttonF(){
        super("Swings Button");
        b1=new JButton("Red");
        b2=new JButton("Blue");
        setSize(new Dimension(400,400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                        getContentPane().setBackground(Color.RED);
            }
        } );
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                getContentPane().setBackground(Color.blue);
            }
        });
        setVisible(true);
    }
}
public class buttonSwings {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new buttonF();
            }
        });
    }
    
}
