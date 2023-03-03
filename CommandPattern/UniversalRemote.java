package CommandPattern;

class UniversalRemote{
	Command c[]=new Command[5];
	public void executeCommand(int slot) {
		c[slot].execute();
	}
	public void assignCommand(int slot,Command command) {
		c[slot]=command;
	}
}