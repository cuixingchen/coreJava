package jdbc;
import java.sql.*;
import java.io.*;
public class Lab11
{
	public static void main(String[] args){
	   if(args.length!=1){
		   System.out.println("Usage:java Lab11 fileName");
		   return;
	   }
	   String fileName = args[0];
	   Connection con = null;
	   PreparedStatement ps = null;
	   ResultSet rs = null;
	   InputStream in = null;
	   OutputStream out = null;
	   Blob blob = null;
	   try{
		  con = JdbcUtil.getConnection();
		  con.setAutoCommit(false);
		  String sql = "select FILE_CONTENT from t_blob "+
			  "where ID=?";
          ps = con.prepareStatement(sql);
		  ps.setInt(1,1);
		  rs = ps.executeQuery();
		  if(rs.next()){
		     blob = rs.getBlob(1);
		  }
		  in = blob.getBinaryStream();
		  out = new FileOutputStream(fileName);
		  int b = 0;
		  while((b=in.read())!=-1){
		    out.write(b);
		  }
		  con.commit();
	   }catch(Exception e){
	      e.printStackTrace();
		  try{con.rollback();}catch(Exception ex){System.out.print(ex.getMessage());}
	   }finally{
		   try{out.close();}catch(Exception ex){System.out.print(ex.getMessage());}
		   try{in.close();}catch(Exception ex){System.out.print(ex.getMessage());}
		   JdbcUtil.close(rs,ps,con);
	   }
	}
}