package javatest1;
import javax.swing.*;
import java.awt.*;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyJFrame jf=new MyJFrame("�ҵĴ���",100,100,200,100);
		jf.setLayout(new FlowLayout());
		JButton b1=new JButton("��");
		JButton b2=new JButton("��");
		JButton b3=new JButton("��");
		JButton b4=new JButton("��");
		JButton b5=new JButton("��");
		jf.add(b1);
		jf.add(b2);
		jf.add(b3);
		jf.add(b4);
		jf.add(b5);
		jf.pack();
		jf.setVisible(true);

	}

}
