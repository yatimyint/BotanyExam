package MidtermProject_6405140001_BotanyExam;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;



class TestPage {
	
	public TestPage() {
  
		
	JFrame frame = new JFrame("Botany Exam");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel = new JPanel();
	frame.setBounds(400,200,600,450);
	panel.setLayout(null);
	
	JLabel label1 = new JLabel("Which of the following is a fully grown tree?");
	JLabel label2 = new JLabel("Define the terms 'family','genus', and 'species'.");
	JLabel label3 = new JLabel( "Write this in at least 150 words.");
	JLabel label4 = new JLabel("Illustrate and label the parts of a Xylem Cell.");
	label4.setBorder(new EmptyBorder(0, 150, 0, 0));

	JCheckBox ck4 = new JCheckBox(new ImageIcon("images/tree1.png"));	
	JCheckBox ck5 = new JCheckBox(new ImageIcon("images/sprout.png"));
	JCheckBox ck6 = new JCheckBox(new ImageIcon("images/tree2.png"));

    
    String[] data = { "Option 1", "Option 2", "Option 3"};
    
	JCheckBox[] checkBox;
	checkBox = new JCheckBox[data.length];
    JPanel centerPanel = new JPanel();
    centerPanel.setLayout(new GridLayout(0, 3, 90, 4));
    for (int i = 0; i < data.length; i++) {
      checkBox[i] = new JCheckBox(data[i]);
      centerPanel.add(checkBox[i]);
    }
    
    JButton submitButton = new JButton("Submit");
    submitButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,
				"Your exam has been successfully submitted");
				frame.setVisible(false);
				}
				});
    
    JPanel centerPanel2 = new JPanel();
    centerPanel2.setLayout(new GridLayout(0, 3, 2, 1));
    centerPanel2.add(ck4);
    centerPanel2.add(ck5);
    centerPanel2.add(ck6);
    
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	

	JTabbedPane tp = new JTabbedPane();
	tp.setBounds(50, 50, 200, 200);
	
	p1.add(label1);
	p1.add(centerPanel);
	p1.add(centerPanel2);
	tp.add("Multiple Choice", p1);


	p2.add(label2);
	p2.add(label3);
	p2.add(new EssayWriting());
	tp.add("Essay", p2);
	
	BorderLayout layout = new BorderLayout();
	p3.setLayout(layout);
	p3.add(label4, BorderLayout.NORTH);
	p3.add(new IllustrationPage());
	p3.add(submitButton, BorderLayout.SOUTH);
	tp.add("Illustration", p3);
	
	
	frame.add(tp);
	frame.setVisible(true);


	}


}


	

			






	



