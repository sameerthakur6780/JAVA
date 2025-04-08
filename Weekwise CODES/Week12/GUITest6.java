package com.Week12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Example implements ActionListener{
	JFrame frm;
	JTextField inText, outText;
	JButton cmBtn, ftBtn;
	JLabel lblIn, lblOut;
	JPanel inputPanel, outputPanel, btnPanel;
	Example(){
	frm = new JFrame("Height Converter");
	frm.setSize(340, 140);
	lblIn = new JLabel("Height (inch)");
	inText = new JTextField(10);
	lblOut = new JLabel("Output");
	outText = new JTextField(10);
	cmBtn = new JButton("Convert to CM");
	ftBtn = new JButton("Convert to FT");
	
	cmBtn.setActionCommand("cm");
	ftBtn.setActionCommand("ft");
	
	
	cmBtn.addActionListener(this);
    ftBtn.addActionListener(this);
	inputPanel = new JPanel();
	outputPanel = new JPanel();
	btnPanel = new JPanel();
	inputPanel.add(lblIn);
	inputPanel.add(inText);
	frm.add(inputPanel, "North");
	outputPanel.add(lblOut);
	outputPanel.add(outText);
	frm.add(outputPanel, "Center");
	btnPanel.add(cmBtn);
	btnPanel.add(ftBtn);
	frm.add(btnPanel, "South");
	frm.setVisible(true);
}
	public void actionPerformed(ActionEvent e) {

		double in = Double.parseDouble(inText.getText());
		//String s = e.getActionCommand();
		JButton btn = (JButton)e.getSource();
		double out = 0.0;
		if(btn.equals(ftBtn))
		out = in * 0.0833333;
		else if(btn.equals(cmBtn))
		out = in * 2.54;
		outText.setText(out + "");
}
}
public class GUITest6{
public static void main(String[] args){
new Example();
}
}
