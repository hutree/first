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
		
		button=new JButton("����ɫ�Ի���");
		button.addActionListener(this);
		this.add(button);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		Color newColor = JColorChooser.showDialog(this, "��ɫ��", getContentPane().getBackground());
		if(newColor!=null) {
			getContentPane().setBackground(newColor);
		}
	}
}

public class Test21 {

	public static void main(String[] args) {
		// ����ɫ�Ի���Ĵ���
		MyJFrame2 jf=new MyJFrame2("����ɫ�ĶԻ���",100,100,400,300);

	}

}
