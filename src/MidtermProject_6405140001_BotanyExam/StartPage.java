package MidtermProject_6405140001_BotanyExam;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class StartPage {
	

	public static void main(String[] args) {
		JFrame frame = new JFrame("Botany Exam");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.setBounds(500,200,300,450);
		panel.setLayout(null);

			JCheckBox logo = new JCheckBox(new ImageIcon("images/botanylogo.png"));

			JLabel usernameLabel = new JLabel("Username:");
			
			JTextField usernameField = new JTextField(20);
			
			JLabel passwordLabel = new JLabel("Password:");
		
			JPasswordField passwordField = new JPasswordField(20);

			JButton loginButton = new JButton("Login");
			loginButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				String password = new String(passwordField.getPassword());
		
				if (username.equals("student") &&
						password.equals("password123")) {
					
					new TestPage();
					frame.setVisible(false);

						} else {
						JOptionPane.showMessageDialog(frame,
						"Please check your email for the right login credentials");
						}
						}
						});


			panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));				
			panel.add(logo);
				panel.add(usernameLabel);
				panel.add(usernameField);
				panel.add(passwordLabel);
				panel.add(passwordField);
				panel.add(loginButton);

				frame.add(panel);
				frame.setSize(350, 400);
				frame.setVisible(true);
}
}
