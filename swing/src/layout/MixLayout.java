package layout;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MixLayout extends JFrame {

	public MixLayout() {
		setTitle("MixLayout 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.orange);
		add(panel1,BorderLayout.NORTH);
		
		
		
		panel1.add(new JButton("버튼1"));
		panel1.add(new JButton("버튼2"));
		panel1.add(new JButton("버튼3"));
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());// 기본이 FlowLayout이기 때문
		panel2.setBackground(Color.blue);
		add(panel2,BorderLayout.CENTER);
		
		panel2.add(new JButton("버튼4"));
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MixLayout();

	}

}
