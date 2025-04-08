package com.Week12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonPanel extends JPanel{
      private JButton redButton;
      public ButtonPanel(){
           redButton = new JButton("Red");
           redButton.addActionListener(
        		   (ActionEvent evt) -> {
                       Color c = Color.red;
                       setBackground(c);
                       repaint();
               }   		
           );
           add(redButton);
      }
}
class ButtonFrame extends JFrame implements WindowListener{
      private Container contentPane;
      public ButtonFrame(){
           setTitle("Button Demo");
           setSize(300, 200);
           addWindowListener(this);
           contentPane = this.getContentPane();
           contentPane.add(new ButtonPanel());
      }
      // define seven methods for implementing WindowListener
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
public class FClass{
      public static void main(String[] args) {
            EventQueue.invokeLater(
                    () -> {
                        JFrame frame = new ButtonFrame();
                        frame.setVisible(true);
                    }
                    );

       }
}
