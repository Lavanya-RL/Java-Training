package FileIO14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileIO14 {
   public static void main(String[] args) throws IOException {
       File source = new File("FileSource.txt");
      File destination = new File("FileDestination.txt");
      FileInputStream inputStream = new FileInputStream(source);
      FileOutputStream outputStream = new FileOutputStream(destination);
      int length = (int) source.length();
      byte[] buffer = new byte[length];
      while ((length = inputStream.read(buffer)) > 0) {
         outputStream.write(buffer, 0, length);
      }
      inputStream.close();
      outputStream.close();
      System.out.println("File copied successfully.......");
   }
}
