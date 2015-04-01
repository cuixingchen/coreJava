package jdbc;
import java.sql.*;
import java.io.*;
public class Lab10
{
	public static void main(String[] args){
	   if(args.length!=1){
		   System.out.println("Usage:java Lab10 fileName");
		   return;
	   }
	   String fileName = args[0];
	   Connection con = null;
	   PreparedStatement ps = null;
	   InputStream in = null;
	   try{
		  con = JdbcUtil.getConnection();
		  con.setAutoCommit(false);
		  String sql = "insert into t_blob(ID,FILE_NAME,FILE_CONTENT) "+
			           "values(?,?,?)";
          ps = con.prepareStatement(sql);
		  in = new FileInputStream(fileName);
		  ps.setInt(1,1);
		  ps.setString(2,fileName);
		  ps.setBinaryStream(3,in,in.available());
		  ps.executeUpdate();
		  con.commit();
	   }catch(Exception e){
	      e.printStackTrace();
		  try{con.rollback();}catch(Exception ex){System.out.print(ex.getMessage());}
	   }finally{
		   try{in.close();}catch(Exception ex){System.out.print(ex.getMessage());}
		   JdbcUtil.close(null,ps,con);
	   }
	}
}