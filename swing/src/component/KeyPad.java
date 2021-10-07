package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;

public class KeyPad extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	String res;
	JButton button[] = new JButton[9];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyPad frame = new KeyPad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public KeyPad() {
		setTitle("\uD0A4\uD328\uB4DC");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		textField = new JTextField();
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));


		for(int i=0;i<9;i++){
			button[i] = new JButton((i+1)+"");
			button[i].addActionListener(this);
			panel.add(button[i]);
		}

//		JButton btnNewButton = new JButton("1");
//		btnNewButton.setForeground(Color.BLACK);
//		btnNewButton.addActionListener(this);
//		panel.add(btnNewButton);
//
//		JButton btnNewButton_1 = new JButton("2");
//		btnNewButton_1.addActionListener(this);
//		panel.add(btnNewButton_1);
//
//		JButton btnNewButton_2 = new JButton("3");
//		btnNewButton_2.addActionListener(this);
//		panel.add(btnNewButton_2);
//
//		JButton btnNewButton_3 = new JButton("4");
//		btnNewButton_3.addActionListener(this);
//		panel.add(btnNewButton_3);
//
//		JButton btnNewButton_4 = new JButton("5");
//		btnNewButton_4.addActionListener(this);
//		panel.add(btnNewButton_4);
//
//		JButton btnNewButton_5 = new JButton("6");
//		btnNewButton_5.addActionListener(this);
//		panel.add(btnNewButton_5);
//
//		JButton btnNewButton_6 = new JButton("7");
//		btnNewButton_6.addActionListener(this);
//		panel.add(btnNewButton_6);
//
//		JButton btnNewButton_7 = new JButton("8");
//		btnNewButton_7.addActionListener(this);
//		panel.add(btnNewButton_7);
//
//		JButton btnNewButton_8 = new JButton("9");
//		btnNewButton_8.addActionListener(this);
//		panel.add(btnNewButton_8);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		textField.setText(textField.getText()+cmd);
//		if (cmd.equals("1")) {
//			res +=1;
//			textField.setText(res.substring(4));
//		}
//		else if (cmd.equals("2")) {
//			res +=2;
//			textField.setText(res.substring(4));
//		}
//		else if (cmd.equals("3")) {
//			res +=3;
//			textField.setText(res.substring(4));
//		}
//		else if (cmd.equals("4")) {
//			res +=4;
//			textField.setText(res.substring(4));
//		}
//		else if (cmd.equals("5")) {
//			res +=5;
//			textField.setText(res.substring(4));
//		}
//		else if (cmd.equals("6")) {
//			res +=6;
//			textField.setText(res.substring(4));
//		}
//		else if (cmd.equals("7")) {
//			res +=7;
//			textField.setText(res.substring(4));
//		}
//		else if (cmd.equals("8")) {
//			res +=8;
//			textField.setText(res.substring(4));
//		}
//		else {
//			res +=9;
//			textField.setText(res.substring(4));
//		}

	}

}
