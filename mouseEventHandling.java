import java.awt.*;
import java.awt.event.*;

class myFrame extends Frame implements MouseListener,WindowListener{
     String msg="Welcome";
     Dimension d;
    myFrame(String s){
        super(s);
         addMouseListener(this); //register
         addWindowListener(this);
         setSize(200,200);
         d=getSize();
         setBackground(Color.black);
         setForeground(Color.MAGENTA);
    }
    public void windowClosed(WindowEvent we){

    }
  
    public void windowClosing(WindowEvent we){
        setVisible(false);
      
    }
    public void windowDeactivated(WindowEvent we){

    }
    public void windowActivated(WindowEvent we){

    }

    public void windowIconified(WindowEvent we){

    }
    
    public void windowDeinconified(WindowEvent we){

    }
    public void windowOpened(WindowEvent we){
        
    }
    public void mouseClicked(MouseEvent me) {
        msg="Mouse Clicked";
        setSize(d);
          repaint();
    }
   public void mouseEntered(MouseEvent me){
        msg="Mouse Entered";
       setSize(d.width*3,d.height*3);
        repaint();
    }
    public void mouseReleased(MouseEvent me){
        msg="Mouse Released";
        repaint();
    }

    public void mouseExited(MouseEvent me){
        msg="Mouse Exited";
        repaint();
        setVisible(false); //to close window when the mouse exit
    }

    public void mousePressed(MouseEvent me){
        msg="Mouse Pressed";
        repaint();
    }

   public void paint(Graphics g){
       g.drawString(msg, 100, 150);
   }


}
public class mouseEventHandling {
    public static void main(String[] args) {
        myFrame f1=new myFrame("TestingMouseHandling");
        // f1.setSize(300, 350); //size of window
        f1.setVisible(true); //shows or hide window
    }
    
}
