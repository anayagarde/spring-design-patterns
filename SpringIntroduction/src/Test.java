import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Customer;
import com.pojo.Share;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Share s = new Share();
//		s.setInstrumentId(1);
//		s.setInstrumentName("LNTLimited");
//		s.setMarketRate(1000);
//		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Share obj = (Share)context.getBean("share");
		
		
		System.out.println("share:-"+obj);
		
		DataSource source = (DataSource) context.getBean("dataSource");
		try {
			Connection connection = source.getConnection();
			System.out.println("GOT Connection");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Customer c = (Customer)context.getBean("mycust");
		Share s2 = c.getShare();
		System.out.println(s2);
	}

}
