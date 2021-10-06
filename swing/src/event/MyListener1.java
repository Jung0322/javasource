package event;

import java.awt.event.ActionEvent;

/* ActionListener
 * JButton, JMenuItem, JTextFiedld 컴포넌트 이벤트 담당
 * 
 * JButton => 마우스나 enter 버튼 선택
 * JTextFiedld => Enter 키 입력
 * 
 */
import java.awt.event.ActionListener;

public class MyListener1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		
	}

}
