package FactoryPattern;

import java.io.FileInputStream;
import java.util.Properties;

class Framework{
	public static ShoeShop getShop()throws Exception {
		Properties prop=new Properties();
		prop.load(new FileInputStream("config.properties"));
		String factoryclassname=prop.getProperty("factory");
		String shopclassname=prop.getProperty("shop");
		
		ShoeFactory factory=(ShoeFactory)Class.forName(factoryclassname).newInstance();
		ShoeShop shop=(ShoeShop)Class.forName(shopclassname).newInstance();
		shop.setFactory(factory);
		return shop;
	}
}