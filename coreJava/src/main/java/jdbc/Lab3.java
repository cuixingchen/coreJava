package jdbc;
import java.sql.*;

public class Lab3
{
	public static void main(String[] args){
	   
	   String driverName = 
		   "com.mysql.jdbc.Driver";
	   Connection con = null;
	   Statement stmt = null;
	   ResultSet rs = null;
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
		  //4.查询
		  String tableName = "test1";
          String sql = "select ID,NAME from "+tableName;
		  rs = stmt.executeQuery(sql);
		  //5.遍历结果集
		  StringBuffer buf = new StringBuffer();
		  while(rs.next()){
		     buf.append("ID="+rs.getInt(1)+"  ");
			 buf.append("NAME="+rs.getString(2)+"\n");
		  }
		  System.out.print(buf.toString());

	   }catch(Exception e){
	      e.printStackTrace();
	   }finally{
	      //6.关闭JDBC对象
		  try{
		     if(rs!=null) rs.close();
		  }catch(Exception ex){
		     ex.printStackTrace();
		  }
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