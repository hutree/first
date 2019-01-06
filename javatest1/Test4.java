package javatest1;
import javax.swing.*;
import java.awt.*;

class MJFrame extends JFrame{
	JMenuBar menubar;
	JMenu m1,m2,m3;
	JMenuItem item1,item2,item3,item4;
	Icon icon;
	
	MJFrame(String s,int x,int y,int w,int h){
		setMenu();
		setLayout(new FlowLayout());//内容居右显示
		setTitle(s);
		setBounds(x,y,w,h);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	void setMenu() {
		menubar=new JMenuBar();
		m1=new JMenu("File");
		m2=new JMenu("Edit");
		m3=new JMenu("Next");
		item1=new JMenuItem("open");
		item2=new JMenuItem("close");
		item3=new JMenuItem("exit");
		m1.add(item1);
		m1.add(item2);
		m1.addSeparator();
		m1.add(item3);
		m2.add(item1);
		m2.add(m3);
		item1=new JMenuItem("open1");
		item2=new JMenuItem("close1");
		m3.add(item1); 
		m3.add(item2);
		menubar.add(m1);
		menubar.add(m2);
		setJMenuBar(menubar);
	}
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MJFrame jf=new MJFrame("我的窗口",100,100,300,150);
		jf.setVisible(true);

	}

}
