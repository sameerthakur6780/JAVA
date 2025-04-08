package com.Week12;
import java.awt.FlowLayout;
import javax.swing.*;
//button to panel to frame
class FrameTest21 extends JFrame{//by default border layout
	JButton id,password,submit;
	JPanel p1,p2;
	public FrameTest21() {
	    id = new JButton("ID");
	    password = new JButton("Password");
	    p1 = new JPanel();  //by default, for panel flowlayout
	    p1.add(id);
	    p1.add(password);
	    
	    
	    submit = new JButton("Submit");
	    p2 = new JPanel(); 
	    p2.add(submit); //button to panel
	    
	    add(p1,"North");
	    add(p2,"South");
	    
	    
	    setVisible(true);
	    setSize(300,400);
	    
	 }
}
public class Test21{
	public static void main(String args[]) {
		FrameTest21 f = new FrameTest21();
		
		
	}
}
