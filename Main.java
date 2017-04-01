package defaultpackage;

import java.io.IOException;
import java.util.Properties;
/**
 * Dyna Blaster
 * <p>
 * Celem gry jest niszczenie obiekt�w poruszaj�cych si� na planszy i odnajdowanie przej�� do kolejnych poziom�w. 
 * <p>
 * Plansza gry przedstawia labirynt z przeszkodami, po kt�rym porusza si� bohater gry (Bomber) oraz pr�buj�ce go zniszczy� potwory. 
 * Bomber oczyszcza przej�cia za pomoc� bomb. Wybuchaj�ca bomba mo�e zniszczy� obiekty w pewnym otoczeniu � potwory, przeszkody, a tak�e samego Bombera. 
 * Niekt�re obiekty, np. �ciany labiryntu, s� niezniszczalne, zatrzymuj� r�wnie� fal� uderzeniow�. 
 * Zadaniem Bombera jest odnalezienie, pocz�tkowo ukrytego, np. pod jedn� z przeszk�d, przej�cia do kolejnego poziomu.
 * <p>
 * Gra sk�ada si� z poziom�w � plansz, przedstawiaj�cych r�ne uk�ady labiryntu, przeszk�d i potwor�w. 
 * Przej�cie na kolejny poziom nast�puje po pomy�lnym uko�czeniu aktualnego. Gracz ma ograniczon� liczb� "�y�".
 * 
 * @author Patryk Gozdera
 * @author Maciej Kobierecki
 * @version 1.0
 */
public class Main {
	public static void main(String[] args) {
		/*EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {*/
		/**
		 * Wczytywanie danych z pliku konfiguracyjnego
		 * i u�ycie ich w programie.
		 * Tworzenie okna g��wnego.
		 */
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

