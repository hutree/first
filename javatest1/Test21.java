package javatest1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyJFrame2 extends JFrame implements ActionListener{
	JButton button;
	MyJFrame2(String s,int x,int y,int w,int h){
		this.setTitle(s);
		this.setLayout(new FlowLayout());
		this.setBounds(x,y,w,h);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		button=new JButton("打开颜色对话框");
		button.addActionListener(this);
		this.add(button);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		Color newColor = JColorChooser.showDialog(this, "调色板", getContentPane().getBackground());
		if(newColor!=null) {
			getContentPane().setBackground(newColor);
		}
	}
}

public class Test21 {

	public static void main(String[] args) {
		// 带颜色对话框的窗口
		MyJFrame2 jf=new MyJFrame2("带颜色的对话框",100,100,400,300);

	}

}
