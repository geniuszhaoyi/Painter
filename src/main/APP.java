package main;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import shapes.Dot;
import shapes.Rectangle;
import shapes.Shape;

public class APP extends JFrame {
	public APP(){
		super("APP");
		setSize(800, 600);
		Container c = getContentPane();
		
		myJPanel jp = new myJPanel();
		c.add(BorderLayout.CENTER,jp);
		
		JButton jb_save = new JButton("Clear");
		jb_save.addActionListener(new Clear_ActionListener(jp));
		c.add(BorderLayout.NORTH,jb_save);
		JButton jb_dot = new JButton("Dot");
		jb_dot.addActionListener(new Button_ActionListener(jp, new Dot.myMouseListener(jp,jp.shapes)));
		c.add(BorderLayout.EAST,jb_dot);
		JButton jb_rect = new JButton("Rectangle");
		jb_rect.addActionListener(new Button_ActionListener(jp, new Rectangle.myMouseListener(jp,jp.shapes)));
		c.add(BorderLayout.WEST,jb_rect);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private class Clear_ActionListener implements ActionListener{
		myJPanel jp;
    	public Clear_ActionListener(myJPanel jp){
    		this.jp=jp;
    	}
		public void actionPerformed(ActionEvent e) {
			jp.shapes.clear();
			Graphics g = jp.getGraphics();
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, jp.getSize().width, jp.getSize().height);
        }
	}
	private class Button_ActionListener implements ActionListener{
		myJPanel jp;
		acMouseListener mml;
    	public Button_ActionListener(myJPanel jp, acMouseListener mml){
    		this.jp=jp;
    		this.mml=mml;
    	}
		public void actionPerformed(ActionEvent e) {  
			MouseListener[] mouseListeners = jp.getMouseListeners();
			for (MouseListener mouseListener : mouseListeners) {
			    jp.removeMouseListener(mouseListener);
			}
            jp.addMouseListener(mml);
        }
	}
	
    public static void main(String[] args) {
    	new APP();
     
    }
}