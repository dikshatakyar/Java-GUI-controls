/* Using Swing, write a program to create one label and three button labeled with "Clock","Flower","Fruit". When a button is pressed, an image representing the label of button should be displayed in a label.*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class iconInButton {
	
JLabel jlab;
iconInButton(){
	

JFrame jfrm=new JFrame("labels and buttons");
jfrm.setLayout(new FlowLayout());
jfrm.setSize(400,400);
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

ImageIcon i1=new ImageIcon("C:\\Users\\dikshaa\\OneDrive\\Desktop\\Java\\resilient.png");
ImageIcon i2=new ImageIcon("C:\\Users\\dikshaa\\OneDrive\\Desktop\\Java\\wallpaper.jfif");
ImageIcon i3=new ImageIcon("C:\\Users\\dikshaa\\OneDrive\\Desktop\\Java\\imagebg.gif");
JButton b1=new JButton("clock");
JButton b2=new JButton("flower");
JButton b3=new JButton("fruit");
 JLabel jlab=new JLabel();
jfrm.add(b1);
jfrm.add(b2);
jfrm.add(b3);
jfrm.add(jlab);


b1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent ae) {
		jlab.setIcon(i1);
	}
});
b2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent ae) {
		jlab.setIcon(i2);
	}
});
b3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent ae) {
		jlab.setIcon(i3);
	}
});
jfrm.setVisible(true);
}

	public static void main(String[] args) {
	
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
			new iconInButton();
			}
			});
	}
	}
