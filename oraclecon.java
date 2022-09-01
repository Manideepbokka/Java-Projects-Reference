import java.sql.*;  
class oraclecon{  
public static void main(String args[]) 
{    
Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");    
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from student");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));    
con.close();
}  
}  