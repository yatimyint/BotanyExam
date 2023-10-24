package MidtermProject_6405140001_BotanyExam;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

import Lect7.MouseMotionListenerExample;

public class IllustrationPage extends
Panel implements MouseMotionListener{
	
	IllustrationPage(){
		addMouseMotionListener(this);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}

		public void mouseDragged(MouseEvent e)
		{
		Graphics g=getGraphics();
		g.setColor(Color.BLUE);
		g.fillOval(e.getX(),e.getY(),10,10);}
		public void mouseMoved(MouseEvent e) {} 

}

