import java.util.*;

import com.dao.CustomerDAO;
import com.dao.CustomerDAOImpl;
import com.dao.ShareDAO;
import com.dao.ShareDAOImpl;
import com.pojo.Customer;
import com.pojo.CustomerShare;
import com.pojo.Share;

public class Test {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				String ans = "y";
				int choice;
				Scanner scanner = new Scanner(System.in);
		do {
					System.out.println("Please select the chioce");
					System.out.println("1. Show All Shares");
					System.out.println("2. Show All Customers");
					System.out.println("3. Buy a share");
					System.out.println("4. Show All shares of a customer");

					System.out.println("Enter your Choice");
					choice = Integer.parseInt(scanner.nextLine());
//					scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		switch (choice) {
					case 1:
						ShareDAO dao = new ShareDAOImpl();
						List<Share> shares = dao.findAllShares();
						for (Share share : shares) {
							System.out.println(share);
						}
						break;

					case 2:
						CustomerDAO dao1 = new CustomerDAOImpl();
						List<Customer> customers = dao1.findAllCustomers();
						for (Customer customer : customers) {
							System.out.println(customer);
						}
						break;
		case 3:

						System.out.println("enter customer id");
						int customerId =Integer.parseInt(scanner.nextLine());

						System.out.println("enter share name");
						String shareName = scanner.nextLine();

						System.out.println("How many shares you want to buy?");
						int quantity = Integer.parseInt(scanner.nextLine());

						System.out.println("Whether you want this share as intraday or cnc");
						String type = scanner.nextLine();

						int added = new CustomerDAOImpl().addSharesToCustomer(customerId, shareName, quantity, type);
						if (added > 0) {
							System.out.println("share bought successfully!!!");
						} else
							System.out.println("Cann't buy. Try again");
						break;

					case 4:
						System.out.println("enter customer id whose shares display");
						customerId =Integer.parseInt(scanner.nextLine());
						List<CustomerShare> customerShares = new CustomerDAOImpl().findCustomersShares(customerId);
						for (CustomerShare customerShare : customerShares) {
							System.out.println(customerShare);
						}
						break;
		}
		
		System.out.println("Do you want to continue?");
					ans = scanner.nextLine();
	
				} while (ans.equalsIgnoreCase("y"));
		
				scanner.close();
			
		
		}
}


	

