package PushbackInputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;


public class PushbackInputStream1 {
public static void main(String[] args) throws IOException {
	ByteArrayInputStream arrayinput=new ByteArrayInputStream("staffsupport".getBytes());
	PushbackInputStream  pushinput=new PushbackInputStream(arrayinput);
	int ch=0;
	while((ch=pushinput.read())!=-1){
		if((char) ch=='s') {
			pushinput.unread('S');
		}else {
			System.out.println((char)ch);
		}
		
	}
	
}
}
