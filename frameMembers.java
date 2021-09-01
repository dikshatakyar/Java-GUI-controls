import java.awt.*;
import java.awt.event.*;

class Fcolor extends Frame {
String msg="Frame Members";
Fcolor(){
    setSize(400,450);
    setTitle("My Colorful Frame");
    addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
            setVisible(false);
        }
    });
    setBackground(Color.yellow);
    setForeground(Color.red);
}

public void paint(Graphics g){
    g.drawString(msg,100,100);
}
}

public class frameMembers {
    public static void main(String[] args) {
        Fcolor c1=new Fcolor();
        c1.setVisible(true);
    }
}
