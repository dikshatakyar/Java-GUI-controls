 /* Using Swing, write a program to create three buttons “Factorial”, "Fibonnaci series" and “GCD". When a button is pressed the output should be displayed depending on button’s label. Use maximum two textbox for input of numbers. */

 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;


 class Jmsg extends JPanel{
     String msg=" ";
     public void paintComponent(Graphics g){
         super.paintComponent(g);
         g.drawString(msg,150,200);

     }
 }

 class Jcalc extends JFrame implements ActionListener{
        JButton b1,b2,b3;
        JLabel l1;
        JTextField t1,t2;
        Jmsg jm;

        Jcalc(){
            setTitle("Factorial,Fibonacci,GCD");
            setSize(new Dimension(400,400));
            l1=new JLabel("Enter the numbers");
            t1=new JTextField(12);
            t2=new JTextField(12);
            b1=new JButton("Factorial");
            b2=new JButton("Fibonacci");
            b3=new JButton("GCD");
            jm=new Jmsg();
            jm.setLayout(new FlowLayout());
          
            jm.add(l1);
            jm.add(t1);
            jm.add(t2);
            jm.add(b1);
            jm.add(b2);
            jm.add(b3);
            add(jm);
            
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }

        public void actionPerformed(ActionEvent ae){
            String s=ae.getActionCommand();
            if(s.equals("Factorial")){
                String str=t1.getText();
                int c,ans=1;
                c=Integer.parseInt(str);
                for(int i=1;i<=c;++i){
                    ans*=i;
                }
                jm.msg=c+"! = "+ans;

                jm.repaint();
            }
            if(s.equals("Fibonacci")){
                String str=t1.getText();
                int n,a=0,b=1,c;
                n=Integer.parseInt(str);
                jm.msg=a+" "+b;
                for(int i=2;i<=n;++i){
                    c=a+b;
                    a=b;
                    b=c;
                    jm.msg+=" "+c+" ";
                }

                jm.repaint();
            }


            if(s.equals("GCD")){
                String s1=t1.getText();
                String s2=t2.getText();
                int x,y;
                x=Integer.parseInt(s1);
                y=Integer.parseInt(s2);
                int hcf=1;
                if(x>y){
                              for(int i=2;i<=y;++i){
                      if(x%i==0 && y%i==0) {
                          hcf=i;
                      }
                    }
                }
                else{
                    for(int i=2;i<=x;++i) {
                        if(x%i==0 && y%i==0) {
                            hcf=i;
                        }
                    }
                }
                jm.msg=" HCF is : "+hcf;


                jm.repaint();
            }
        }
 }


public class factFibonaccciGcd {
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Jcalc();
            }
        });
    }
    
}
