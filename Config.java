package defaultpackage;

import java.util.Properties;

/**
 * Klasa zawieraj�ca r�nego typu sta�e, w�a�ciwe dla ich wykorzystania w programie.
 * S� one udost�pniane dla wszystkich komponent�w programu.
 * 
 * @author Patryk Gozdera
 * @author Maciej Kobierecki
 *
 */
public class Config {

	/**
	 * Nazwa gry.
	 */
    public static String gameName;
    
    /**
	 * Przycisk nowej gry.
	 */
    public static String newGame;
    
    /**
	 * Przycisk listy najlepszych wynik�w.
	 */
    public static String rank;
    
    /**
	 * Przycisk poziom�w trudno�ci.
	 */
    public static String level;
    
    /**
	 * Przycisk wyj�cia z gry.
	 */
    public static String exit;
    
    /**
	 * Szeroko�� okna.
	 */
    public static int windowWidth;
    
    /**
	 * Wysoko�� okna.
	 */
    public static int windowHeight;
    
    /**
	 * Nazwa okna wyboru poziomu.
	 */
    public static String levelWindowName;
    
    /**
	 * Poziom �atwy.
	 */
    public static String level1;
    
    /**
	 * Poziom �redni.
	 */
    public static String level2;
    
    /**
	 * Poziom trudny.
	 */
    public static String level3;
    
    /**
	 * Nazwa okna najlepszych wynik�w.
	 */
    public static String HighscoreWindowName;
    
    /**
	 * Nazwa okna wybotu nick;u.
	 */
    public static String NickWindowName;
    
    /**
	 * Przycisk OK.
	 */
    public static String OkButton;
    
    /**
	 * Przycik Anuluj.
	 */
    public static String Cancelbutton;
  
    /**
     * Metoda parsuj�ca dane konfiguracyjne.
     * @param config obiekt Properties, w kt�rym znajduj� si� dane konfiguracyjne.
     */
    public static void readConstants(Properties config) {

        gameName = config.getProperty("gameName");
        windowWidth = Integer.parseInt(config.getProperty("windowWidth"));
        windowHeight = Integer.parseInt(config.getProperty("windowHeight"));
        newGame = config.getProperty("newGame");
        rank = config.getProperty("rank");
        level = config.getProperty("level");
        exit = config.getProperty("exit");
        levelWindowName = config.getProperty("levelWindowName");
        level1 = config.getProperty("level1");
        level2 = config.getProperty("level2");
        level3 = config.getProperty("level3");
        HighscoreWindowName = config.getProperty("HighscoreWindowName");
        NickWindowName = config.getProperty("NickWindowName");
        OkButton = config.getProperty("OkButton");
        Cancelbutton = config.getProperty("CancelButton");
          
    }


    


}

