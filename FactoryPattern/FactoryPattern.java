package FactoryPattern;

import java.io.FileInputStream;
import java.util.Properties;

public class FactoryPattern {
public static void main(String[] args)throws Exception {
		
		ShoeShop shop=SpringFramework.getShop();
		System.out.println(shop.sellShoe(new Customer()));
		}
}

class SpringFramework{
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
interface ShoeManufacturer{
	public Shoe makeShoe();
}
interface ShoeSeller{
	public Shoe sellShoe(Customer customer);
}
abstract class ShoeFactory implements ShoeManufacturer{
	public abstract Shoe makeShoe();
}
abstract class Shoe{
	
}
abstract class ShoeShop implements ShoeSeller{
	private ShoeFactory factory;
	public void setFactory(ShoeFactory factory) {
		this.factory=factory;
	}
	public ShoeFactory getFactory() {
		return this.factory;
	}
	public abstract Shoe sellShoe(Customer customer);
}
class Customer{}
class BataShoeFactory extends ShoeFactory{
	@Override
	public Shoe makeShoe() {

		return new LeatherShoe();
	}
}
class LakhaniShoeFactory extends ShoeFactory{
	@Override
	public Shoe makeShoe() {
		
		return new SportsShoe();
	}
}
class AbdulShoeShop extends ShoeShop{
	@Override
	public Shoe sellShoe(Customer customer) {
		
		System.out.println("shoemade");
		return getFactory().makeShoe();
	}
}
class NavinShoeShop extends ShoeShop{
	@Override
	public Shoe sellShoe(Customer customer) {
		// TODO Auto-generated method stub
		return getFactory().makeShoe();
	}
}
class LeatherShoe extends Shoe{}
class SportsShoe extends Shoe{}


