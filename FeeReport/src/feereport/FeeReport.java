package feereport;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FeeReport extends JFrame{
	
	static FeeReport frame;
	private Container c;

	public static void main(String[] args) {
		
		frame = new FeeReport();
		frame.setVisible(true);
		

	}
	FeeReport(){
		
		
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 450, 300);
	setTitle("Fee report Management");
	
	c = this.getContentPane();
	c.setLayout(null);
	
	JLabel lblFeeManagement = new JLabel("Fee Management");
	lblFeeManagement.setBounds(100, 30, 250, 30);
	lblFeeManagement.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblFeeManagement.setForeground(Color.GRAY);
		
	c.add(lblFeeManagement);
	
	JButton btnAdminLogin = new JButton("Admin");
	btnAdminLogin.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//AdminLogin.main(new String[]{});
			AdminLogin.page();
			frame.dispose();
			
		}
		
		
	});
	
	btnAdminLogin.setBounds(20, 100, 120, 20);
	btnAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
	btnAdminLogin.setForeground(Color.GRAY);
	
	c.add(btnAdminLogin);
	
	JButton btnAccountantLogin = new JButton("Accountant");
	btnAccountantLogin.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//AdminLogin.main(new String[]{});
			AccountantLogin.page();
			frame.dispose();
			
		}
		
		
	});
	
	btnAccountantLogin.setBounds(20, 140, 120, 20);
	btnAccountantLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
	btnAccountantLogin.setForeground(Color.GRAY);
	
	c.add(btnAccountantLogin);
	
	JLabel lblCourtesy = new JLabel("@Developed By Abdullah");
	lblCourtesy.setBounds(300, 220, 150, 30);
	lblCourtesy.setFont(new Font("Tahoma", Font.PLAIN, 9));
	lblCourtesy.setForeground(Color.GRAY);
		
	c.add(lblCourtesy);
	
	}

}
