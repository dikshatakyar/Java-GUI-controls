 import java.awt.*;
import java.awt.event.*;
class colorchange extends Frame
{
	int count;
	Label l1;
	colorchange()
	{	setLayout(new FlowLayout());
		l1=new Label("Click to Change the Color.");
		add(l1);
		addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent we)
			{
				setVisible(false);
			}
				});
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me)
			{
				count++;
				if(count==7)
					count=1;
				repaint();
			}
		});	
	}


	public void paint(Graphics g)
	{
	if(count==1)
		setBackground(Color.pink);
	else if(count==2)
		setBackground(Color.green);
	else if(count==3)
		setBackground(Color.magenta);
	else if(count==4)
		setBackground(Color.orange);
	else if(count==5)
		setBackground(Color.yellow);
	else if(count==6)
		setBackground(Color.cyan);
	}
}
public class colorchanging {
	public static void main(String[] args) {
		
  colorchange c = new colorchange();
  c.setSize(400,400);
  c.setTitle("COLOR CHANGE");
  c.setVisible(true);
	}
}

