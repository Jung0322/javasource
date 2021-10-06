package event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MyFrame4 extends JFrame implements ActionListener {

	private Container container;
	
	public MyFrame4() {
		setTitle("�����ӹ�������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�������� ���̾ƿ� ����
		container = getContentPane();
		container.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("���");
		btn1.addActionListener(this);
		
		JButton btn2 = new JButton("����");
		btn2.addActionListener(this);
		
		add(btn1);
		add(btn2);
		

		setBounds(200, 100, 300, 200);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();

		if(cmd.equals("���")) {
			container.setBackground(Color.YELLOW);
		}else {
			container.setBackground(Color.RED);
		}
	}

	public static void main(String[] args) {
		new MyFrame4();

	}

}
