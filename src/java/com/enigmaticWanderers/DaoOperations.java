
package com.enigmaticWanderers;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoOperations {
  
          
 public static Connection createConnection()
 {Connection con=null;
     try{Class.forName("com.mysql.cj.jdbc.Driver");// Step 2- loading the driver class
       
       con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/Shiwalik_hostel","root","4184100"); // step-3 creating connection
}
     catch(Exception e)
     {
     e.printStackTrace();}
     return con;
 }
    public static int saveData(Emp e)
    { int status=0;
        try{
        
             Connection con=DaoOperations.createConnection();
             PreparedStatement pstmt=con.prepareStatement("insert into userdata(Name,Password,Email,Country) values(?,?,?,?)");
        pstmt.setString(1, e.getName());
        
        pstmt.setString(2, e.getPassword());
        pstmt.setString(3, e.getEmail());
        pstmt.setString(4, e.getCountry());
          status=pstmt.executeUpdate();
        con.close();
    }
    catch(Exception e1)
    {e1.printStackTrace();}
       return status;
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static int deleteData(int id)
    { int status=0;
        
        try{Connection con=DaoOperations.createConnection();
        PreparedStatement pstmt=con.prepareStatement("delete from userdata where Id=?");
        pstmt.setInt(1, id);
        status=pstmt.executeUpdate();
        con.close();
        }
        catch(Exception e){e.printStackTrace();}
    
    return status;
    
    }
    
    /////////////////////////////////////////////////////////////////////
    public static int updateData(Emp e1)
    {int status=0;
        try{
    Connection con=DaoOperations.createConnection();
    PreparedStatement pstmt=con.prepareStatement("update userdata set Name=?,Password=?,Email=?,Country=? where Id=?");
    
    pstmt.setString(1,e1.getName());
    pstmt.setString(2, e1.getPassword());
    pstmt.setString(3, e1.getEmail());
    pstmt.setString(4, e1.getCountry());
    pstmt.setInt(5, e1.getId());
    status=pstmt.executeUpdate();
    con.close();
    }
    catch(Exception e){e.printStackTrace();}
    return status;
    }
    //////////////////////////////////////////////////////////////////////
    public static List<Emp> viewallEmp(){
        List<Emp> list=new ArrayList<Emp>();// create a array list object to store all the values of the table row in one cell of arraylist
        try{Connection con=DaoOperations.createConnection();
        
        PreparedStatement pstmt=con.prepareStatement("select * from userdata");
        ResultSet rs=pstmt.executeQuery();
        while(rs.next())
        {Emp e1=new Emp();
        e1.setId(rs.getInt("Id"));
        e1.setName(rs.getString("Name"));
        e1.setPassword(rs.getString("Password"));
        e1.setEmail(rs.getString("Email"));
        e1.setCountry(rs.getString("Country"));
        list.add(e1);
        }
        con.close();
        }
        catch(Exception e)
        {e.printStackTrace();}
       
return list ;
}
    
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     public static Emp getEmpByID(int id)
     {Emp e1=new Emp();
     try{
         int i=id;
     
     Connection con=DaoOperations.createConnection();
     PreparedStatement ps=con.prepareStatement("select * from userdata where Id=?");  
            ps.setInt(1,i);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e1.setId(rs.getInt("Id"));  
                e1.setName(rs.getString("Name"));  
                e1.setPassword(rs.getString("Password"));  
                e1.setEmail(rs.getString("Email"));  
                e1.setCountry(rs.getString("Country")); 
                
            }  
            
     }
     
     catch(Exception e)
        {e.printStackTrace();}
     return e1;
     }
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
  public static boolean checkForExistingUser(Emp e1)
  { boolean flag=false;
      try{
      Connection con=DaoOperations.createConnection();
      PreparedStatement pstmt=con.prepareStatement("select * from userdata where Email=?");
      pstmt.setString(1, e1.getEmail());
      
      ResultSet rs=pstmt.executeQuery();
      while(rs.next())
      {
      String password=rs.getString("Password");
      
      if(password.equals(e1.getPassword()))
      {
      flag=true;
      }
      }
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
  
  return flag;
  }
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  public static Emp getEmpByEmail(String email)
     {Emp e1=new Emp();
     try{
         String i=email;
     
     Connection con=DaoOperations.createConnection();
     PreparedStatement ps=con.prepareStatement("select * from userdata where Email=?");  
            ps.setString(1,i);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e1.setId(rs.getInt("Id"));  
                e1.setName(rs.getString("Name"));  
                e1.setPassword(rs.getString("Password"));  
                e1.setEmail(rs.getString("Email"));  
                e1.setCountry(rs.getString("Country")); 
                
            }  
            
     }
     
     catch(Exception e)
        {e.printStackTrace();}
     return e1;
     }
}
