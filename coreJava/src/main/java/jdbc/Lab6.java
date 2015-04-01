package jdbc;
import java.sql.*;

public class Lab6
{
	public static void main(String[] args){
	   Connection con = null;
	   PreparedStatement ps = null;
	   ResultSet rs = null;
	   try{
		  con = JdbcUtil.getConnection();
		  //3.创建一个数据库操作对象
		  String tableName = "test1";
          String sql = "insert into "+tableName+
			           "(NAME) values(?)";
		  ps = con.prepareStatement(sql);
		  
		  //4.插入记录
		  ps.setString(1,"Black");
		  int i = ps.executeUpdate();
		  
		  System.out.println("插入操作成功-"+i);

	   }catch(Exception e){
	      e.printStackTrace();
	   }finally{
	      //6.关闭JDBC对象
		  JdbcUtil.close(rs,ps,con);
	   }
	}
}