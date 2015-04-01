package jdbc;
import java.sql.*;

public class Lab2
{
	public static void main(String[] args){
	   
	   String driverName = 
		   "com.mysql.jdbc.Driver";
	   Connection con = null;
	   Statement stmt = null;
	   String url = 
		   "jdbc:mysql://127.0.0.1:3306/test";
	   String username = "root";
	   String pwd = "1234";
	   try{
		  //1.加载驱动
	      Class.forName(driverName);
		  //2.连接数据库
		  con = 
			DriverManager.getConnection(url,username,pwd);
          //3.创建一个数据库操作对象
          stmt = con.createStatement();
		  //4.创建练习表
		  String tableName = "test1";
          String sql = "create table "+tableName+
			  "(ID int(10) auto_increment primary key,"+
			  "NAME varchar(15) not null)";
		  int i = stmt.executeUpdate(sql);
          System.out.println("创建表"+tableName+"成功-"+i);
	   }catch(Exception e){
	      e.printStackTrace();
	   }finally{
	      //6.关闭JDBC对象
		  try{
		     if(stmt!=null) stmt.close();
		  }catch(Exception ex){
		     ex.printStackTrace();
		  }
		  try{
		     if(con!=null) con.close();
		  }catch(Exception ex){
		     ex.printStackTrace();
		  }
	   }
	}
}