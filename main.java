package valentines;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class main implements ActionListener {

	private JFrame frame;
	private JPanel panel;
	private JButton button;
	private JLabel label;
	public int num = 0;
	
	
	public main() {
		
		frame = new JFrame();
		frame.setBounds(500, 250, 400, 300);
		frame.setTitle("Valentine's Virus");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 400, 300);
		panel.setBackground(Color.PINK);
		panel.setLayout(null);
		frame.add(panel);
		
		button = new JButton("Yes");	
		button.setBounds(250, 200, 80, 20);
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				switch(num++) {
					case 1:
						label.setText("you have been selected to receive a virus");
					break;
					case 2:
						label.setText("do you love me");
					break;
					case 3:
						label.setText("you bitch");
					break;
					case 4:
						label.setText("ok you are lying oh my god");
					break;
					case 5:
						label.setText("woww, click for another surpise");
					break;
					case 6:
						label.setText("sike motherfucker click again");
					break;
				}
			}	
		});
		
		panel.add(button);
		label = new JLabel("good evening");
		label.setBounds(100, 100, 500, 100);
		panel.add(label);
		
		frame.setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		new main();

	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
