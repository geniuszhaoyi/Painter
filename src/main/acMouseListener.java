package main;
import java.awt.event.MouseListener;
import java.util.List;

import shapes.Shape;


public abstract class acMouseListener implements MouseListener {
	protected myJPanel jp;
	protected List<Shape> shapes;
	public acMouseListener(myJPanel jp, List<Shape> shapes){
		this.jp = jp;
		this.shapes = shapes;
	}
}
