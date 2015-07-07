package tv.lksbrm.templegame;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class PlayerCanvas extends Canvas
{

	public ImageIcon ic = new ImageIcon(getClass().getResource("Playerstay.png"));
	public Image img = ic.getImage();
	public Player p = Main.p;
	public void paint(Graphics g)
	{
		g.drawImage(img, p.getX(), p.getY(), this);
	}
}
