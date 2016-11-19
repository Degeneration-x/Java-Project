import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
public static void main (String[] args)throws Exception{
	server server1=new server();
	server1.run();
    }
public void run() throws Exception{
	ServerSocket serv= new ServerSocket(444);
	Socket sock=serv.accept();
	InputStreamReader ir=new InputStreamReader(sock.getInputStream());
	BufferedReader br=new BufferedReader(ir);
	String Message=br.readLine();
	System.out.println(Message);
	if(Message!=null){
		PrintStream ps= new PrintStream(sock.getOutputStream());
		ps.println("Message Delivered!!");
	
	}
}


}
