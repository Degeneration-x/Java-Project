import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {
public static void main(String[] args)throws Exception{
	client cl=new client();
	cl.run();
      }

private void run() throws Exception {
         Socket sock=new Socket("localhost",444);
         BufferedReader scan= new BufferedReader(new InputStreamReader(System.in));
         PrintStream ps=new PrintStream(sock.getOutputStream());
         System.out.println("Enter your message to server:");
         String message=scan.readLine();
         ps.println(message);
         InputStreamReader ir=new InputStreamReader(sock.getInputStream());
	      BufferedReader br= new BufferedReader(ir);
	      String servermessage=br.readLine();
	      System.out.println(servermessage);
	      
	    }
}
