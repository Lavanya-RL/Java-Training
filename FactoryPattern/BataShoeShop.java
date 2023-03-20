package FactoryPattern;

class BataShoeShop extends ShoeShop{
	@Override
	public Shoe sellShoe() {
		
		System.out.println("shoemade");
		return getFactory().makeShoe();
	}
}