package jdbc;
import java.sql.*;

public class Lab5
{
	public static void main(String[] args){
	   Connection con = null;
	   Statement stmt = null;
	   ResultSet rs = null;
	   try{
		  con = JdbcUtil.getConnection();
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
		  JdbcUtil.close(rs,stmt,con);
	   }
	}
}