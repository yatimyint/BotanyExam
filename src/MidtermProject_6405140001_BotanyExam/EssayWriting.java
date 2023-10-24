package MidtermProject_6405140001_BotanyExam;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class EssayWriting extends Panel implements KeyListener {
	
	Label l;
	TextArea area;
	EssayWriting() {
		
		l = new Label();
		l.setBounds (5, 10, 100, 10);
		area = new TextArea(20,20);
		JScrollPane scrollableTextArea = new JScrollPane(area);
		scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		area.setBounds (0, 30, 400, 300);
		area.addKeyListener(this);
		add(l);
		add(area);
		add(scrollableTextArea);
		setSize (400, 400);
		setLayout (null);
		setVisible (true); 

	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		String text = area.getText();
		String words[] = text.split ("\\s");
		l.setText ("Words: " + words.length); 		
	}

}
