import com.dao.ShareDAO;
import com.dao.ShareDAOImpl;
import com.pojo.Share;

public class TestAddShare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShareDAO s=new ShareDAOImpl();
		int added=s.addShare(new Share("share 12345",900.56));
		if(added>0)
		{
			System.out.println("inserted");
		}
		else
			System.out.println("NOT INSERTED");
		

	}
}