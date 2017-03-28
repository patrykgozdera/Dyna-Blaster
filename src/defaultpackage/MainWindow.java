package defaultpackage;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JButton new_game,rank,level,exit;
	
	public MainWindow() {
		super(Config.gameName);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(100,100);
		setLayout(new GridLayout(4, 1));
		new_game = new JButton(Config.newGame);
		new_game.addActionListener(this);
		add(new_game);
		rank = new JButton(Config.rank);
		rank.addActionListener(this);
		add(rank);
		level = new JButton(Config.level);
		level.addActionListener(this);
		add(level);
		exit = new JButton(Config.exit);
		exit.addActionListener(this);
		add(exit);
		pack();
		setSize(Config.windowWidth,Config.windowHeight);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == new_game){
			new NickWindow().setVisible(true);
			dispose();
		}else if(source == rank){
			new Highscores().setVisible(true);
			dispose();
		}else if(source == level){
			new LevelWindow().setVisible(true);
			dispose();
		}else if(source == exit){
			dispose();
		}
		
	}

}




