import java.io.*;
import java.net.*;
import java.util.*;
class Client
{
public static void main(String[] args)
{
try
{
byte[] sendByte = new byte[1024];
while(true)
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
String str = br.readLine();
sendByte = str.getBytes();
DatagramSocket ds = new DatagramSocket();
DatagramPacket dpSend = new DatagramPacket(sendByte, sendByte.length , InetAddress.getLocalHost(),789);
ds.send(dpSend);

byte[] receiveByte = new byte[1024];
DatagramPacket dpReceive = new DatagramPacket(receiveByte , receiveByte.length);
ds.receive(dpReceive);
String mys = new String(dpReceive.getData());
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