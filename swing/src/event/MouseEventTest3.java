package event;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventTest3 extends JFrame  {

	private JLabel lbl = new JLabel("Hello");

	public MouseEventTest3() {
		setTitle("텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 현재 설정된 레이아읏 없애기
		setLayout(null);

		// 레이블 배치
		lbl.setLocation(50, 50);
		lbl.addMouseListener(new myKEyAdapter());
		lbl.setSize(100, 20);
		add(lbl);

		// 레이블이 포커스를 받을 수 있도록 설정
		Container contentPane = getContentPane();
		contentPane.addMouseListener(new myKEyAdapter());
		contentPane.setFocusable(true);
		// 키 입력을 받을 수 있도록 포커스 강제 지정
		contentPane.requestFocus();

		setSize(200, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseEventTest3();

	}

	class myKEyAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			lbl.setLocation(e.getX(), e.getY());
		}
	}

	

}
