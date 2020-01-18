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

public class AddAccountant extends JFrame{
	
	static AddAccountant frame;
	private Container c;

//	public static void main(String[] args) {
//		
//		frame = new SalesmanForm();
//		frame.setVisible(true);
//
//	}
	
public static void page() {
		
		frame = new AddAccountant();
		frame.setVisible(true);
		
	}



	AddAccountant(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Admin Panel");
	
		c = this.getContentPane();
		c.setLayout(null);
	
		JLabel lblAccountantForm = new JLabel("Accountant Addition Form");
		lblAccountantForm.setBounds(150, 20, 150, 30);
		lblAccountantForm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAccountantForm.setForeground(Color.GRAY);
		c.add(lblAccountantForm);
		
		
		JLabel lblname = new JLabel("Name");
		lblname.setBounds(20, 60, 60, 20);
		lblname.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblname.setForeground(Color.GRAY);
		c.add(lblname);
		
		JTextField nameText = new JTextField();
		nameText.setBounds(90, 60, 100, 20);
		nameText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		nameText.setForeground(Color.GRAY);
		c.add(nameText);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(20, 85, 60, 20);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPassword.setForeground(Color.GRAY);
		c.add(lblPassword);
		
		
		JTextField passwordField = new JTextField();
		passwordField.setBounds(90, 85, 100, 20);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		passwordField.setForeground(Color.GRAY);
		c.add(passwordField);
		
		JLabel lblemail = new JLabel("email");
		lblemail.setBounds(20, 110, 60, 20);
		lblemail.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblemail.setForeground(Color.GRAY);
		c.add(lblemail);
		
		JTextField emailText = new JTextField();
		emailText.setBounds(90, 110, 100, 20);
		emailText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		emailText.setForeground(Color.GRAY);
		c.add(emailText);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(20, 135, 60, 20);
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAddress.setForeground(Color.GRAY);
		c.add(lblAddress);
		
		
		JTextField AddressField = new JTextField();
		AddressField.setBounds(90, 135, 100, 20);
		AddressField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		AddressField.setForeground(Color.GRAY);
		c.add(AddressField);
		
		JLabel lblContactNo = new JLabel("ContactNo");
		lblContactNo.setBounds(20, 160, 60, 20);
		lblContactNo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblContactNo.setForeground(Color.GRAY);
		c.add(lblContactNo);
		
		JTextField ContactNoText = new JTextField();
		ContactNoText.setBounds(90, 160, 100, 20);
		ContactNoText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ContactNoText.setForeground(Color.GRAY);
		c.add(ContactNoText);
	
		JButton btnadd = new JButton("Add Accountant");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String name = nameText.getText();
					String password = passwordField.getText();
					String email = emailText.getText();
					String address = AddressField.getText();
					String contact=ContactNoText.getText();

					int i=AccountantDao.save(name, password, email, address, contact);
					if(i>0){
						JOptionPane.showMessageDialog(AddAccountant.this,"Accountant added successfully!");
						AdminSection.page();
						frame.dispose();
						
					}else{
						JOptionPane.showMessageDialog(AddAccountant.this,"Sorry, unable to save!");
					}
				
			}
		});
		
		btnadd.setBounds(270, 220, 130, 20);
		btnadd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnadd.setForeground(Color.GRAY);
		
		c.add(btnadd);
		
	}

}

