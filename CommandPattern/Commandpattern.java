package CommandPattern;
public class Commandpattern {
	public static void main(String[] args) {
		UniversalRemote genie=new UniversalRemote();
		
		Tv tv=new Tv();
		SetTopBox sbox=new SetTopBox();
		Command newscommand=new NewsChannelCommand(tv, sbox);
		Command serialcommand=new SerialChannelCommand(tv, sbox);
		genie.assignCommand(2, newscommand);
		genie.assignCommand(3, serialcommand);
		
		genie.executeCommand(2);
	}
}
class UniversalRemote{
	Command c[]=new Command[5];
	
	
	public void executeCommand(int slot) {
		c[slot].execute();
	}
	
	public void assignCommand(int slot,Command command) {
		c[slot]=command;
	}
}
abstract class Command{
	Tv tv;SetTopBox sbox;
	public Command() {
		
	}
	
	public Command(Tv tv, SetTopBox sbox) {
		this.tv = tv;
		this.sbox = sbox;
		
	}
	public abstract void execute();
}
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
class SerialChannelCommand extends Command{
	public SerialChannelCommand(Tv tv, SetTopBox sbox) {
		super(tv,sbox);
	}
	@Override
	public void execute() {
		System.out.println("the serial channel process started...");
		tv.av1();
		sbox.serialChannel();
				
		System.out.println("enjoy the saas bahu serial channel....");
	}
}

class Tv{
	public void av1() {
		System.out.println("av1 mode...");
	}
	public void av2() {
		System.out.println("av2 mode...");
	}
}
class SetTopBox{
	public void newChannel() {
		System.out.println("news channel...");
	}
	public void serialChannel() {
		System.out.println("mamiyar marumaga serial channel...");
	}
}



