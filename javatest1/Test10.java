package javatest1;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*; 

class JButtonHandler implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("Action occurred");
	}
}


public class Test10 {

	public static void main(String[] args) {
		// ��ť�¼�����
		MyJFrame myFrame=new MyJFrame("�ҵĴ���",100,100,200,100);
		JButton b=new JButton("Press me!");
		myFrame.setLayout(new FlowLayout());
		myFrame.add(b);
		JButtonHandler listener=new JButtonHandler();
		b.addActionListener(listener);
		myFrame.setVisible(true);

	}

}
