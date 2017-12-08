import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;
public class TestCheckBox extends JFrame {
	TestCheckBox(String title) {
		setTitle(title);
		setSize(500,200);
		setLocation(0,0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();

		JCheckBox check1 = new JCheckBox("A");
		JCheckBox check2 = new JCheckBox("B");
		JCheckBox check3 = new JCheckBox("C");

		pnl.add(check1);
		pnl.add(check2);
		pnl.add(check3);

		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		TestCheckBox TestCheckBox = new TestCheckBox("test");
		TestCheckBox.setVisible(true);
	}

}