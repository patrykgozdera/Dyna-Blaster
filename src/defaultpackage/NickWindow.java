package defaultpackage;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class NickWindow extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JLabel n;
	private JTextField field;
	private JButton ok, cancel;
	
	public NickWindow(){
		super( Config.NickWindowName );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(Config.windowWidth,Config.windowHeight);
		setLocation(10,10);
		setLayout(new GridLayout(4,1));
		
		n = new JLabel("Wpisz swój nick:");
		n.setPreferredSize(new Dimension(100, 100));
		n.setBounds(100, 10, 500, 100);
		add(n);
		
		field = new JTextField("");
		field.setBounds(150, 10, 500, 100);
		field.setEditable(true);
		field.setVisible(true);
		add(field);
		
		ok = new JButton(Config.OkButton);
		ok.setBounds(10, 100, 250, 100);
		ok.addActionListener(this);
		add(ok);
		cancel = new JButton(Config.Cancelbutton);
		cancel.addActionListener(this);
		cancel.setBounds(270, 100, 250, 100);
		add(cancel);
		pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == cancel){
			dispose();
			new MainWindow().setVisible(true);
		}else if(source == ok){
			Game game = new Game();
			game.setVisible(true);
			game.read();
			//JFrame frame = new JFrame();
			game.setTitle(Config.gameName + " - ROZGRYWKA");
			//frame.add(game);
			game.pack();
			game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			game.setLocationRelativeTo(null);
			game.setVisible(true);
			dispose();
		}
		
	}
}

