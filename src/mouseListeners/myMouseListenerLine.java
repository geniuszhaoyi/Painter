package mouseListeners;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import main.myJPanel;
import shapes.Dot;
import shapes.Shape;


public class myMouseListenerLine implements MouseListener {
	myJPanel jp;
	List<Shape> shapes;
	public myMouseListenerLine(myJPanel jp, List<Shape> shapes){
		this.jp = jp;
		this.shapes = shapes;
	}
	
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		Shape shape = new Dot(arg0.getX(), arg0.getY());
		shape.paint(jp.getGraphics());
		shapes.add(shape);
//		jp.repaint();
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
