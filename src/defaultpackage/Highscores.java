package defaultpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Highscores extends JFrame{
	
	private static final long serialVersionUID = 1L;
	JTextArea text;
	
	public Highscores(){
		
		super( Config.HighscoreWindowName );
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(Config.windowWidth,Config.windowHeight);
		
		text = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(text);
		scrollPane.setBounds(50,50,200,200);
		add(scrollPane);
		
			File file = new File("highscores.txt");
			try {
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(file);
				while (scanner.hasNextLine()){
					text.append(scanner.nextLine() + ":  " +  scanner.nextLine() + "\n");
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	

	
}
