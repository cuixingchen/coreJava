package jdbc;
import java.sql.*;

public class Lab7
{
	public static void main(String[] args){
	   if(args.length!=1){
	      System.out.println("Usage:java Lab7 update/query");
		  return;
	   }
	   String command = args[0];
	   Connection con = null;
	   PreparedStatement ps = null;
	   ResultSet rs = null;
	   try{
		  con = JdbcUtil.getConnection();
		  String tableName = "test1";
          String sql1 = "insert into "+tableName+
			           "(NAME) values(?)";
		  String sql2 = "select ID,NAME from "+tableName;
		  if("update".equals(command)){
		      ps = con.prepareStatement(sql1);
			  ps.setString(1,"Black");
		  }else if("query".equals(command)){
		      ps = con.prepareStatement(sql2);
		  }
		  if(ps.execute()){
		      rs = ps.getResultSet();
			  StringBuffer b = new StringBuffer();
			  while(rs.next()){
			     b.append("ID="+rs.getInt(1)+"\t");
				 b.append("NAME="+rs.getString(2)+"\n");
			  }
			  System.out.print(b.toString());
		  }else{
		      int i = ps.getUpdateCount();
			  System.out.println("插入操作成功-"+i);
		  }
		  
		  

	   }catch(Exception e){
	      e.printStackTrace();
	   }finally{
	      //6.关闭JDBC对象
		  JdbcUtil.close(rs,ps,con);
	   }
	}
}