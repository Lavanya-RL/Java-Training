package FileIO11;
import java.io.File;

public class FileIO11 {
public void Filename(File[] file,int i,int lvl) {
	if(i==file.length) {
		return;
	}
	if(file[i].isFile()) {
		System.out.println(file[i].getName());
	}
	Filename(file,i+1,lvl);
}
public static void main(String[] args) {
	String path="/Users/lavanya";
	File fileobj=new File(path);
	FileIO11 filename=new FileIO11();
	if(fileobj.exists() && fileobj.isDirectory()) {
		File file[]=fileobj.listFiles();
		System.out.println("Displaying Files :"+fileobj);
		filename.Filename(file, 0, 0);
	}
}
}
