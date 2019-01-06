package javatest1;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class JButtonh implements ActionListener{
	JTextArea textshow;
	JButton button;
	
	public void setJTextArea(JTextArea area) {
		textshow=area;
	}
	
	public void setJButton(JButton b) {
		button=b;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(button)) {
			textshow.append("Action occures\n");
		}
		
	}
}

public class Test11 {

	public static void main(String[] args) {
		// 在文本区看到输出结果,点击正确按钮显示文字
		MyJFrame jf=new MyJFrame("我的窗口",100,100,400,300);
		jf.setLayout(new FlowLayout());
		
		JButton b=new JButton("press me!");
		jf.add(b);
		JButton b1=new JButton("press22 me!");
		jf.add(b1);
		
		JTextArea a=new JTextArea(9,30);
		jf.add(a);
		
		JButtonh listener=new JButtonh();
		listener.setJTextArea(a);
		listener.setJButton(b);
		
		b.addActionListener(listener);
		jf.setVisible(true);
		

	}

}
