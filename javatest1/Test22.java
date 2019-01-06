package javatest1;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

class MyJFrame3 extends JFrame implements ActionListener{
	JFileChooser fileDialog;
	JMenuBar menubar;
	JMenu menu;
	JMenuItem itemSave,itemOpen;
	JTextArea text;
	BufferedReader in;
	FileReader fileReader;
	BufferedWriter out;
	FileWriter fileWriter;
	MyJFrame3(String s,int x,int y,int w,int h){
		this.setTitle(s);
		this.setBounds(x,y,w,h);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		text=new JTextArea(10,60);
		this.add(new JScrollPane(text),BorderLayout.CENTER);
		menubar=new JMenuBar();
		menu=new JMenu("文件");
		itemSave=new JMenuItem("保存文件");
		itemOpen=new JMenuItem("打开文件");
		itemSave.addActionListener(this);
		itemOpen.addActionListener(this);
		menu.add(itemSave);
		menu.add(itemOpen);
		menubar.add(menu);
		this.setJMenuBar(menubar);
		fileDialog=new JFileChooser();		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==itemSave) {
			int state=fileDialog.showSaveDialog(this);
			if(state==JFileChooser.APPROVE_OPTION) {
				try {
					File dir=fileDialog.getCurrentDirectory();
					String name=fileDialog.getSelectedFile().getName();
					File file=new File(dir,name);
					fileWriter=new FileWriter(file);
					out=new BufferedWriter(fileWriter);
					out.write(text.getText());
					out.close();
					fileWriter.close();
				}
				catch(IOException ee) {
				}
			
			}
		}
		else if(e.getSource()==itemOpen) {
			int state1=fileDialog.showOpenDialog(this);
			if(state1==JFileChooser.APPROVE_OPTION) {
				try {
					File dir = fileDialog.getCurrentDirectory();
					String name=fileDialog.getSelectedFile().getName();
					File file=new File(dir,name);
					fileReader=new FileReader(file);
					in=new BufferedReader(fileReader);
					String s=null;
					while((s=in.readLine())!=null) {
						text.append(s+"\n");
					}
					in.close();
					fileReader.close();
				}catch(IOException ee) {
					ee.printStackTrace();
					
				}
			}
	}
}
}

public class Test22 {

	public static void main(String[] args) {
		//读写文件
		MyJFrame3 jf=new MyJFrame3("使用文件对话框读写文件",100,100,620,300);
		jf.setVisible(true);

	}

}
