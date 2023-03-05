package FileIO12;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;

import javax.imageio.ImageIO;

public class FileIO12 {
	public static void main(String args[]) throws Exception{
	      BufferedImage bImage = ImageIO.read(new File("/Users/lavanya/Downloads/sample.jpg"));
	      ByteArrayOutputStream bos = new ByteArrayOutputStream();
	      ImageIO.write(bImage, "jpg", bos );
	      byte [] data = bos.toByteArray();
	      ByteArrayInputStream bis = new ByteArrayInputStream(data);
	      BufferedImage bImage2 = ImageIO.read(bis);
	      ImageIO.write(bImage2, "jpg", new File("output.jpg") );
	      System.out.println("image created");
	   }
	}

