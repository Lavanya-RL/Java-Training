package FactoryPattern;

abstract class ShoeShop implements ShoeSeller{
	private ShoeFactory factory;
	public void setFactory(ShoeFactory factory) {
		this.factory=factory;
	}
	public ShoeFactory getFactory() {
		return this.factory;
	}
	public abstract Shoe sellShoe();
}