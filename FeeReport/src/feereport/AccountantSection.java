package feereport;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AccountantSection extends JFrame {

	static AccountantSection frame;
	private Container c;

	public static void page() {

		frame = new AccountantSection();
		frame.setVisible(true);

	}

	AccountantSection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Accountant Panel");

		c = this.getContentPane();
		c.setLayout(null);

		JLabel lblSalesmanSuccess = new JLabel("Accountant Task list");
		lblSalesmanSuccess.setBounds(170, 20, 150, 30);
		lblSalesmanSuccess.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSalesmanSuccess.setForeground(Color.GRAY);
		c.add(lblSalesmanSuccess);

		JButton btnMedicineList = new JButton("Add Student");
		btnMedicineList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// AdminLogin.main(new String[]{});
				AddStudent.page();
				frame.dispose();

			}

		});

		btnMedicineList.setBounds(20, 100, 130, 20);
		btnMedicineList.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMedicineList.setForeground(Color.GRAY);

		c.add(btnMedicineList);

		JButton btnViewMedicine = new JButton("View Student");
		btnViewMedicine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewStudent.main(new String[] {});
				// ViewStudent.page();
				frame.dispose();

			}

		});

		btnViewMedicine.setBounds(260, 100, 140, 20);
		btnViewMedicine.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnViewMedicine.setForeground(Color.GRAY);

		c.add(btnViewMedicine);
		//

		JButton btnSoldMedicine = new JButton("Edit Student");
		btnSoldMedicine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// AdminLogin.main(new String[]{});
				EditStudent.page();
				frame.dispose();

			}

		});

		btnSoldMedicine.setBounds(20, 140, 130, 20);
		btnSoldMedicine.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSoldMedicine.setForeground(Color.GRAY);

		c.add(btnSoldMedicine);

		JButton btnViewSoldMedicine = new JButton("All Dues");
		btnViewSoldMedicine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DueFee.main(new String[] {});
				// ViewMedicineSold.page();
				frame.dispose();

			}

		});

		btnViewSoldMedicine.setBounds(260, 140, 130, 20);
		btnViewSoldMedicine.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnViewSoldMedicine.setForeground(Color.GRAY);

		c.add(btnViewSoldMedicine);

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
