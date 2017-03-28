package defaultpackage;

import java.util.Properties;

public class Config {

    public static String gameName;
    public static String newGame;
    public static String rank;
    public static String level;
    public static String exit;
    public static int windowWidth;
    public static int windowHeight;
    public static String levelWindowName;
    public static String level1;
    public static String level2;
    public static String level3;
    public static String HighscoreWindowName;
    public static String NickWindowName;
    public static String OkButton;
    public static String Cancelbutton;
  

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

