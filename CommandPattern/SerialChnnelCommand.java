package CommandPattern;

class SerialChannelCommand extends Command{
	public SerialChannelCommand(Tv tv, SetTopBox sbox) {
		super(tv,sbox);
	}
	@Override
	public void execute() {
		System.out.println("the serial channel process started...");
		tv.av2();
		sbox.serialChannel();
				
		System.out.println("enjoy the saas bahu serial channel....");
	}
}