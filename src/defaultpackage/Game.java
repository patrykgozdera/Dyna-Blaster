package defaultpackage;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;




public class Game extends Canvas{

	
	private static final long serialVersionUID = 1L;

	Game(){
		
	Dimension dimension = new Dimension(Config.windowWidth, Config.windowHeight);
	setPreferredSize(dimension);
	setMinimumSize(dimension);
	setMaximumSize(dimension);
	setBackground(Color.black);
	
		}
	
	
	public void render(){
		BufferStrategy bs = getBufferStrategy();
		if(bs == null){
			createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, Config.windowWidth, Config.windowHeight);
		g.dispose();
		bs.show();
	}
	
	public void read(){
		try {
			   FileReader fileReader = new FileReader("map.txt");
			   BufferedReader bufferReader = new BufferedReader(fileReader);
			   
			   String line;
			   
			   while((line = bufferReader.readLine()) != null) {
				   for (char c : line.toCharArray()){
					   if (c == '1'){
						
					   } else if(c == '0'){
						   
					   }
				   }
				   
			   }
			   fileReader.close();
			  }
			  catch (FileNotFoundException e) {
			   e.printStackTrace();
			  } 
			  catch (IOException e) {
			   e.printStackTrace();
			  }
	}
}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	