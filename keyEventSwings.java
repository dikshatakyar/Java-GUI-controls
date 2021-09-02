import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class keyP extends JPanel{
    String msg="Typed Character is : ";
    String msg1=" ";
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(msg, 100, 150);
        g.drawString(msg1, 100, 168);
    }
}

class keyF extends JFrame {
    keyP kp;
    keyF(){
        super("KeyEvent Swings");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        kp=new keyP();
        add(kp);
        addKeyListener(new keyadapt(kp));
        setVisible(true);
    }
    
}

class keyadapt extends KeyAdapter{
    int counter=0;
    keyP k1;
    keyadapt(keyP k2){
        k1=k2;
    }
    public void keyTyped(KeyEvent ke){
        ++counter;
        if(counter<=18){
            k1.msg+=ke.getKeyChar();
        }
        else{
            k1.msg1+=ke.getKeyChar();
        }
       
        k1.repaint();
    }
}

public class keyEventSwings {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new keyF();
            }
        });
    }
}
