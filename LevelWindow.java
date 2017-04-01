package defaultpackage;


import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Klasa okna wyboru poziomu trudno�ci.
 * 
 * @author Patryk Gozdera
 * @author Maciej Kobierecki
 *
 */
public class LevelWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Deklaracja etykiety, kt�ra wy�wietla komunikat o wyborze poziomu trudno�ci.
	 */
	private JLabel n;
	
	/**
	 * Deklaracja przycisk�w, u�ytych w oknie.
	 */
	private JButton easy, normal, hard;
	
	/**
	 * Konstruktor klasy okna wyboru nicku'u.
	 * <p>
	 * Ustala jego parametry i umo�liwia wyb�r poziomu trudno�ci (spo�r�d trzech).
	 */
	public LevelWindow(){
		super( Config.levelWindowName );
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				int x = JOptionPane.showConfirmDialog(null, "Czy na pewno chcesz wr�ci�?","", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if(x == JOptionPane.YES_OPTION){
					e.getWindow().dispose();
					new MainWindow();
				}
			}
		});
		setSize(Config.windowWidth,Config.windowHeight);
		setLocation(10,10);
		//setLayout(new BorderLayout());
		setLayout(new GridLayout(4,1));
		//setLayout(null);
		
		n = new JLabel("Wybierz poziom trudno�ci:");
		add(n);
		
		easy = new JButton(Config.level1);
		add(easy);
		normal = new JButton(Config.level2);
		add(normal);
		hard = new JButton(Config.level3);
		add(hard);
		
	}
	
	
}

