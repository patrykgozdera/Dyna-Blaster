package defaultpackage;


import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class LevelWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel n;
	private JButton easy, normal, hard;
	public LevelWindow(){
		super( Config.levelWindowName );
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(Config.windowWidth,Config.windowHeight);
		setLocation(10,10);
		//setLayout(new BorderLayout());
		setLayout(new GridLayout(4,1));
		//setLayout(null);
		
		n = new JLabel("Wybierz poziom trudnoœci:");
		add(n);
		
		easy = new JButton(Config.level1);
		add(easy);
		normal = new JButton(Config.level2);
		add(normal);
		hard = new JButton(Config.level3);
		add(hard);
		
	}
	
	
}

