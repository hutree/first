package javatest1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class ButtonHandler1 implements ActionListener{
	JFrame frame;
	public void setFather(JFrame f) {
		frame=f;
	}
	public void actionPerformed(ActionEvent e) {
		JDialog d=new JDialog(frame,"对话框",true);
		d.add(new JLabel("您好"));
		d.setBounds(100,400,100,100);
		d.setVisible(true);
	}
}

public class Test15 {

	public static void main(String[] args) {
		// 点击按钮创建对话框
		MyJFrame jf=new MyJFrame("框架",100,100,400,300);
		JButton button=new JButton("弹出对话框");
		jf.setLayout(new FlowLayout());
		jf.add(button);
		
		ButtonHandler1 handler=new ButtonHandler1();
		handler.setFather(jf);
		button.addActionListener(handler);
		jf.setVisible(true);

	}

}
