package FactoryPattern;

class LakhaniShoeFactory extends ShoeFactory{
	@Override
	public Shoe makeShoe() {
		return new Sportshoe();
	}
}