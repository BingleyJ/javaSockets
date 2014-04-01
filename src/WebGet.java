import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
 * John Bingley 
 * A little command line web getter simulation;)
 * 
 * 
 */
public class WebGet {

	public static void main(String[] args) throws UnknownHostException, IOException {

		String host = null;
		String resource = null;

		// console stuff
		Scanner reader = new Scanner(System.in);

	
			System.out.println("url:");
			host = reader.nextLine();
			
			URL newurl = new URL(host);
			
			System.out.println("Protocol :" + newurl.getProtocol() + " Host: " + newurl.getHost() + " Port: " + newurl.getPort() + " File: " + newurl.getFile());
			
			
			//String input_resource = console.readLine("Resource:");
			
		}}
