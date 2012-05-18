/*
 * Created on 12 sept. 2008
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package logogui;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;

import javax.swing.ImageIcon;

/**
 * @author Claude Moulin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Traceur {
	private static Traceur instance;
	private Graphics2D g2d;
	private double initx = 300, inity = 300;   // position initiale
	private double posx = initx, posy = inity; // position courante
	private int SIZE = 1000;
	private double angle = 90;
	private double teta;
	private boolean tracing;
	
	public Traceur() {
		setTeta();
		tracing = true;
	}

	/**
	 * @return Returns the instance.
	 */
	public static Traceur getInstance() {
		if (instance == null)
			instance = new Traceur();
		return instance;
	}

	public void setGraphics(Graphics g) {
		g2d = (Graphics2D) g;	
	}
	
	private int toInt(double a) {
		return (int) Math.round(a);
	}
	
	public void avance(double r) {
		double a = posx + r * Math.cos(teta) ;
		double b = posy - r * Math.sin(teta) ;
		int x1 = toInt(posx);
		int y1 = toInt(posy);
		int x2 = toInt(a);
		int y2 = toInt(b);
		
		if ( tracing )
			g2d.drawLine(x1,y1,x2,y2);
		
		posx = a;
		posy = b;
	}
	
	public void setTrace(boolean b) {
		tracing = b;
	}
	
	public void clean() {
		g2d.clearRect(0, 0, SIZE, SIZE);
	}

	public void td(double r) {
		angle = (angle - toInt(r)) % 360;
		setTeta();
	}
	
	public void tg(double r) {
		angle = (angle + toInt(r)) % 360;
		setTeta();
	}
	
	public void setPos(double x,double y)
	{
		posx = x;
		posy = y;
	}
	
	public void setColor(double m)
	{
		m = (int)m % 8;
		
		switch ( (int)m )
		{
			case 0: g2d.setColor( Color.BLACK ); break;
			case 1: g2d.setColor( Color.RED ); break;
			case 2: g2d.setColor( Color.GREEN ); break;
			case 3: g2d.setColor( Color.YELLOW ); break;
			case 4: g2d.setColor( Color.BLUE ); break;
			case 5: g2d.setColor( Color.MAGENTA ); break;
			case 6: g2d.setColor( Color.CYAN ); break;
			case 7: g2d.setColor( Color.WHITE ); break;
		}
	}
	
	public void setColor(double r, double g, double b)
	{
		if ( r > 255 ) r = 255;
		if ( g > 255 ) g = 255;
		if ( b > 255 ) b = 255;
		
		g2d.setColor( new Color((int)r,(int)g,(int)b) );
	}

	public void setTeta(double a) {
		teta = Math.toRadians(a);
		angle = a;
	}
	
	private void setTeta() {
		setTeta(angle);
	}
	
	public Double getTeta() {
		int a = (int) Math.toDegrees(teta);
		while ( a < 0 ) a+= 360;
		return new Double(a % 360);
	}
}
