package javatest1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MJFrame1 extends JFrame implements ActionListener{
	JTextField inputName;
	JTextArea save;
	MJFrame1(String s,int x,int y,int w,int h){
		setLayout(new FlowLayout());
		setTitle(s);
		setBounds(x,y,w,h);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		inputName=new JTextField(10);
		save=new JTextArea(8,10);
		this.add(inputName, BorderLayout.NORTH);
		add(new JScrollPane(save),BorderLayout.CENTER);
		inputName.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		String s=inputName.getText();
		int n=JOptionPane.showConfirmDialog(this, "确认是否正确","确认对话框",JOptionPane.YES_NO_OPTION);
		if(n==JOptionPane.YES_OPTION) {
			save.append(s+"\n");
			inputName.setText(null);
		}else if(n==JOptionPane.NO_OPTION) {
			inputName.setText(null);
		}
	}
	
}

public class Test19 {

	public static void main(String[] args) {
		//确认对话框
		MJFrame1 jf=new MJFrame1("带确认对话框的窗口",100,100,400,300);
		jf.setVisible(true);

	}

}
