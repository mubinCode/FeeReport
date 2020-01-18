package feereport;

import java.awt.BorderLayout;
import java.awt.Container;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;


public class AccountantDao{
	private static Container contentPane;
	

	
	public static int save(String name,String password,String email,String address,String contact){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into feereport_accountant(name,password,email,address,contact) values(?,?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2,password);
			ps.setString(3,email);
			ps.setString(4,address);
			ps.setString(5,contact);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
	public static int delete(int id) {
		int sttus =0;
		try {
			Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement("delete From feereport_accountant where id=?");
			ps.setInt(1, id);
			sttus = ps.executeUpdate();
			con.close();			
			
		}catch(Exception e){System.out.println(e);}
		return sttus;
	}
	public static boolean validate(String user, String password) {
		boolean status =false;
		try {
			Connection con = DB.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from feereport_accountant where name=? and password=?");
			ps.setString(1,user);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
			
		}catch(Exception e){System.out.println(e);}
		return status;
		
	}
	
	public static List<Accountant> view(){
		List<Accountant> list=new ArrayList<>();
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from feereport_accountant");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Accountant a=new Accountant();
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPassword(rs.getString(3));
				a.setEmail(rs.getString(4));
				a.setAddress(rs.getString(5));
				System.out.println(rs.getString(5));
				a.setContactno(rs.getString(6));
				list.add(a);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}

	
}
