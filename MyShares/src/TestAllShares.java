import java.util.List;

import com.dao.ShareDAO;
import com.dao.ShareDAOImpl;
import com.pojo.Share;

public class TestAllShares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShareDAO dao = new ShareDAOImpl();
		List<Share> shares = dao.findAllShares();
		for(Share s:shares) {
			System.out.println(s);
		}

	}

}
