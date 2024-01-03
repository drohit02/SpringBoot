package FirstSprinBootApplication.SpringBootAppliaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BootFirstClass {
	
	@RequestMapping("/hello")
	public List<Employee> someMethod() {
		
		List<Employee> empList = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apidb","root","rohit1399");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT emp_id,emp_name FROM Employee");
			while(rs.next())
			{
				Employee empObj = new Employee(rs.getInt(1),rs.getString(2));
				empList.add(empObj);
			}
			return empList;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping("/hii")
	public String someMethof() {
		return "<h1 style=color:red>Hello World</h1>";
	}

}
