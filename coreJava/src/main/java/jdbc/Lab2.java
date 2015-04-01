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
		  //1.��������
	      Class.forName(driverName);
		  //2.�������ݿ�
		  con = 
			DriverManager.getConnection(url,username,pwd);
          //3.����һ�����ݿ��������
          stmt = con.createStatement();
		  //4.������ϰ��
		  String tableName = "test1";
          String sql = "create table "+tableName+
			  "(ID int(10) auto_increment primary key,"+
			  "NAME varchar(15) not null)";
		  int i = stmt.executeUpdate(sql);
          System.out.println("������"+tableName+"�ɹ�-"+i);
	   }catch(Exception e){
	      e.printStackTrace();
	   }finally{
	      //6.�ر�JDBC����
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