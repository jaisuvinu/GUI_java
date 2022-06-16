package java01;
import javax.swing.JOptionPane;

public class Main{
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello" + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are " + age+" years old");
		
		float height = Float.parseFloat(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "You are " + height+ " cm height");
		
		System.out.println("Hi "+name+" you are "+age+" and your height is "+height);
	}
	
}