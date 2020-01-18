package feereport;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class StudentDao {
	//name,email,course,fee,paid,due,address,contact
	public static int save(Student s){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into feereport_student(name,email,course,address,contact,fee,paid,due) values(?,?,?,?,?,?,?,?)");
			ps.setString(1,s.getName());
			ps.setString(2,s.getEmail());
			ps.setString(3, s.getCourse());
			ps.setString(4,s.getAddress());
			ps.setString(5,s.getContact());
			ps.setInt(6,s.getFee());
			ps.setInt(7,s.getPaid());
			ps.setInt(8,s.getDue());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int update(Student s){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("update feereport_student set name=?,email=?,course=?,fee=?,paid=?,due=?,address=?,contact=? where rollno=?");
			ps.setString(1,s.getName());
			ps.setString(2,s.getEmail());
			ps.setString(3, s.getCourse());
			ps.setInt(4,s.getFee());
			ps.setInt(5,s.getPaid());
			ps.setInt(6,s.getDue());
			ps.setString(7,s.getAddress());
			ps.setString(8,s.getContact());
			ps.setInt(9,s.getRollno());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static List<Student> view(){
		List<Student> list=new ArrayList<Student>();
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from feereport_student");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Student s=new Student();
				s.setRollno(rs.getInt("rollno"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setCourse(rs.getString("course"));
				s.setFee(rs.getInt("fee"));
				s.setPaid(rs.getInt("paid"));
				s.setDue(rs.getInt("due"));
				s.setAddress(rs.getString("address"));
				s.setContactno(rs.getString("contact"));
				list.add(s);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	public static Student getStudentByRollno(int rollno){
		Student s=new Student();
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from feereport_student where rollno=?");
			ps.setInt(1,rollno);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				s.setRollno(rs.getInt("rollno"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setCourse(rs.getString("course"));
				s.setFee(rs.getInt("fee"));
				s.setPaid(rs.getInt("paid"));
				s.setDue(rs.getInt("due"));
				s.setAddress(rs.getString("address"));
				s.setContactno(rs.getString("contact"));
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return s;
	}
	public static List<Student> due(){
		List<Student> list=new ArrayList<Student>();
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from feereport_student where due>0");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Student s=new Student();
				s.setRollno(rs.getInt("rollno"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setCourse(rs.getString("course"));
				s.setFee(rs.getInt("fee"));
				s.setPaid(rs.getInt("paid"));
				s.setDue(rs.getInt("due"));
				s.setAddress(rs.getString("address"));
				s.setContactno(rs.getString("contact"));
				list.add(s);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
}
