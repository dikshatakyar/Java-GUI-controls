import java.awt.*;
import java.awt.event.*;


class user extends Frame implements ActionListener{
    Button b1;
    TextField t1,t2;
    Label l1,l2;
    String msg;
    user(){
        setTitle("My new Frame");
        setSize(new Dimension(400,400));
         l1=new Label("UserId :");
         t1=new TextField(40);
         l2=new Label("Password :");
         t2=new TextField(35);
         t2.setEchoChar('*');
         b1=new Button("Submit");
         setLayout(new FlowLayout());
         add(l1);
         add(t1);
         add(l2);
         add(t2);
         add(b1);
         addWindowListener(new WindowAdapter(){
             public void windowClosing(WindowEvent we){
                 setVisible(false);
             }
         });
         b1.addActionListener(this);
         t2.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae){
        String s1=t1.getText();
        String s2=t2.getText();
        if(s1.equals("Nancy")&&s2.equals("20.07.2002")){
            msg="Your details have been submitted  successfully!";
            repaint();
        }
        else{
            msg="Invalid credentials";
            repaint();
        }
    }

    public void paint(Graphics g){
        g.drawString(msg,90,150);
    }
}

public class login {

    public static void main(String[] args) {
        user u1=new user();
        u1.setVisible(true);
    }
    
}
