package javatest1;
import javax.swing.*;
import java.awt.*;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyJFrame jf=new MyJFrame("CardLayout Demo ",100,100,500,500);
		JPanel p1=new JPanel();
		p1.setLayout(new CardLayout());
		p1.setBackground(Color.YELLOW);
		JPanel p2=new JPanel();
		jf.add(p1,BorderLayout.CENTER);
		jf.add(p2,BorderLayout.SOUTH);
		String[] names= {"��һ��","�ڶ���","������","������","������"};
		JLabel label;
		for(int i=0;i<names.length;i++) {
			label=new  JLabel(names[i],SwingConstants.CENTER);
			label.setFont(new Font("����",Font.PLAIN,28));
			p1.add(names[i],label);
		}
		JButton b1=new JButton("��һ��");
		JButton b2=new JButton("��һ��");
		JButton b3=new JButton("��һ��");
		JButton b4=new JButton("���һ��");
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		jf.setVisible(true);
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
	}

}
