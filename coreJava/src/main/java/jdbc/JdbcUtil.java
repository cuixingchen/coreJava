package jdbc;
import java.sql.*;
public class JdbcUtil
{
	static{
	  try{
		 String driverName = "com.mysql.jdbc.Driver";
	     //String driverName = "oracle.jdbc.driver.OracleDriver";
		 Class.forName(driverName);
	  }catch(Exception e){
	     e.printStackTrace();
	  }
	}
	public static Connection getConnection(){
	    String url = "jdbc:mysql://127.0.0.1:3306/test";
		String username = "root";
		String pwd = "1234";
		/*String url = "jdbc:oracle:thin:@172.164.0.6:1521:tarena";
		String username = "openlab";
		String pwd = "open123";*/
		Connection con = null;
		try{
		   con = DriverManager.getConnection(url,username,pwd);
		}catch(Exception e){
		   e.printStackTrace();
		}
        return  con ;
	}
	public static void close(ResultSet rs,Statement s,Connection con){
	    try{
		  if(rs!=null) rs.close();
		}catch(Exception e){
		  e.printStackTrace();
		}
		try{
		  if(s!=null) s.close();
		}catch(Exception e){
		  e.printStackTrace();
		}
		try{
		  if(con!=null) con.close();
		}catch(Exception e){
		  e.printStackTrace();
		}
	}
	public static void printRs(ResultSet rs){
	   if(rs==null) return;
	   try{
	      ResultSetMetaData meta = rs.getMetaData();
		  int cols = meta.getColumnCount();
		  StringBuffer b = new StringBuffer();
		  while(rs.next()){
		     for(int i=1;i<=cols;i++){
			    b.append(meta.getColumnName(i)+"=");
				b.append(rs.getString(i)+"\t");
			 }
			 b.append("\n");
		  }
		  System.out.print(b.toString());
	   }catch(Exception e){
	      e.printStackTrace();
	   }
	}
}