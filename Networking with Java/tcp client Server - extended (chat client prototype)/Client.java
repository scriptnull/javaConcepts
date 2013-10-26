import java.io.*;
import java.net.*;
import java.util.*;
class Client
{
public static void main(String[] args) throws Exception
{
while(true)
{
InetAddress ia = InetAddress.getLocalHost();
Socket s = new Socket(ia,789);
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("type");
String str = br.readLine();
PrintStream ps = new PrintStream(s.getOutputStream());
ps.println(str);

BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
str = br1.readLine();
System.out.println(str);

}

}//end of main
}//end of class