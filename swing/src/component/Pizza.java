package component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.PseudoColumnUsage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Toolkit;

public class Pizza extends JFrame implements ItemListener, ActionListener {

	private JPanel contentPane;
	private int kind = 0;
	private int size = 0;
	private int toping = 0;
	private int sum = 0;
	private JLabel lbl;

	private ButtonGroup group1;
	private ButtonGroup group2;
	private ButtonGroup group3;

	// �׷캰 ��ǰ���� ���� ����
	private String Pkind, Ptopping, Psize;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizza frame = new Pizza();
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
	public Pizza() {
		setTitle("\uD53C\uC790\uC8FC\uBB38");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pizza.class.getResource("/component/pizza1.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBackground(Color.white);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel(
				"\uC790\uBC14 \uD53C\uC790\uC5D0 \uC624\uC2E0 \uAC83\uC744 \uD658\uC601\uD569\uB2C8\uB2E4.");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 20));
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.SOUTH);

		// Ȯ�ι�ư
		JButton btnOrder = new JButton("\uC8FC\uBB38");
		btnOrder.addActionListener(this);
		panel.add(btnOrder);

		// ��� ��ư
		JButton btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.addActionListener(this);
		panel.add(btnCancel);

		JLabel lblNewLabel_1 = new JLabel(" \uAE08\uC561 : ");
		panel.add(lblNewLabel_1);

		lbl = new JLabel("");
		panel.add(lbl);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "\uC885\uB958", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));

		// group1 ���� ��ư
		JRadioButton rdoCobmo = new JRadioButton("\uCF64\uBCF4");
		rdoCobmo.setBackground(Color.WHITE);
		rdoCobmo.addItemListener(this);
		panel_2.add(rdoCobmo);

		JRadioButton rdoPotato = new JRadioButton("\uD3EC\uD14C\uC774\uD1A0");
		rdoPotato.setBackground(Color.WHITE);
		rdoPotato.addItemListener(this);
		panel_2.add(rdoPotato);

		JRadioButton rdoBul = new JRadioButton("\uBD88\uACE0\uAE30");
		rdoBul.setBackground(Color.WHITE);
		rdoBul.addItemListener(this);
		panel_2.add(rdoBul);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "\uCD94\uAC00 \uD1A0\uD551",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));

		// group2 ���� ��ư
		JRadioButton rdoPeper = new JRadioButton("\uD53C\uB9DD");
		rdoPeper.setBackground(Color.WHITE);
		rdoPeper.addItemListener(this);
		panel_3.add(rdoPeper);

		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("\uCE58\uC988");
		rdbtnNewRadioButton_4.setBackground(Color.WHITE);
		rdbtnNewRadioButton_4.addItemListener(this);
		panel_3.add(rdbtnNewRadioButton_4);

		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("\uD398\uD37C\uB85C\uB2C8");
		rdbtnNewRadioButton_5.setBackground(Color.WHITE);
		rdbtnNewRadioButton_5.addItemListener(this);
		panel_3.add(rdbtnNewRadioButton_5);

		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("\uBCA0\uC774\uCEE8");
		rdbtnNewRadioButton_6.setBackground(Color.WHITE);
		rdbtnNewRadioButton_6.addItemListener(this);
		panel_3.add(rdbtnNewRadioButton_6);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "\uD06C\uAE30", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));

		// group3 ���� ��ư
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Small");
		rdbtnNewRadioButton_7.setBackground(Color.WHITE);
		rdbtnNewRadioButton_7.addItemListener(this);
		panel_4.add(rdbtnNewRadioButton_7);

		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Medium");
		rdbtnNewRadioButton_8.setBackground(Color.WHITE);
		rdbtnNewRadioButton_8.addItemListener(this);
		panel_4.add(rdbtnNewRadioButton_8);

		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Large");
		rdbtnNewRadioButton_9.setBackground(Color.WHITE);
		rdbtnNewRadioButton_9.addItemListener(this);
		panel_4.add(rdbtnNewRadioButton_9);

		// ���� �׷� ����
		group1 = new ButtonGroup();
		group1.add(rdoCobmo);
		group1.add(rdoPotato);
		group1.add(rdoBul);

		// �߰����� �׷� ����
		group2 = new ButtonGroup();
		group2.add(rdoPeper);
		group2.add(rdbtnNewRadioButton_4);
		group2.add(rdbtnNewRadioButton_5);
		group2.add(rdbtnNewRadioButton_6);

		// ũ�� �׷� ����
		group3 = new ButtonGroup();
		group3.add(rdbtnNewRadioButton_7);
		group3.add(rdbtnNewRadioButton_8);
		group3.add(rdbtnNewRadioButton_9);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ��ư �̺�Ʈ ó��
		String cmd = e.getActionCommand();
		if (cmd.equals("���")) {
			clear();
		} else {

			String orderList = "�ֹ�����\n�������� : " + Pkind + "\n";
			orderList += "�������� : " + Ptopping + "\n";
			orderList += "����ũ�� : " + Psize;
			orderList += "\n�ֹ��Ͻðڽ��ϱ�?";

			int result = JOptionPane.showConfirmDialog(getParent(), orderList, "�ֹ��Ϸ�", JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.INFORMATION_MESSAGE);
			
			if (result == 2) {
				clear();
			}else {
				JOptionPane.showMessageDialog(getParent(), "�ֹ��� �Ϸ�Ǿ����ϴ�.");
			}
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// ���� ��ư �̺�Ʈ ó��
		JRadioButton btn = (JRadioButton) e.getItem();
		if (btn.getText().equals("�޺�")) {
			sum = 0;
			kind = 10000;
			Pkind = btn.getText();
			sum += kind + size + toping;
			lbl.setText(sum + "");
		} else if (btn.getText().equals("��������")) {
			sum = 0;
			kind = 12000;
			Pkind = btn.getText();
			sum += kind + size + toping;
			lbl.setText(sum + "");
		} else if (btn.getText().equals("�Ұ��")) {
			sum = 0;
			kind = 13000;
			Pkind = btn.getText();
			sum += kind + size + toping;
			lbl.setText(sum + "");
		} else if (btn.getText().equals("�Ǹ�")) {
			sum = 0;
			size = 2000;
			Ptopping = btn.getText();
			sum += kind + size + toping;
			lbl.setText(sum + "");
		} else if (btn.getText().equals("ġ��")) {
			sum = 0;
			size = 2000;
			Ptopping = btn.getText();
			sum += kind + size + toping;
			lbl.setText(sum + "");
		} else if (btn.getText().equals("���۷δ�")) {
			sum = 0;
			size = 1000;
			Ptopping = btn.getText();
			sum += kind + size + toping;
			lbl.setText(sum + "");
		} else if (btn.getText().equals("������")) {
			sum = 0;
			size = 3000;
			Ptopping = btn.getText();
			sum += kind + size + toping;
			lbl.setText(sum + "");
		} else if (btn.getText().equals("Small")) {
			sum = 0;
			toping = 1000;
			Psize = btn.getText();
			sum += kind + size + toping;
			lbl.setText(sum + "");
		} else if (btn.getText().equals("Medium")) {
			sum = 0;
			toping = 2000;
			Psize = btn.getText();
			sum += kind + size + toping;
			lbl.setText(sum + "");
		} else if (btn.getText().equals("Large")) {
			sum = 0;
			toping = 3000;
			Psize = btn.getText();
			sum += kind + size + toping;
			lbl.setText(sum + "");
		}
	}
	
	public void clear() {
		group1.clearSelection();
		group2.clearSelection();
		group3.clearSelection();

		// �׷캰 �ֹ��޼��� ���� �ʱ�ȭ
		Pkind = "";
		Ptopping = "";
		Psize = "";

		lbl.setText("");
	}

}
