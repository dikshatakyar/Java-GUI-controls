import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


class framexy extends JFrame implements ActionListener
{
	JTextField t1,t2;
	JButton b1;
	JLabel l1,l2;
	FileInputStream f1;
	framexy()
	{
		super("Reading file");
	
		t2=new JTextField(30);
		b1=new JButton("Display the text !")
		setLayout(new FlowLayout());		
		add(b1);
		add(t2);
		b1.addActionListener(this); 
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		int x=0;
		String msg=" ";
		try
		{
			f1=new FileInputStream("A4.txt");
            do
            {
            	x=f1.read();
            	if(x!=-1)
            	{
            
                    msg+=(char)x;	
            	}
            }while(x!=-1);
            t2.setText(msg);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File can't be opened");
		}
		catch(IOException e)
		{
			System.out.println("File can't be read");
		}
	}
}
public class filetoWindow {

	public static void main(String[] args) {

SwingUtilities.invokeLater(new Runnable() {
	public void run()
	{
		new framexy();
	}
});
	}

}
