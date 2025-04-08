package com.Week12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUITest5 extends JFrame implements KeyListener{
	JLabel label;
	Container contentPane;
	public GUITest5() {
		label=new JLabel();
		addKeyListener(this);
		contentPane = this.getContentPane();
		contentPane.add(label);
		setVisible(true);
		setSize(200,200);
	}
	public void keyTyped(KeyEvent e) {
		label.setText("KeyTyped");
	}
	public void keyPressed(KeyEvent e) {
		label.setText("keyPressed");
	}
	public void keyReleased(KeyEvent e) {
		label.setText("keyReleased");
	}
	public static void main(String[] args) {
		new GUITest5();
	}

}
