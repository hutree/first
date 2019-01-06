package javatest1;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class JTextAreaHandler implements DocumentListener{
	JTextArea inputText,showText;
	
	//绑定控件
	public void setInputText(JTextArea jcb) {
		inputText=jcb;
	}
	public void setShowText(JTextArea jcb) {
		showText=jcb;
	}
	
	//重写方法
	public void changedUpdate(DocumentEvent e) {
		String str=inputText.getText();
		showText.setText(str);
	}
	public void insertUpdate(DocumentEvent e) {
		changedUpdate(e);
	}
	public void removeUpdate(DocumentEvent e) {
		changedUpdate(e);
	}
}

public class Test13 {

	public static void main(String[] args) {
		// 左右文本同步显示
		MyJFrame jf=new MyJFrame("我的窗口",100,100,400,300);
		jf.setLayout(new FlowLayout());
		
		JTextArea inputText=new JTextArea(8,15);
		JTextArea showText=new JTextArea(8,15);
		jf.add(new JScrollPane(inputText));
		jf.add(new JScrollPane(showText));
		JTextAreaHandler listen=new JTextAreaHandler();
		listen.setInputText(inputText);
		listen.setShowText(showText);
		(inputText.getDocument()).addDocumentListener(listen);//向文档注册监视器
		jf.setVisible(true);
	}

}
