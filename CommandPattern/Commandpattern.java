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






