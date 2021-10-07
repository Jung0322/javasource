package event;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventTest3 extends JFrame {
	
	private JLabel lbl = new JLabel("Hello");

	public KeyEventTest3() {
		setTitle("텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//현재 설정된 레이아읏 없애기
		setLayout(null);
		
		//레이블 배치
		lbl.setLocation(50,50);
		lbl.addKeyListener(new myKEyAdapter());
		lbl.setSize(100,20);
		add(lbl);
		
		// 레이블이 포커스를 받을 수 있도록 설정
		Container contentPane = getContentPane();
		contentPane.addKeyListener(new myKEyAdapter());
		contentPane.setFocusable(true);
		// 키 입력을 받을 수 있도록 포커스 강제 지정
		contentPane.requestFocus();
		
		setSize(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new KeyEventTest3();

	}
	
	class myKEyAdapter extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			switch (keyCode) {
			case KeyEvent.VK_UP:
				lbl.setLocation(lbl.getX(),lbl.getY()-10);
				break;
			case KeyEvent.VK_DOWN:
				lbl.setLocation(lbl.getX(),lbl.getY()+10);
				break;
			case KeyEvent.VK_RIGHT:
				lbl.setLocation(lbl.getX()+10,lbl.getY());
				break;
			case KeyEvent.VK_LEFT:
				lbl.setLocation(lbl.getX()-10,lbl.getY());
				break;
			}
			super.keyPressed(e);
		}
	}

}
