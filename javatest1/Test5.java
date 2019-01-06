package javatest1;
import javax.swing.*;
import java.awt.*;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyJFrame jf=new MyJFrame("hhh",100,100,350,100);
		jf.setLayout(new BorderLayout());
		JButton b1=new JButton("东");
		JButton b2=new JButton("南");
		JButton b3=new JButton("西");
		JButton b4=new JButton("北");
		JButton b5=new JButton("中");
		jf.add(b1, BorderLayout.EAST);
		jf.add(b2, BorderLayout.SOUTH);
		jf.add(b3, BorderLayout.WEST);
		jf.add(b4, BorderLayout.NORTH);
		jf.add(b5, BorderLayout.CENTER);
		jf.pack();
		jf.setVisible(true);

	}

}
