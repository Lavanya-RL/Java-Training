package FileIO8;

import java.util.Scanner;

public class FileIO8 {
	public static void main(String[] args) {
		try(Scanner scanner=new Scanner(System.in)) {
			
			int count=0;
			while(scanner.hasNext()) {
				String line=scanner.nextLine();
				count+=line.length();
				System.out.println(count);
			}
			
			
		}

	}

}

