package jdbc;
import java.sql.*;

public class Lab1
{
	public static void main(String[] args){
	   
	   String driverName = 
		   "oracle.jdbc.driver.OracleDriver";
	   Connection con = null;
	   String url = 
		   "jdbc:oracle:thin:@172.164.0.6:1521:tarena";
	   String username = "esd1007";
	   String pwd = "esd1007";
	   try{
		  //1.加载驱动
	      Class.forName(driverName);
		  //2.连接数据库
		  con = 
			DriverManager.getConnection(url,username,pwd);
          System.out.println(con.getClass());
	   }catch(Exception e){
	      e.printStackTrace();
	   }finally{
	      //6.关闭JDBC对象
		  try{
		     if(con!=null) con.close();
		  }catch(Exception ex){
		     ex.printStackTrace();
		  }
	   }
	}
}