package javatest1;
import javax.swing.*;
import java.awt.Color;

public class Test20 {

	public static void main(String[] args) {
		// ��ɫ�Ի���
		Color newColor=JColorChooser.showDialog(null, "��ɫ�Ի���", Color.red);
		System.out.println(newColor.toString());

	}

}
