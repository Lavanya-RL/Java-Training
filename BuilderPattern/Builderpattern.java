package BuilderPattern;
public class Builderpattern {
	public static void main(String[] args) {
		Computer mycomputer= new Computer.BuildComputer().setMotherBoard("intel...mb").
				setRam("700gb ram").setHarddisk("10000 tb").
				setSsd("2million tb ssd hd").build();
		System.out.println(mycomputer);
	}
}

	

