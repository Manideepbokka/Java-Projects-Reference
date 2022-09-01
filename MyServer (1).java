import java.io.*;
import java.net.*;
public class MyServer
{
  public static void main(String arg[])
  {
    try
    {
      ServerSocket ss=new ServerSocket(6666);
      Socket s=ss.accept();
      DataInputStream dis=new DataInputStream(s.getInputStream());
      String mss=(String)dis.readUTF();
      System.out.println(mss);
      s.close();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
