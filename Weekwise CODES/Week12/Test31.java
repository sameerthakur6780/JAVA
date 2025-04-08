package com.Week12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calci extends JFrame implements ActionListener{
	JButton add,multiply;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	JPanel p1,p2,p3;
	public Calci() {
		p1 = new JPanel();
		
		l1 = new JLabel("Enter Number1:");
		t1 = new JTextField(10);
		l2 = new JLabel("Enter Number2:");
		t2 = new JTextField(10);
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		
		add(p1,"North");
		
		p2 = new JPanel();
		
		add = new JButton("add");
		multiply = new JButton("multiply");
		p2.add(add);
		p2.add(multiply);//add buttons to panel
		
		
		add(p2,"Center");//add panel to frame
		
		p3 = new JPanel();
		l3 = new JLabel("Result");
		l4 = new JLabel();
		p3.add(l3);
		p3.add(l4);
		add(p3,"South");
		
		setVisible(true);
		setSize(600,140);
		
		add.setActionCommand("ADDD");
        multiply.setActionCommand("MULTIPLY");
        add.addActionListener(this);
        multiply.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
		int num1 = Integer.parseInt(t1.getText());
		int num2 = Integer.parseInt(t2.getText());
		
		String s = e.getActionCommand();
		if(s.equals("ADDD")) {
			int sum = num1+num2;
			l4.setText("Sum is :"+ sum);
		}
		else {
			int p = num1+num2;
			l4.setText("Product is: "+ p);
		}
			
    }
		
	
}


public class Test31 {
	public static void main(String[] args) {
   new Calci();
}
}
