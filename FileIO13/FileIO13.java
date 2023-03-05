package FileIO13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIO13 {
public static void main(String[] args) throws IOException {
	String line=null;
	FileReader fileReader = new FileReader("FileRead.txt");
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    
    while((line = bufferedReader.readLine()) != null)
    {
        System.out.println(line);
    }
    
 bufferedReader.close();
}
}
