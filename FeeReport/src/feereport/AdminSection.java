package feereport;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminSection extends JFrame {

	static AdminSection frame;
	private Container c;

	// public static void main(String[] args) {
	//
	// frame = new AdminSuccess();
	// frame.setVisible(true);
	//
	//
	// }

	public static void page() {

		frame = new AdminSection();
		frame.setVisible(true);

	}

	AdminSection() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Admin Panel");

		c = this.getContentPane();
		c.setLayout(null);

		JLabel lblAdminSuccess = new JLabel("Admin Page");
		lblAdminSuccess.setBounds(170, 20, 150, 30);
		lblAdminSuccess.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAdminSuccess.setForeground(Color.GRAY);
		c.add(lblAdminSuccess);

		JButton btnAccountantForm = new JButton("Add Accountant");
		btnAccountantForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// AdminLogin.main(new String[]{});
				AddAccountant.page();
				frame.dispose();

			}

		});

		btnAccountantForm.setBounds(20, 100, 130, 20);
		btnAccountantForm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAccountantForm.setForeground(Color.GRAY);

		c.add(btnAccountantForm);

		JButton btnAccountantView = new JButton("View Accountant");
		btnAccountantView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// AdminLogin.main(new String[]{});
				ViewAccountant.main(new String[] {});
				frame.dispose();

			}

		});

		btnAccountantView.setBounds(270, 100, 130, 20);
		btnAccountantView.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAccountantView.setForeground(Color.GRAY);

		c.add(btnAccountantView);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FeeReport.main(new String[] {});
				frame.dispose();

			}
		});

		btnLogout.setBounds(300, 220, 100, 20);
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLogout.setForeground(Color.GRAY);

		c.add(btnLogout);

	}

}
