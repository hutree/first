package javatest1;
import javax.swing.*;
import java.awt.*;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyJFrame jf=new MyJFrame("我的窗口",100,100,200,100);
		jf.setLayout(new FlowLayout());
		JButton b1=new JButton("东");
		JButton b2=new JButton("南");
		JButton b3=new JButton("西");
		JButton b4=new JButton("北");
		JButton b5=new JButton("中");
		jf.add(b1);
		jf.add(b2);
		jf.add(b3);
		jf.add(b4);
		jf.add(b5);
		jf.pack();
		jf.setVisible(true);

	}

}
