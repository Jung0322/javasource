package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;


public class Calculation extends JFrame implements ActionListener {
	   
	   private JTextField num1,num2,result;
	   public Calculation() {
	      setTitle("���� ����");
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      JPanel top = new JPanel();
	      num1 = new JTextField(10);
	      top.add(num1);
	      
	      JLabel lbl = new JLabel("+");
	      top.add(lbl);
	      
	      num2 = new JTextField(10);
	      top.add(num2);
	      
	      JLabel lbl2 = new JLabel("=");
	      top.add(lbl2);
	      
	      result = new JTextField(10);
	      top.add(result);
	      add(top,BorderLayout.NORTH);
	      
	      
	      JPanel bottom = new JPanel();
	      JButton btn1 = new JButton("Ȯ��");
	      btn1.addActionListener(this);
	      bottom.add(btn1);
	      
	      JButton btn2 = new JButton("���");
	      btn2.addActionListener(this);
	      bottom.add(btn2);
	      add(bottom,BorderLayout.CENTER);
	      
	      //��ư �ΰ� ����
	      
	      
	      setSize(500, 500);
	      setVisible(true);
	   }
	   
	   
	   @Override
	   public void actionPerformed(ActionEvent e)  {
	      // TODO Auto-generated method stub
	      String cmd = e.getActionCommand();
	      try {
	         
	         if(cmd.equals("Ȯ��")) {
	            int op1 = Integer.parseInt(num1.getText());
	            int op2 = Integer.parseInt(num2.getText());
	            int total = op1+op2;
	            result.setText(total+"");
	         }else  {
	            num1.setText("");
	            num2.setText("");
	            result.setText("");
	         }
	      } catch (Exception e2) {
	    	  JOptionPane.showMessageDialog(getParent(), "�߸� �Է��߽��ϴ�");
	        
	         }
	   }
	   
	   public static void main(String[] args) {
	      new Calculation();
	   }

	}

