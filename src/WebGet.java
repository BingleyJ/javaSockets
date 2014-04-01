import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
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

		boolean running = true;

		while (running) {
			System.out.println("Hostname:");
			host = reader.nextLine();
			System.out.println("Resource:");
			resource = reader.nextLine();
			//String input_resource = console.readLine("Resource:");

			if (host == "quit") {
				running = false;
			}

			final int HTTP_PORT = 80;
			Socket s = new Socket(host, HTTP_PORT);

			InputStream instream = s.getInputStream();
			OutputStream outstream = s.getOutputStream();

			Scanner in = new Scanner(instream);
			PrintWriter out = new PrintWriter(outstream);

			String command = "GET " + resource + " HTTP/1.1\n" + "Host: "
					+ host + "\n\n";

			out.print(command);
			out.flush();

			while (in.hasNextLine()) {
				String input = in.nextLine();
				System.out.println(input);
			}

			// Always close the socket at the end

			s.close();

		}

	}

}
