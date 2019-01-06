package javatest1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

class FileAccept implements FilenameFilter{
	//获取文件夹下的文件名
	private String extendName;
	public void setExtendName(String s) {
		extendName="."+s;
	}
	public boolean accept(File dir,String name) {
		return name.endsWith(extendName);
	}
}

class JComboBoxHandler implements ItemListener{
	JComboBox choice;
	JTextArea textShow;
	
	//绑定控件
	public void setJComboBox(JComboBox jcb) {
		choice=jcb;
	}
	public void setJTextArea(JTextArea area) {
		textShow=area;
	}
	
	public void itemStateChanged(ItemEvent e) {
		textShow.setText(null);
		String fileName=choice.getSelectedItem().toString();
		try(FileReader inOne=new FileReader("C:\\ch8\\"+fileName);
				BufferedReader inTwo=new BufferedReader(inOne)
				){
			String s=null;
			while((s=inTwo.readLine())!=null) {
				textShow.append(s+"\n");
			}
		}catch(Exception ee) {
			textShow.append(ee.toString());
		}
	}
}

public class Test12 {

	public static void main(String[] args) {
		// 根据下拉列表显示文件
		MyJFrame jf=new MyJFrame("我的窗口",100,100,400,300);
		jf.setLayout(new FlowLayout());
		
		File dir=new File("C:\\ch8");
		FileAccept fileAccept=new FileAccept();
		fileAccept.setExtendName("java");
		String[] fileName=dir.list(fileAccept);
		String itemList[]=new String[fileName.length+1];
		itemList[0]="请选择文件";
		for(int i=0;i<fileName.length;i++) {
			itemList[i+1]=fileName[i];
		}
		
		JComboBox jcb=new JComboBox(itemList);
		jf.add(jcb);
		
		JTextArea textArea=new JTextArea(9,30);
		jf.add(new JScrollPane(textArea));
		
		JComboBoxHandler listener=new JComboBoxHandler();
		listener.setJTextArea(textArea);
		listener.setJComboBox(jcb);
		
		jcb.addItemListener(listener);
		jf.setVisible(true);

	}

}
