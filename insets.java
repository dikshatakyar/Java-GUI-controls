import java.awt.*;
import java.awt.event.*;

class myline extends Frame{
    int inc=25,max=500,min=200;
    Dimension d;
    myline(){
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent me){
                    int w,h;
                    d=getSize();
                    w=(d.width+inc)>max?min:d.width+inc;
                    h=(d.height+inc)>max?min:d.height+inc;
                    setSize(w,h);
            }
        });

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                setVisible(false);
            }
        });
    }

        public void paint(Graphics g){
            d=getSize();
            Insets i;
            i=getInsets();
            setForeground(Color.GREEN);
            setBackground(Color.black);
            g.drawLine(i.left,i.top,d.width-i.right,d.height-i.bottom);
            g.drawLine(i.left,d.height-i.bottom,d.width-i.right,i.top);
        }
    
}


public class insets {
    public static void main(String[] args) {
        myline l1=new myline();
        l1.setSize((new Dimension(300,200)));    
        l1.setTitle("Insets Sets");  
        l1.setVisible(true);
    }
  
}
