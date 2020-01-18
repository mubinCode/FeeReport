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

public class EditStudent extends JFrame {

	static EditStudent frame;
	private Container c;

	public static void page() {
		frame = new EditStudent();
		frame.setVisible(true);
	}

	EditStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 450);
		setTitle("Accountant Panel");

		c = this.getContentPane();
		c.setLayout(null);

		JLabel lblAccountantForm = new JLabel("Student Editing Form");
		lblAccountantForm.setBounds(150, 20, 150, 30);
		lblAccountantForm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAccountantForm.setForeground(Color.GRAY);
		c.add(lblAccountantForm);

		JLabel lblroll = new JLabel("Roll No.");
		lblroll.setBounds(20, 60, 70, 20);
		lblroll.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblroll.setForeground(Color.GRAY);
		c.add(lblroll);

		JTextField rollField = new JTextField();
		rollField.setBounds(90, 60, 100, 20);
		rollField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rollField.setForeground(Color.GRAY);
		c.add(rollField);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(20, 100, 60, 20);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblName.setForeground(Color.GRAY);
		c.add(lblName);

		JTextField nameField = new JTextField();
		nameField.setBounds(90, 100, 100, 20);
		nameField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		nameField.setForeground(Color.GRAY);
		c.add(nameField);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(20, 125, 60, 20);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEmail.setForeground(Color.GRAY);
		c.add(lblEmail);

		JTextField emailText = new JTextField();

		emailText.setBounds(90, 125, 100, 20);
		emailText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		emailText.setForeground(Color.GRAY);
		c.add(emailText);

		JLabel lblCourse = new JLabel("courseourse");
		lblCourse.setBounds(20, 150, 60, 20);
		lblCourse.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCourse.setForeground(Color.GRAY);
		c.add(lblCourse);

		JTextField courseText = new JTextField();
		courseText.setBounds(90, 150, 100, 20);
		courseText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		courseText.setForeground(Color.GRAY);
		c.add(courseText);

		JLabel lblFee = new JLabel("Fee");
		lblFee.setBounds(20, 175, 60, 20);
		lblFee.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblFee.setForeground(Color.GRAY);
		c.add(lblFee);

		JTextField feeText = new JTextField();
		feeText.setBounds(90, 175, 100, 20);
		feeText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		feeText.setForeground(Color.GRAY);
		c.add(feeText);

		JLabel lblPaid = new JLabel("Paid");
		lblPaid.setBounds(20, 200, 60, 20);
		lblPaid.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPaid.setForeground(Color.GRAY);
		c.add(lblPaid);

		JTextField paidText = new JTextField();
		paidText.setBounds(90, 200, 100, 20);
		paidText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		paidText.setForeground(Color.GRAY);
		c.add(paidText);

		JLabel lblDue = new JLabel("Due");
		lblDue.setBounds(20, 225, 60, 20);
		lblDue.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDue.setForeground(Color.GRAY);
		c.add(lblDue);

		JTextField dueText = new JTextField();

		dueText.setBounds(90, 225, 100, 20);
		dueText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		dueText.setForeground(Color.GRAY);
		c.add(dueText);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(20, 250, 60, 20);
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAddress.setForeground(Color.GRAY);
		c.add(lblAddress);

		JTextField addressText = new JTextField();
		addressText.setBounds(90, 250, 100, 20);
		addressText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		addressText.setForeground(Color.GRAY);
		c.add(addressText);

		JLabel lblContact = new JLabel("Contact");
		lblContact.setBounds(20, 275, 60, 20);
		lblContact.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblContact.setForeground(Color.GRAY);
		c.add(lblContact);

		JTextField contactText = new JTextField();
		contactText.setBounds(90, 275, 100, 20);
		contactText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		contactText.setForeground(Color.GRAY);
		c.add(contactText);

		JButton btnEditStudent = new JButton("Edit Student");
		btnEditStudent.addActionListener(new ActionListener() {
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
				int rollno = Integer.parseInt(rollField.getText());

				Student s = new Student(rollno, name, email, course, fee, paid, due, address, contact);
				int i = StudentDao.update(s);
				if (i > 0) {
					JOptionPane.showMessageDialog(EditStudent.this, "Student updated successfully!");
					AccountantSection.page();
					frame.dispose();

				} else {
					JOptionPane.showMessageDialog(EditStudent.this, "Sorry, unable to update!");
				}

			}
		});

		btnEditStudent.setBounds(220, 300, 130, 20);
		btnEditStudent.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEditStudent.setForeground(Color.GRAY);

		c.add(btnEditStudent);

		JButton btnLoadRecord = new JButton("Loading");
		btnLoadRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String srollno = rollField.getText();
				if (srollno == null || srollno.trim().equals("")) {
					JOptionPane.showMessageDialog(EditStudent.this, "Please enter rollno first!");
				} else {
					int rollno = Integer.parseInt(srollno);
					Student s = StudentDao.getStudentByRollno(rollno);
					nameField.setText(s.getName());
					emailText.setText(s.getEmail());
					courseText.setText(s.getCourse());
					feeText.setText(String.valueOf(s.getFee()));
					paidText.setText(String.valueOf(s.getPaid()));
					dueText.setText(String.valueOf(s.getDue()));
					addressText.setText(s.getAddress());
					contactText.setText(s.getContact());
				}
			}
		});

		btnLoadRecord.setBounds(220, 60, 90, 20);
		btnLoadRecord.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLoadRecord.setForeground(Color.GRAY);

		c.add(btnLoadRecord);

	}
}
