import com.pojo.Employee;
import com.pojo.WageEmployee;

public class TestPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee w = new WageEmployee("name1",12,125d,3.5d);
		//Reference of super class and object of subclass
		w.display(); //dynamic binding
		
		//w.display(1230);
		((WageEmployee)w).display(1230); //This is downcasting
		// ref of supercasting cant
		
		//upcasting happens automatically i.e implicitly...downcasting you have to do
	
	}

}
//At the time of compilation, the references will be there
// function overriding is dynamic binding