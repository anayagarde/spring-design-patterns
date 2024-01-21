import com.pojo.Employee;
import com.pojo.WageEmployee;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e = new Employee("name 123",123);
		 e.display();
		 System.out.println(e.getEmpName());
		 
		 e.setEmpName("new name");
		 e.display();
		 
		 WageEmployee wage = new WageEmployee();
		 System.out.println("for wage emp");
		 wage.display();
	}
 
}
