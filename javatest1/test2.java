package javatest1;
import javax.swing.*;
import static javax.swing.JFrame.*;

class MyJFrame extends JFrame{
	MyJFrame(String s,int x,int y,int w,int h){
		setTitle(s);
		setBounds(x,y,w,h);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyJFrame jf=new MyJFrame("ÎÒµÄ´°¿Ú",100,100,300,150);
		jf.setVisible(true);
	}

}
