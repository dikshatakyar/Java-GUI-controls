import java.awt.*;
import java.awt.event.*;


class keys extends Frame  {
int ans;
int msg;
String st1;
    keys(){
        setSize(400,400);
        setTitle("Key press");
        addKeyListener(new KeyAdapter(){
                public void keyPressed(KeyEvent ke){
                    ans=ke.getKeyCode();
                    msg=ke.getKeyChar();
              st1="Key pressed is : "+ans;
          }         
        });


        

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                setVisible(false);
            }
        });
    }

    public void paint(Graphics g){
        g.drawString(st1,100,120);
      
    }
   
}

public class keypress {
    public static void main(String[] args) {
        keys k1=new keys();
        k1.setVisible(true);      
    }
  
    
}
