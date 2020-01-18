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
import javax.swing.JTextField;

public class AddStudent extends JFrame {

	static AddStudent frame;
	private Container c;

	public static void page() {
		frame = new AddStudent();
		frame.setVisible(true);
	}

	AddStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 350);
		setTitle("Accountant Panel");

		c = this.getContentPane();
		c.setLayout(null);

		JLabel lblStudentForm = new JLabel("Student Addition Form");
		lblStudentForm.setBounds(150, 20, 150, 30);
		lblStudentForm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStudentForm.setForeground(Color.GRAY);
		c.add(lblStudentForm);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(20, 60, 60, 20);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblName.setForeground(Color.GRAY);
		c.add(lblName);

		JTextField nameField = new JTextField();
		nameField.setBounds(90, 60, 100, 20);
		nameField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		nameField.setForeground(Color.GRAY);
		c.add(nameField);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(20, 85, 60, 20);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEmail.setForeground(Color.GRAY);
		c.add(lblEmail);

		JTextField emailText = new JTextField();

		emailText.setBounds(90, 85, 100, 20);
		emailText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		emailText.setForeground(Color.GRAY);
		c.add(emailText);

		JLabel lblCourse = new JLabel("courseourse");
		lblCourse.setBounds(20, 110, 60, 20);
		lblCourse.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCourse.setForeground(Color.GRAY);
		c.add(lblCourse);

		JTextField courseText = new JTextField();
		courseText.setBounds(90, 110, 100, 20);
		courseText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		courseText.setForeground(Color.GRAY);
		c.add(courseText);

		JLabel lblFee = new JLabel("Fee");
		lblFee.setBounds(20, 135, 60, 20);
		lblFee.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblFee.setForeground(Color.GRAY);
		c.add(lblFee);

		JTextField feeText = new JTextField();
		feeText.setBounds(90, 135, 100, 20);
		feeText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		feeText.setForeground(Color.GRAY);
		c.add(feeText);

		JLabel lblPaid = new JLabel("Paid");
		lblPaid.setBounds(20, 160, 60, 20);
		lblPaid.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPaid.setForeground(Color.GRAY);
		c.add(lblPaid);

		JTextField paidText = new JTextField();
		paidText.setBounds(90, 160, 100, 20);
		paidText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		paidText.setForeground(Color.GRAY);
		c.add(paidText);

		JLabel lblDue = new JLabel("Due");
		lblDue.setBounds(20, 185, 60, 20);
		lblDue.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDue.setForeground(Color.GRAY);
		c.add(lblDue);

		JTextField dueText = new JTextField();

		dueText.setBounds(90, 185, 100, 20);
		dueText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		dueText.setForeground(Color.GRAY);
		c.add(dueText);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(20, 210, 60, 20);
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAddress.setForeground(Color.GRAY);
		c.add(lblAddress);

		JTextField addressText = new JTextField();
		addressText.setBounds(90, 210, 100, 20);
		addressText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		addressText.setForeground(Color.GRAY);
		c.add(addressText);

		JLabel lblContact = new JLabel("Contact");
		lblContact.setBounds(20, 235, 60, 20);
		lblContact.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblContact.setForeground(Color.GRAY);
		c.add(lblContact);

		JTextField contactText = new JTextField();
		contactText.setBounds(90, 235, 100, 20);
		contactText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		contactText.setForeground(Color.GRAY);
		c.add(contactText);

		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// nameField,emailText,courseText,feeText,paidText,dueText,addressText,contactText
				String name = nameField.getText();
				String email = emailText.getText();
				String course = courseText.getText();
				int fee = Integer.parseInt(feeText.getText());
				int paid = Integer.parseInt(paidText.getText());
				int due = Integer.parseInt(dueText.getText());
				;
				String address = addressText.getText();
				String contact = contactText.getText();

				Student s = new Student(name, email, course, fee, paid, due, address, contact);
				int i = StudentDao.save(s);
				if (i > 0) {
					JOptionPane.showMessageDialog(AddStudent.this, "Student added successfully!");
					AccountantSection.page();
					frame.dispose();

				} else {
					JOptionPane.showMessageDialog(AddStudent.this, "Sorry, unable to save!");
				}

			}
		});

		btnAddStudent.setBounds(220, 270, 130, 20);
		btnAddStudent.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAddStudent.setForeground(Color.GRAY);

		c.add(btnAddStudent);
	}

}
