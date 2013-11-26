import java.io.*;
import java.net.*;
import java.util.*;
class Server
{
public static void main(String[] args)
{
try
{

DatagramSocket ds = new DatagramSocket(789);
while(true)
{
byte[] receiveByte = new byte[1024];
DatagramPacket dp = new DatagramPacket(receiveByte , receiveByte.length);
ds.receive(dp);
String mys = new String(dp.getData());
mys = mys.trim();
System.out.println(mys);

}
}
catch(Exception e)
{
System.out.println(e);
}
}//end of main
}//end of class