package javatest1;
import javax.swing.*;
import java.awt.*;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyJFrame jf=new MyJFrame("Box",100,100,500,500);
		jf.setLayout(new FlowLayout());
		Box boxV1=Box.createVerticalBox();//创建盒子容器
		boxV1.add(new JLabel("姓名"));
		boxV1.add(Box.createVerticalStrut(8));  
		boxV1.add(new JLabel("email"));
		boxV1.add(Box.createVerticalStrut(8));
		boxV1.add(new JLabel("职业"));
		
		Box boxV2=Box.createVerticalBox();
		boxV2.add(new JTextField(10));
		boxV2.add(Box.createVerticalStrut(8));
		boxV2.add(new JTextField(10));
		boxV2.add(Box.createVerticalStrut(8));
		boxV2.add(new JTextField(10));
		
		Box baseBox=Box.createHorizontalBox();
		baseBox.add(boxV1);
		baseBox.add(Box.createHorizontalStrut(10));
		baseBox.add(boxV2);
		
		jf.add(baseBox);
		jf.pack();
		jf.setVisible(true);
		
		
	}

}
