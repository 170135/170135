import javax.swing.*;
import java.awt.*;
public class UserReg extends JFrame{
	UserReg(String title) {
		setTitle(title);
		setSize(500,100);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(2,2));

		JPasswordField jpf = new JPasswordField("",4);
		JLabel lbl = new JLabel("mail");
		JLabel lbl2 = new JLabel("PasswordField");
		JTextField jtf = new JTextField("",20);

		//pnl.add(lbl,BorderLayout.NORTH);
		//pnl.add(jtf,BorderLayout.NORTH);
		//pnl.add(lbl2,BorderLayout.NORTH);
		//pnl.add(jpf,BorderLayout.NORTH);

		pnl.add(lbl);
		pnl.add(jtf);
		pnl.add(lbl2);
		pnl.add(jpf);

		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		UserReg mail = new UserReg("mail");
		mail.setVisible(true);
	}
}