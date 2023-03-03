package CommandPattern;

class NewsChannelCommand extends Command{
	public NewsChannelCommand(Tv tv, SetTopBox sbox ) {
		super(tv,sbox);
	}
	@Override
	public void execute() {
		System.out.println("the news channel process started...");
		tv.av1();
		sbox.newChannel();
		System.out.println("enjoy the news channel....");
	}
}
