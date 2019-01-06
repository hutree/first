package javatest1;
import javax.swing.*;
import java.awt.Color;

public class Test20 {

	public static void main(String[] args) {
		// 颜色对话框
		Color newColor=JColorChooser.showDialog(null, "颜色对话框", Color.red);
		System.out.println(newColor.toString());

	}

}
