package com.Week12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUITest4 extends JFrame implements ActionListener{
	JCheckBox b1,b2,b3;
	JPanel panel1,panel2;
	
	public GUITest4(){
		
		panel1=new JPanel();
		panel2=new JPanel();
		
		b1=new JCheckBox("Yellow");
		b2=new JCheckBox("Black");
		b3=new JCheckBox("Cyan");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		panel1.add(b1);
		panel1.add(b2);
		panel1.add(b3);
		
		add(panel1,"South");
		add(panel2,"North");
		setVisible(true);
		setSize(800,400);
	}
	public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(b1))//
		panel2.setBackground(Color.yellow);
	if(e.getSource().equals(b2))
		panel2.setBackground(Color.black);
	if(e.getSource().equals(b3))
		panel2.setBackground(Color.cyan);
	}
	public static void main(String[] args){
	new GUITest4();
	}
}