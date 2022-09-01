import java.net.*;
public class Header
{
  public static void main(String args[])
  {
    try
    {
      URL u=new URL("https://www.javatpoint.com/java-tutorial");
      System.out.println(u.getProtocol());
      System.out.println(u.getHost());
      System.out.println(u.getPort());
      System.out.println(u.getFile());
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
