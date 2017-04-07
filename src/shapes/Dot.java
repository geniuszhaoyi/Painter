package shapes;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.List;

import main.acMouseListener;
import main.myJPanel;

public class Dot implements Shape {
	int x, y;
	int r;
	public Dot(String line){
		String parts[]=line.split(" ");
		x=Integer.valueOf(parts[0]);
		y=Integer.valueOf(parts[1]);
		r=5;
	}
	public String name(){
		return "Dot";
	}
	public String to_stirng(){
		return name()+"\n"+x+" "+y+"\n";
	}
	public Dot(int x, int y, int r){
		this.x=x; 
		this.y=y;
		this.r=r;
	}
	public Dot(int x, int y){
		this(x,y,5);
	}
	public void paint(Graphics g) {
		g.drawOval(x-r, y-r, r*2, r*2);
	}
	public static class myMouseListener extends acMouseListener {
		public myMouseListener(myJPanel jp, List<Shape> shapes) {super(jp, shapes);}
		
		public void mousePressed(MouseEvent arg0) {
			Shape shape = new Dot(arg0.getX(), arg0.getY());
			shape.paint(jp.getGraphics());
			shapes.add(shape);
		}

		public void mouseReleased(MouseEvent arg0) {}
		public void mouseClicked(MouseEvent arg0) {}
		public void mouseEntered(MouseEvent arg0) {}
		public void mouseExited(MouseEvent arg0) {}
	}
}
