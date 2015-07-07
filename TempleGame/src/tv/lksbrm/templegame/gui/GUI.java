package tv.lksbrm.templegame.gui;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUI 
{




	 @SuppressWarnings("serial")
	public class Board extends JPanel implements ActionListener {

	 Timer time;
	 Image img;
	 
	 //EInmal welche Taste 
	 int key,links;
	 //Aktuelle X Position des Bildes !
	 int x_bild;

		public Board() { 

			x_bild = 0;

			setFocusable(true);
			ImageIcon u = new ImageIcon(getClass().getResource("BG00.png"));
			img = u.getImage();
			
			
			//Ruft unseren KeyListener in privater Classe auf !
			addKeyListener(new AL());
			
			//Macht und starten unseren TImer
			time = new Timer(5,this);
			time.start();
	}

	 // Alle 5 millisekunden Timer Interval
		public void actionPerformed(ActionEvent e){
			bewegen();
			repaint();
		}

		public void paint (Graphics g){
			
			super.paint(g);
			Graphics2D g2d = (Graphics2D) g;

	//Bild wird an aktueller Position des "x" gezeichnet
			g2d.drawImage(img,x_bild,0,null);
	}
		
		// Der KeyListener registiert Klicks um das Bild zu bewegen
		public class AL extends KeyAdapter{
			
			 public AL() {
				
				//Nichts...warum auch?!  
				 
			 }
			  
			  //Taste gedrückt
}
		//Rechnung zur aktuellen Position des Bildes !
		public void bewegen(){
			x_bild += links;
		}
		
		
		
	 }
}
		
		



