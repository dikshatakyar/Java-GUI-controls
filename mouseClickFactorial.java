import java.awt.*;
import java.awt.event.*;

class mousefact extends Frame{
    int x,y,i=0;
    String str;

    mousefact(){
        setTitle("Factorial on Mouse Cick");
        setSize(new Dimension(400,400));
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent me){
                ++i;
                x=me.getX();
                y=me.getY();
                fact(i);     
                repaint();
            }
        });

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                setVisible(false);
            }
        });

    }

         String fact(int m){
            int ans=1;
            for(int j=m;j>=1;--j){
                ans*=j;
            }
             str="Factorial is : "+ans;

             return str;
        }

        public void paint(Graphics g){
            g.drawString(str, x, y);
        }
}

public class mouseClickFactorial {
    
    public static void main(String[] args) {
        mousefact mf=new mousefact();
        mf.setVisible(true);
    }
}
