package tv.lksbrm.templegame.controls;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import tv.lksbrm.templegame.Main;

public class KeyManager extends KeyAdapter
{

	
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode() == KeyEvent.VK_D)
		{
			Main.p.texture = new ImageIcon(getClass().getResource("playerwalking1.png"));
			Main.p.updatePosition();
			Main.p.setX(Main.p.getX()+7);
			Main.p.updatePosition();
			Main.p.updatePosition();
			Main.p.setTexture(new ImageIcon(getClass().getResource("Playerstay.png")));

			Main.p.updatePosition();

		}
		if(e.getKeyCode() == KeyEvent.VK_A)
		{
			Main.p.setX(Main.p.getX()-7);
			Main.p.updatePosition();
		}
	}

		
}
