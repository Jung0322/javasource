package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ButtonTest1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton left;
	private JButton middle;
	private JButton rigt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonTest1 frame = new ButtonTest1();
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
	public ButtonTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		left = new JButton("Disable middle button");
		left.setActionCommand("left");
		left.setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/left.gif")));
		left.setMnemonic('D');
		left.addActionListener(this);
		contentPane.add(left);

		middle = new JButton("Middle Button");
		middle.setActionCommand("middle");
		middle.setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/middle.gif")));
		middle.setMnemonic('M');
		middle.addActionListener(this);
		contentPane.add(middle);

		rigt = new JButton("Enable middle Button");
		rigt.setActionCommand("right");
		rigt.setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/right.gif")));
		rigt.setMnemonic('E');
		rigt.addActionListener(this);
		contentPane.add(rigt);

		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("left")) {
			rigt.setEnabled(true);
			left.setEnabled(false);
			middle.setEnabled(false);
		}else if (cmd.equals("middle")) {
			left.setEnabled(false);
			middle.setEnabled(false);
			rigt.setEnabled(true);
		}else {
			middle.setEnabled(true);
			left.setEnabled(true);
			rigt.setEnabled(false);
		}

	}

}
