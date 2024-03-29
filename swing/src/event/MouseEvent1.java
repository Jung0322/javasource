package event;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/* mouseClicked : Ŭ������ ��
 * mousePressed : ���콺��ư�� �������� ��
 * mouseReleased : �÷��� ��ư�� ����� ��
 * mouseEntered : ���콺�� ������Ʈ ���� �ö� ��
 * mouseExited : ���콺�� ������Ʈ���� ������ ��
 */


/* mouseDragged : ���콺�� �巡�� �Ǵ� ����
 * mouseMoved : ���콺�� �����̴� ����
 */


public class MouseEvent1 extends JFrame  implements MouseListener, MouseMotionListener{
	
	
	private JTextField textField;
	
	public MouseEvent1() {
		setTitle("���콺 �̺�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Ŭ��");
		btn.addMouseListener(this);
		add(btn,BorderLayout.NORTH);
		
		JTextArea textArea = new JTextArea(3,50);
		textArea.addMouseListener(this);
		textArea.addMouseMotionListener(this);
		add(textArea,BorderLayout.CENTER);
		
		textField = new JTextField();
		add(textField,BorderLayout.SOUTH);
		
		setSize(100,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MouseEvent1();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouseEntered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouseDragged");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("mouseMoved");
	}

}
