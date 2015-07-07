package tv.lksbrm.templegame.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class GameStateManager 
{

	File f;
	
	public void save()
	{
	
			String path = "C:/TempleGame/Save/";
			String filename = "save.tgs";
			File file = new File(path + filename);
            
			try{
				FileOutputStream out = new FileOutputStream("C:/TempleGame/Save/save.tgs");
			    ObjectOutputStream objOut = new ObjectOutputStream(out);
			    objOut.writeBytes("Rang: ");
			    objOut.writeBytes("\nLevel: ");
			    objOut.writeBytes("\nCoins: ");
			}catch(Exception e)
			{
				
			}
			

	}
	
}
