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
		  //3.����һ�����ݿ��������
		  String tableName = "test1";
          String sql = "insert into "+tableName+
			           "(NAME) values(?)";
		  ps = con.prepareStatement(sql);
		  
		  //4.�����¼
		  ps.setString(1,"Black");
		  int i = ps.executeUpdate();
		  
		  System.out.println("��������ɹ�-"+i);

	   }catch(Exception e){
	      e.printStackTrace();
	   }finally{
	      //6.�ر�JDBC����
		  JdbcUtil.close(rs,ps,con);
	   }
	}
}