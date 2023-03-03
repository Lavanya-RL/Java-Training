package FactoryPattern;
import java.io.FileInputStream;
import java.util.Properties;
public class FactoryPattern {
public static void main(String[] args)throws Exception {
		
		ShoeShop shop=Framework.getShop();
		System.out.println(shop.sellShoe());
		}
}










