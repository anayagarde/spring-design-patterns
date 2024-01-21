import java.io.*;
import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.pojo.*;
import com.connections.*;

public class FileExtraction {
	public static void main(String[] args)
	{
		File file=new File("sample.txt");    //creates a new file instance  
		FileReader fr;
		try {
			fr = new FileReader(file);
			BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
			//StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters  
			String line; 
			String obj[];
			while((line=br.readLine())!=null)  
			{  
				obj=line.split(" ");
				//new Transactions(Long.parseLong(obj[0]),new SimpleDateFormat("dd/MM/yyyy").parse(obj[1]),obj[2],obj[3],obj[4],obj[5],Long.parseLong(obj[6]));
				try
				{
					MyConnection conc=new MyConnection();
					Connection con=conc.getConnection();
					Statement stmt=con.createStatement();
					String sql = "Insert into current_valid values("+Long.parseLong(obj[0])+",'2020/09/02'"+
							",'"+obj[2]+"','"+obj[3]+"','"+obj[4]+"','"+obj[5]+"',"+Double.parseDouble(obj[6])+")";
					String sql_arc="Insert into archive(transaction_ref,value_date,payername,payer_accno,payeename,payee_accno,amount,valid_check) values('"
							+obj[0]+"','2020/09/02'"+",'"+obj[2]+"','"+obj[3]+"','"+obj[4]+"','"+obj[5]+"','"+obj[6]+"',0"+")";
					String sql_inv="Insert into archive(transaction_ref,value_date,payername,payer_accno,payeename,payee_accno,amount) values('"
							+obj[0]+"','2020/09/02'"+",'"+obj[2]+"','"+obj[3]+"','"+obj[4]+"','"+obj[5]+"','"+obj[6]+"')";
					System.out.println(sql_inv);
					//stmt.executeUpdate(sql);
					//stmt.executeUpdate(sql_arc);
					stmt.executeUpdate(sql_inv);
					con.close();
				}
				catch(Exception e){
					e.printStackTrace();
				}
				System.out.println("Records inserted!");
				System.out.println();
				//sb.append(line);      //appends line to string buffer  
				//sb.append("\n");     //line feed  


			}

			fr.close();
			//System.out.println("Contents"+sb.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   //reads the file 


	}
}
