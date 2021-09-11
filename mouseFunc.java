/* Write a program to create a frame using AWT. Implement mouseClicked(),mouseEntered() and mouseExited() events such that:a) Size of the frame should be doubled of its current size when mouse enters it and background color should be changed to blue.b) Frame should reduce to half of its current size when mouse is clicked in it and background color changed to cyan.c) display the message "thank you" when mouse exits it. */


import java.awt.*;
import java.awt.event.*;


class Fmouse extends Frame  {

    String msg=" ";
    Dimension d;
    Fmouse()
    {
        setTitle("Mouse Event");
        setSize(new Dimension(400,400));
       
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                setVisible(false);
            }
        });
    


        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent ae) { 
                d=getSize();
                msg="Mouse Clicked";
              setSize(d.width/2,d.height/2);
              setBackground(Color.cyan);
              repaint();
          }
          public void mouseEntered(MouseEvent ae)
          {
            d=getSize();
              msg="Mouse Entered";
              setSize(d.width*2,d.height*2);
              setBackground(Color.BLUE);
              repaint();
          }

          public void mouseExited(MouseEvent ae)
          {
              msg="Thank You";
              repaint();
      
          }


        });
    }
  
    public void paint(Graphics g)
    {
        g.drawString(msg, 150, 100);
    }
}
public class mouseFunc {

    public static void main(String args[]) {

        Fmouse f1=new Fmouse();
        f1.setVisible(true);
    }
}