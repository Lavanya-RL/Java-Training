package FileIO10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileIO {
	

	public static void main(String[] args) throws FileNotFoundException {
		
			File f1=new File ("File1.txt");
			File  f2=new File ("FileRead.txt");
			boolean b=f1.renameTo(f2);
			boolean b1=f2.delete();
			int size=(int) f2.length();
			System.out.println(b);
			System.out.println(b1);
			System.out.println(size);
}
}

