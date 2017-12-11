import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HelloJCheckBox extends JFrame implements ActionListener{
	/*JLabel label = new JLabel("This is a JLabel");
	JLabel labelB = new JLabel("B");
	JLabel labelC = new JLabel("C");
	JCheckBox c1 = new JCheckBox("A", true);
	JCheckBox c2 = new JCheckBox("B");
	JCheckBox c3 = new JCheckBox("C");*/

	JLabel[] label = {new JLabel("A"), new JLabel("B"), new JLabel("C")}; 
	JCheckBox[] check = {new JCheckBox("A"), new JCheckBox("B"), new JCheckBox("C")};
	HelloJCheckBox(String title) {
		setTitle(title);
		setSize(500,500);
		setLocation(0,0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(8,1));

		JButton button = new JButton("btn");

		for (int i=0; i<this.check.length; i++) panel.add(check[i]);
		for (int i=0; i<this.label.length; i++) panel.add(label[i]);
		panel.add(button,BorderLayout.NORTH);
		button.addActionListener(this);
		/*panel.add(c1);
		panel.add(c2);
		panel.add(c3);
		panel.add(button,BorderLayout.NORTH);
		panel.add(label);
		panel.add(labelB);
		panel.add(labelC);
		button.addActionListener(this);*/


		Container cp = getContentPane();
		cp.add(panel,BorderLayout.NORTH);
	}
	public void actionPerformed(ActionEvent e){
		System.out.println("クリックされました");
		String[] str = {"チェックA","チェックB","チェックC"};
		String[] str2 = {"入ってねえぞA","入ってねえぞB","入ってねえぞC"};
		// if(this.c1.isSelected()) {
		// 	this.label.setText("チェックA");	
		// }else {
		// 	this.label.setText("入ってねえぞA");	
		// }
		// if(this.c2.isSelected()) {
		// 	this.labelB.setText("チェックB");	
		// }else {
		// 	this.labelB.setText("入ってねえぞB");	
		// }
		// if(this.c3.isSelected()) {
		// 	this.labelC.setText("チェックC");	
		// }else {
		// 	this.labelC.setText("入ってねえぞC");	
		// }
		for (int i=0; i<this.label.length; i++) {
			if (this.check[i].isSelected()) this.label[i].setText(str[i]);
			else this.label[i].setText(str2[i]);
		}
	}
	public static void main(String[] args) {
		HelloJCheckBox frame = new HelloJCheckBox("Hello");
		frame.setVisible(true);
	}
}