package jdbc;
import java.sql.*;

public class Lab9
{
	public static void main(String[] args){
	   Connection con = null;
	   PreparedStatement ps = null;
	   try{
		  con = JdbcUtil.getConnection();
		  con.setAutoCommit(false);
          String sql = "insert into t_batch(ID) values(?)";
		  ps = con.prepareStatement(sql);
		  System.out.println("��ʼ:"+new java.util.Date());
		  for(int i=1;i<=10000;i++){
		     ps.setInt(1,i);
			 ps.addBatch();
			 if(i%100==0){
			    ps.executeBatch();
			 }
		  }
		  con.commit();
		  System.out.println("����:"+new java.util.Date());
		}catch(Exception e){
	      e.printStackTrace();
		  try{con.rollback();}catch(Exception ex){System.out.print(ex.getMessage());}
	   }finally{
	      JdbcUtil.close(null,ps,con);
	   }
	}
}