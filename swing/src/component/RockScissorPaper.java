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
		setTitle("가위바위보 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 현재 contentPane 가져오기
		Container container = getContentPane();

		// 상단 메시지 출력
		JLabel label = new JLabel("아래의 버튼중에서 하나를 클릭하시오");
		label.setFont(new Font("굴림", Font.BOLD, 18));
		container.add(label, BorderLayout.NORTH);

		// 가운데 이미지 출력
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

		// 하단 결과 출력
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.BOLD, 18));
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
				textField.setText("당신은 : 주먹  컴퓨터: 주먹 비겼습니다.");
			} else if (com == 1) {
				textField.setText("당신은 : 주먹 컴퓨터 : 보 졌습니다.");
			} else {
				textField.setText("당신은 : 주먹 컴퓨터 : 가위 이겼습니다.");
			}
		} else if (cmd.equals("paper")) {
			if (com == 0) {
				textField.setText("당신은 : 보 컴퓨터: 주먹 이겼습니다.");
			} else if (com == 1) {
				textField.setText("당신은 : 보 컴퓨터 : 보 비겼습니다.");
			} else {
				textField.setText("당신은 : 보 컴퓨터 : 가위  졌습니다.");
			}
		}else {
			if (com == 0) {
				textField.setText("당신은 : 가위 컴퓨터: 주먹 졌습니다.");
			} else if (com == 1) {
				textField.setText("당신은 : 가위 컴퓨터 : 보 이겼습니다.");
			} else {
				textField.setText("당신은 : 가위 컴퓨터 : 가위  비겼습니다.");
			}
		}

	}

	public static void main(String[] args) {
		new RockScissorPaper();

	}

}
