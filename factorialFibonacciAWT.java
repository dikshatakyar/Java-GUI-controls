import  java.awt.*;
import java.awt.event.*;

class factawt extends Frame{
    Label l1;
    Button b1,b2;
    TextField t1;
    String st;
    factawt(){
        setSize(new Dimension(400,400));
        setTitle("Factorial/Fibonacci Calculator");
        setLayout(new FlowLayout());
        l1=new Label("Enter the number : ");
        t1=new TextField(30);
        b1=new Button("Factorial");
        b2=new Button("Fibonacci");
        add(l1);
        add(t1);
        add(b1);
        add(b2);
        setBackground(Color.black);
        setForeground(Color.MAGENTA);
      
       b1.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ae){
            int msg=1;
                String str=ae.getActionCommand();
                String num=t1.getText();
                int n=Integer.parseInt(num);
                if(str.equals("Factorial")){
                    for(int i=1;i<=n;++i){
                        msg=msg*i;
                    }
                   
                }
                st= n+"! = "+msg;
                repaint();
           }
       });

       b2.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ae){
               String s=ae.getActionCommand();
              
               String num=t1.getText();
               int n=Integer.parseInt(num);
               int a=0,b=1,c;
             
               if(s.equals("Fibonacci")){
                   st=a+" "+b;
                   for(int i=3;i<=n;++i){
                       c=a+b;
                       a=b;
                       b=c;
                     st +=" "+c+" ";
                   }
                 }
                 repaint();

           }
       });

       addWindowListener(new WindowAdapter(){
           public void windowClosing(WindowEvent we){
               setVisible(false);
           }
       });

    //    addKeyListener(new KeyAdapter(){
    //        public void keyPressed(KeyEvent ke){
    //            if(ke.getKeyCode()==KeyEvent.VK_ENTER){
    //            }
    //        }
    //    });

      
    }

       public void paint(Graphics g){
           g.drawString(st,100,200);
      
       }
    
    
}
public class factorialFibonacciAWT {

    public static void main(String args[]){
                factawt f1=new factawt();
                f1.setVisible(true);
            }

    
}
