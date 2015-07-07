package tv.lksbrm.templegame;

import javax.swing.ImageIcon;

import tv.lksbrm.templegame.controls.KeyManager;
import tv.lksbrm.templegame.gui.Frame;

public class Main
{

	static String name;


	public KeyManager km = new KeyManager();
	public ImageIcon playerIcon = new ImageIcon(getClass().getResource("Playerstay.png"));
	public static Player p = new Player(name, 0, 50, 1, 0);
	public static Frame frame = p.mainframe;
	public static PlayerCanvas PLAYER = Player.pc;

	
	


	
	public static void main(String[] args)
	{
		
		Main.frame.addKeyListener(new KeyManager());
		p.setX(5);
		p.setY(67);
		p.updatePosition();

		


	  

	}
}
