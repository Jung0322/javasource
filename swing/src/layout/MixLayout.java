package layout;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MixLayout extends JFrame {

	public MixLayout() {
		setTitle("MixLayout �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.orange);
		add(panel1,BorderLayout.NORTH);
		
		
		
		panel1.add(new JButton("��ư1"));
		panel1.add(new JButton("��ư2"));
		panel1.add(new JButton("��ư3"));
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());// �⺻�� FlowLayout�̱� ����
		panel2.setBackground(Color.blue);
		add(panel2,BorderLayout.CENTER);
		
		panel2.add(new JButton("��ư4"));
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MixLayout();

	}

}
