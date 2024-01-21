import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.ShareDAO;
import com.pojo.Share;

public class TestDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ShareDAO dao=(ShareDAO)context.getBean("dao1");
		if(dao.addShare(new Share("spring share", 1234.45))>0)
		{
			System.out.println("inserted");
		}
		else {
			System.out.println("sorry");
		}
		
		dao.findAllShares().forEach(System.out::println);

	}

}
