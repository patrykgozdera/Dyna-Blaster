package defaultpackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;




public class Game extends JFrame{

	
	private static final long serialVersionUID = 1L;
	private Plansza gameField;
	private JLabel infoLabel;
	private ArrayList<String> configData;
	Game()
	{
	
		Dimension dimension = new Dimension(Config.windowWidth, Config.windowHeight);
		setPreferredSize(dimension);
		//setMinimumSize(dimension);
		//setMaximumSize(dimension);
		setBackground(Color.black);
		gameField=new Plansza(2,2);
		this.setLayout(new BorderLayout());
		infoLabel=new JLabel("Tutaj beda informacje o grze");
		infoLabel.setPreferredSize(new Dimension(200,80));
		this.add(infoLabel, BorderLayout.NORTH);
		this.add(gameField);
		configData=new ArrayList<String>();
	
	
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
				  configData.add(line);
				   
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
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	