/**
 * 
 */
package defaultpackage;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JComponent;

import java.awt.Color;
import javafx.scene.image.*;




/**
 * @author Maciek
 *
 */
public abstract class Obiekt {
	protected int  width, height;
	private double normalizedX, normalizedY;
	static int licznik=0;
	Plansza plansza;
	
	public Obiekt(Plansza plansza,double x, double y)
	{
		this.normalizedX=x;
		this.normalizedY=y;
		this.plansza=plansza;
		width=0;
		height=0;
		
		
	}
	
	public void setNormalizedX(double x) { normalizedX=x; }
	public void setNormalizedY(double y) { normalizedY=y; }
	public double getNormalizedX() { return normalizedX; }
	public double getNormalizedY() { return normalizedY; }
	
	
	


	
	
	
	
}
