import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class WalkingMan extends JComponent
{
	private Ellipse2D head;
	private Rectangle body;
	private Rectangle leftLeg;
	private Rectangle rightLeg;
	private Rectangle leftArm;
	private Rectangle rightArm;
	private int dy = 0;
	private int dx = 0;
	
	public WalkingMan(int x, int y)
	{
		setBounds(x,y,31,56);
		head = new Ellipse2D.Double(11,0,10,10);
		body = new Rectangle(13,10,7,20);
		leftLeg = new Rectangle(10,30,5,20);
		rightLeg = new Rectangle(17,30,5,20);
		leftArm = new Rectangle(7,11,5,15);
		rightArm = new Rectangle(20,11,5,15);
		
	}
	

	public void paint(Graphics g) 
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLUE);
		g2.fill(body);
		g2.fill(leftArm);
		g2.fill(rightArm);
		
		g2.setColor(Color.BLACK);
		g2.fill(leftLeg);
		g2.fill(rightLeg);
		
		g2.setColor(Color.LIGHT_GRAY);
		g2.fill(head);
		
		g2.draw(head);
		g2.draw(body);
		g2.draw(leftLeg);
		g2.draw(leftArm);
		g2.draw(rightLeg);
		g2.draw(rightArm);
		
		
	}
	
	public void update() 
	{
		setLocation(getX() + dx, getY() + dy);
	}
	
	public int getDX() 
	{
		return dx;
	}
	public int getDY() 
	{
		return dx;
	}
	public void setDX(int x) 
	{
		dx = x;
	}
	public void setDY(int y)
	{
		dy = y;
	}
}
