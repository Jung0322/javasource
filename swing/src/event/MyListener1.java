package event;

import java.awt.event.ActionEvent;

/* ActionListener
 * JButton, JMenuItem, JTextFiedld ������Ʈ �̺�Ʈ ���
 * 
 * JButton => ���콺�� enter ��ư ����
 * JTextFiedld => Enter Ű �Է�
 * 
 */
import java.awt.event.ActionListener;

public class MyListener1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		
	}

}
