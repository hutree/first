package javatest1;
import javax.swing.*;
import java.awt.*;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyJFrame jf=new MyJFrame("GRID",100,100,500,500);
		jf.setLayout(new GridLayout(3,3));
		JButton b[]=new JButton[9];
		for(int i=0;i<9;i++) {
			b[i]=new JButton(String.valueOf(i+1));
			jf.add(b[i]);
		}
		jf.pack();
		jf.setVisible(true);

	}

}
