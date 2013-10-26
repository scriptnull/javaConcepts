import java.io.*;
import java.net.*;
import java.util.*;
class Server
{
public static void main(String[] args)
{
try
{
byte[] sendByte = new byte[1024];
DatagramSocket ds = new DatagramSocket(789);
while(true)
{
byte[] receiveByte = new byte[1024];
DatagramPacket dpReceive = new DatagramPacket(receiveByte , receiveByte.length);
ds.receive(dpReceive);
String mys = new String(dpReceive.getData());
mys = mys.trim();
System.out.println(mys);

BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
String str = br.readLine();
sendByte = str.getBytes();
DatagramPacket dpSend = new DatagramPacket(sendByte, sendByte.length , dpReceive.getAddress(),dpReceive.getPort());
ds.send(dpSend);

}
}
catch(Exception e)
{
System.out.println(e);
}
}//end of main
}//end of class