package CommandPattern;

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