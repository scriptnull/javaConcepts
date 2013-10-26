import java.io.*;
import java.net.*;
class Server
{
public static void main(String[] args)
{
try
{
ServerSocket ss = new ServerSocket(789);
Socket  s;
while(true)
{
s = ss.accept();
BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
String str = br.readLine();
System.out.println(str);

BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
System.out.println("type");
str = br1.readLine();
PrintStream ps = new PrintStream(s.getOutputStream());
ps.println(str);

}//end of while
}
catch(Exception e)
{
System.out.println(e);
}
}//end of main
}//end of class