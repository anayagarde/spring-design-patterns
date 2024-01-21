import java.util.List;

import com.dao.ShareDAO;
import com.dao.ShareDAOImpl;
import com.pojo.Share;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ShareDAO dao=new ShareDAOImpl();
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				dao.addShare(new Share());
			}
		};
		
		Thread thread=new Thread(r);
		thread.start();
		thread.sleep(20000);
		
		System.out.println("new thread started");
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				List<Share>shares=dao.findAllShares();
				for(Share s:shares)
				{
					System.out.println(s);
				}
			}
		};
		
		Thread thread1=new Thread(r1);
		thread1.start();
		System.out.println("main ends");
	}

}
