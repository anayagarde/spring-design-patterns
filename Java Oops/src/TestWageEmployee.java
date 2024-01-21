import com.pojo.WageEmployee;

public class TestWageEmployee {
	
public static void main(String[] args) {
	WageEmployee w = new WageEmployee("name1",12,125d,3.5d);
	w.display();
	w.display(1230);
	//w.show();
}
}
