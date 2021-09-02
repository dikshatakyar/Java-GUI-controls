import java.awt.*;
import java.awt.event.*;

class keyevent extends Frame {
    String msg="Typed Character is : ";
    keyevent(){
        addKeyListener(new keyAdapter(this));
        addWindowListener(new mywinAdapter(this));
        setBackground(Color.PINK);
        setForeground(Color.RED);
    }

    public void paint(Graphics g){
        g.drawString(msg, 100, 200);
    }

}

class keyAdapter extends KeyAdapter{
    keyevent k1;
    keyAdapter(keyevent k2){
        k1=k2;
    }
    public void keyTyped(KeyEvent ke){
            k1.msg+=ke.getKeyChar();
            k1.repaint();
    }
  
}
class mywinAdapter extends WindowAdapter{
      keyevent k1;
      mywinAdapter(keyevent k2){
        k1=k2;
      }

      public void windowClosing(WindowEvent we){
          k1.setVisible(false);
      }
}
public class keyboardEvent {
    public static void main(String[] args) {
        keyevent o1=new keyevent();
        o1.setTitle("DisplayTypedChar");
        o1.setSize( new Dimension(700,400));
        o1.setVisible(true);
    }
    
}
