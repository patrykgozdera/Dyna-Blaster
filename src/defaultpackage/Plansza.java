package defaultpackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JPanel;


public class Plansza extends JPanel {

	
	private Image dbImage;
	private Graphics dbg;
	private int rows;
	private int columns;
	private Point[][] koordynaty;
	Player player;
    ArrayList<Floor> FloorList;
    
    public Plansza(int xrows, int xcol)
    {	
    	super();
    	rows=xrows;
    	columns=xcol;
       	this.setPreferredSize(new Dimension(300,300));
       	player= new Player(this,0.35,0.3, 15,15);
       	FloorList=new ArrayList<Floor>();
       	

    }
    public void wypelnijTabliceKoordynatow()
    {
    	Dimension dim= getSize();
    	koordynaty=new Point[rows][columns];
    	for(int i=0; i<rows;i++)
    		for(int j=0; j<columns; j++)
    		{
    			koordynaty[j][i]=new Point(i*(int)dim.getWidth()/(int)rows,j*(int)dim.getHeight()/(int)columns);
 
    		}
    	
    }
    
    public int getAmountOfRows() { return rows; }
    public int getAmountOfColumns() { return columns; }
    
    
    
    public void paintComponent(Graphics g)
    {
    	super.paintComponent(g);
    	g.setColor(Color.BLACK);
    	g.fillRect(0, 0, getWidth(), getHeight());
    	player.draw(g);
    	System.out.println("paintComponent plansza");
    	
    	
    	
    }
	public void createGrid(int rows, int columns) 
	{
		Floor.setDimension(this.getSize().width/columns, this.getSize().height/rows);
		for(int i=0; i<rows; i++)
			for(int j=0; j<columns; j++)
			{
				FloorList.add(new Floor(this, i*1.0/rows, j*1.0/columns, Color.WHITE));
			}
		this.repaint();
	}
	
	
    
    
    
	
}
