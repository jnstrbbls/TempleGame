package tv.lksbrm.templegame.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

import tv.lksbrm.templegame.Main;

@SuppressWarnings("serial")
public class Frame extends JFrame implements ActionListener
{

	public JButton startButton;
	public JButton quitButton;
	int x_Pic;
	int direction;
	
	
	Timer time;
	public Icon start = new ImageIcon(getClass().getResource("StartButton.png"));
	public Icon quit = new ImageIcon(getClass().getResource("QuitButton.png"));
	public Icon starthover = new ImageIcon(getClass().getResource("StartHover.png"));
	public Icon quithover = new ImageIcon(getClass().getResource("QuitHover.png"));
	public ImageIcon background = new ImageIcon(getClass().getResource("BG00.png"));
	
	
	
   


    Frame frame;
/**	public void init()
	{
		frame = new Frame("TempleGame - Menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1650,1000);
		
		frame.setLayout(null);
		frame.setVisible(true);
		
	
	
	}*/
    

	public Frame(String title)
	{
		super(title);

	
		//Main.p.setTexture(main.playerIcon);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,700);
		
		
	
		setContentPane(new JLabel(background));
		
		pack();
		setVisible(true);
		setResizable(true);
	

	}
		



		


	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

}
