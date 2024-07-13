package pizz_frame;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Myframe extends JFrame implements ActionListener{
	JButton button;
	JLabel lable;
	ImageIcon image;
	Myframe(){
		
		JLabel lable = new JLabel("<html> <h1>PIZZA MENU</h1>1. Small <br>2. Medium <br>3. Large <br>4. Monster </html>");
		this.setTitle("Jframe");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		//this.setBounds(0, 0, 100, 100);
		lable.setBounds(0, 0, 100, 100);
		lable.setFont(new Font("", Font.BOLD, 20));
		
		button = new JButton();
		button.setText("Choice");
		button.addActionListener(this);
		
		ImageIcon image = new ImageIcon("C:\\Users\\maruf\\Downloads\\logo.png");
		this.setIconImage(image.getImage());
		//this.getContentPane().setBackground(new Color(123,50,32));
		this.add(lable);
		this.add(button);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			
			lable.setBounds(20, 50, 250, 150);
		}
		
	}
}
