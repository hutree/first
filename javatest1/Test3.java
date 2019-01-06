package javatest1;
import javax.swing.*;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyJFrame jf=new MyJFrame("我的窗口",100,100,300,150);
		JButton b1=new JButton("按钮");
		jf.add(b1);
		jf.setVisible(true);

	}

}