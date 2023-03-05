package PipedOutputStream;

//Java program illustrating the working of read() method
import java.io.*;
public class PipedInputStream1
{
	public static void main(String[] args) throws IOException
	{
		PipedInputStream input = new PipedInputStream();
		PipedOutputStream output = new PipedOutputStream();
		try
		{
			
			input.connect(output);
			output.write(70);
			System.out.println("using read() : " + (char)input.read());
			output.write(66);
			System.out.println("using read() : " + (char)input.read());
			output.write(78);
			System.out.println("using read() : " + (char)input.read());

		}
		catch (IOException except)
		{
			except.printStackTrace();
		}
	}
}
