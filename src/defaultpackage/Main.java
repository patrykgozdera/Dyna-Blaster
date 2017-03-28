package defaultpackage;

import java.io.IOException;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {
		/*EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {*/
				String configPath = "config.properties";
				ReadConfig readConfig = new ReadConfig();
				try{
				Properties prop = readConfig.getProperties(configPath);
                Config.readConstants(prop);
				
				new MainWindow();
				} catch (IOException e) {
		            System.out.println(e);
		        }
		}
	}

