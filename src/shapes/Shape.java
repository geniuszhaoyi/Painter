package shapes;
import java.awt.Graphics;
import java.awt.event.MouseListener;


public interface Shape{
	public abstract void paint(Graphics g);
	public static abstract class myMouseListener implements MouseListener {};


}
