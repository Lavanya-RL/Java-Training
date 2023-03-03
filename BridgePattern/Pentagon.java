package BridgePattern;

public class Pentagon  extends Shape{

	public Pentagon(Color c) {
		super(c);
		
	}

	@Override
	public void applyColor() {
		System.out.print("Pentagon in color ");
		color.applyColor();
		
	}

}
