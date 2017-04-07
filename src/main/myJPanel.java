package main;
import java.awt.Color;
import java.awt.Graphics;
import java.util.*;

import javax.swing.JPanel;

import shapes.Shape;

public class myJPanel extends JPanel{
	List<Shape> shapes=new ArrayList<Shape>();
	Color BACKGROUND = Color.WHITE;
	
//	MouseListener mmlDot, mmlPen;
	public myJPanel(){
//		mmlDot=new Dot.myMouseListener(this,shapes);
//		mmlPen=new Rectangle.myMouseListener(this,shapes);
//		addMouseListener(mmlDot);
//		addMouseListener(mmlPen);
	}
	public void paintComponent(Graphics g){
		for(Iterator<Shape> it=shapes.iterator();it.hasNext();){
			Shape shape = it.next();
			shape.paint(g);
		}
	} 
}
