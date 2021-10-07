package component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RockScissorPaper extends JFrame implements ActionListener {

	private JTextField textField;
	private JButton btnRock, BtnPaper, btnScissor;

	public RockScissorPaper() {
		setTitle("���������� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ���� contentPane ��������
		Container container = getContentPane();

		// ��� �޽��� ���
		JLabel label = new JLabel("�Ʒ��� ��ư�߿��� �ϳ��� Ŭ���Ͻÿ�");
		label.setFont(new Font("����", Font.BOLD, 18));
		container.add(label, BorderLayout.NORTH);

		// ��� �̹��� ���
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3));
		container.add(panel, BorderLayout.CENTER);

		btnRock = new JButton();
		btnRock.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/rock.png")));
		btnRock.setActionCommand("rock");
		btnRock.addActionListener(this);
		panel.add(btnRock);

		btnScissor = new JButton();
		btnScissor.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/scissor.png")));
		btnScissor.setActionCommand("scissor");
		btnScissor.addActionListener(this);
		panel.add(btnScissor);

		BtnPaper = new JButton();
		BtnPaper.setIcon(new ImageIcon(RockScissorPaper.class.getResource("/component/paper.png")));
		BtnPaper.setActionCommand("paper");
		BtnPaper.addActionListener(this);
		panel.add(BtnPaper);

		// �ϴ� ��� ���
		textField = new JTextField();
		textField.setFont(new Font("����", Font.BOLD, 18));
		container.add(textField, BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int com = (int) (Math.random() * 3) + 0;
		String cmd = e.getActionCommand();
		if (cmd.equals("rock")) {
			if (com == 0) {
				textField.setText("����� : �ָ�  ��ǻ��: �ָ� �����ϴ�.");
			} else if (com == 1) {
				textField.setText("����� : �ָ� ��ǻ�� : �� �����ϴ�.");
			} else {
				textField.setText("����� : �ָ� ��ǻ�� : ���� �̰���ϴ�.");
			}
		} else if (cmd.equals("paper")) {
			if (com == 0) {
				textField.setText("����� : �� ��ǻ��: �ָ� �̰���ϴ�.");
			} else if (com == 1) {
				textField.setText("����� : �� ��ǻ�� : �� �����ϴ�.");
			} else {
				textField.setText("����� : �� ��ǻ�� : ����  �����ϴ�.");
			}
		}else {
			if (com == 0) {
				textField.setText("����� : ���� ��ǻ��: �ָ� �����ϴ�.");
			} else if (com == 1) {
				textField.setText("����� : ���� ��ǻ�� : �� �̰���ϴ�.");
			} else {
				textField.setText("����� : ���� ��ǻ�� : ����  �����ϴ�.");
			}
		}

	}

	public static void main(String[] args) {
		new RockScissorPaper();

	}

}
