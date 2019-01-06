package javatest1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MouseHandler implements MouseListener,MouseMotionListener{
	int a,b,x0,y0,x,y;
	JTextArea area;
	
	public void setJTextArea(JTextArea area) {
		this.area=area;
	}
	
	public void mousePressed(MouseEvent e) {
		area.append("\n按下鼠标，位置：（"+e.getX()+","+e.getY()+")");
		JComponent com=(JComponent)e.getSource();
		a=com.getBounds().x;
		b=com.getBounds().y;
		x0=e.getX();
		y0=e.getY();
	}
	public void mouseReleased(MouseEvent e) {
		
	}
	public void mouseEntered(MouseEvent e) {
		
	}
	public void mouseExited(MouseEvent e) {
		
	}
	public void mouseClicked(MouseEvent e) {
		
	}
	public void mouseMoved(MouseEvent e) {

	}	
	public void mouseDragged(MouseEvent e) {
		Component com=null;
		if(e.getSource() instanceof Component) {
			com=(Component)e.getSource();
			a=com.getBounds().x;
			b=com.getBounds().y;
			x=e.getX();
			y=e.getY();
			a=a+x;
			b=b+y;
			com.setLocation(a-x0, b-y0);
		}
	}

}

public class Test14 {

	public static void main(String[] args) {
		// 鼠标事件
		MyJFrame jf=new MyJFrame("处理鼠标事件",100,100,400,300);
		jf.setLayout(new FlowLayout());
		JButton button =new JButton("用鼠标拖动我");
		JTextArea area=new JTextArea(10,20);
		
		MouseHandler mouseHandler=new MouseHandler();
		mouseHandler.setJTextArea(area);
		button.addMouseListener(mouseHandler);
		button.addMouseMotionListener(mouseHandler);
		jf.add(button);
		jf.add(new JScrollPane(area));
		jf.setVisible(true);

	}

}
