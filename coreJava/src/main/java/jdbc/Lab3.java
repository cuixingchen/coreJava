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
		  //1.��������
	      Class.forName(driverName);
		  //2.�������ݿ�
		  con = 
			DriverManager.getConnection(url,username,pwd);
          //3.����һ�����ݿ��������
          stmt = con.createStatement();
		  //4.��ѯ
		  String tableName = "test1";
          String sql = "select ID,NAME from "+tableName;
		  rs = stmt.executeQuery(sql);
		  //5.���������
		  StringBuffer buf = new StringBuffer();
		  while(rs.next()){
		     buf.append("ID="+rs.getInt(1)+"  ");
			 buf.append("NAME="+rs.getString(2)+"\n");
		  }
		  System.out.print(buf.toString());

	   }catch(Exception e){
	      e.printStackTrace();
	   }finally{
	      //6.�ر�JDBC����
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