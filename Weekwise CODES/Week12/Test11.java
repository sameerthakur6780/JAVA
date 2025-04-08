package com.Week12;
import java.awt.*;
//awt,swing
//steps
//1.create a class that extends a class called JFrame
//2.set layout for frame
//3.create components (buttons)
//4.add components to panel and panel to frame
//5.set visiblity to true
//Flowlayout
//borderlayout by default for frame
//gridlayout
class FrameTest11 extends Frame{
	Button id,password,submit;
	public FrameTest11() {
		setLayout(new FlowLayout());//explicitly setting layout for frame
	    id = new Button("ID");
	    password = new Button("Password");
	    submit = new Button("Submit");
	    
	    add(id);
	    add(password);
	    add(submit);
	    
	    setVisible(true);
	    setSize(300,400);
	    
	 }
}
public class Test11{
	public static void main(String args[]) {
		FrameTest11 f = new FrameTest11();
		
		
	}
}
