package shapes;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.List;

import main.acMouseListener;
import main.myJPanel;


public class Rectangle implements Shape{
	int arg0, arg1, arg2, arg3;
	public Rectangle(String line){
		String parts[]=line.split(" ");
		arg0=Integer.valueOf(parts[0]);
		arg1=Integer.valueOf(parts[1]);
		arg2=Integer.valueOf(parts[2]);
		arg3=Integer.valueOf(parts[3]);
	}
	public String name(){
		return "Rectangle";
	}
	public String to_stirng(){
		return name()+"\n"+arg0+" "+arg1+" "+arg2+" "+arg3+"\n";
	}
	public Rectangle(int arg0, int arg1, int arg2, int arg3){
		this.arg0=arg0;
		this.arg1=arg1;
		this.arg2=arg2;
		this.arg3=arg3;
	}
	public Rectangle(){
		this(0,0,50,50);
	}
	public void paint(Graphics g) {
		g.drawRect(arg0, arg1, arg2-arg0, arg3-arg1);
	}
	public static class myMouseListener extends acMouseListener {
		public myMouseListener(myJPanel jp, List<Shape> shapes) {super(jp, shapes);}
		
		int x1,y1;
		public void mousePressed(MouseEvent arg0) {
			x1=arg0.getX();
			y1=arg0.getY();
		}

		public void mouseReleased(MouseEvent arg0) {
			int x2=arg0.getX(), y2=arg0.getY();
			Shape shape = new Rectangle(min(x1,x2), min(y1,y2), max(x1,x2), max(y1,y2));
			shape.paint(jp.getGraphics());
			shapes.add(shape);
		}
		
		private int max(int x1, int x2) {
			if(x1<x2) return x2;
			return x1;
		}
		private int min(int x1, int x2) {
			if(x1<x2) return x1;
			return x2;
		}

		public void mouseClicked(MouseEvent arg0) {}
		public void mouseEntered(MouseEvent arg0) {}
		public void mouseExited(MouseEvent arg0) {}
	}
}
