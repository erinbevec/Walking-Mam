import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class WalkingManMain extends JFrame implements ActionListener
{

	public WalkingManMain()
	{
		this.setTitle("Walking Man Game");
		this.setLayout(null);
		this.setBounds(100,100,600,600);
		WalkingMan man = new WalkingMan(10,10);
		this.add(man);
		
		Timer t = new Timer(100,(ActionListener) this);
		t.start();
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.addKeyListener(new KeyListener() 
		{
			public void keyPressed(KeyEvent p)
			{
				if(p.getKeyCode() == KeyEvent.VK_UP) 
					man.setLocation(man.getX(),man.getY() - 3);
				
				if(p.getKeyCode() == KeyEvent.VK_DOWN) 
					man.setLocation(man.getX(),man.getY() + 3);
				
				if(p.getKeyCode() == KeyEvent.VK_LEFT) 
					man.setLocation(man.getX() - 3, man.getY());
				
				if(p.getKeyCode() == KeyEvent.VK_RIGHT) 
					man.setLocation(man.getX() + 3, man.getY());
				
			}

			public void keyReleased(KeyEvent e) 
			{
				
			}

			public void keyTyped(KeyEvent e)
			{
				
			}
		});
	}
	
	public static void main(String[] args)
	{
		new WalkingManMain();
	}

	@Override
	public void actionPerformed(ActionEvent man) 
	{
		update();
		repaint();
		
	}

}
