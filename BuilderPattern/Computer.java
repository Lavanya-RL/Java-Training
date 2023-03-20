package BuilderPattern;

import BuilderPattern.Computer.BuildComputer;
import BuilderPattern.Computer.Cabinet;
class Computer{
	class Cabinet{ //cabinet as inner class for access from computer
			String motherboard,ram,harddisk,vgacard,ssd;
			public Cabinet(String motherboard,String ram,String harddisk,String vgacard,String ssd) {
				this.motherboard=motherboard;
				this.ram=ram;
				this.harddisk=harddisk;
				this.vgacard=vgacard;
				this.ssd=ssd;
			}
		public	String toString() {
			return "Cabinet [motherboard=" + motherboard + ", ram=" + ram + ", harddisk=" + harddisk + ", vgacard="
					+ vgacard + ", ssd=" + ssd + "]";
		}
		
	}
	Cabinet c;
	String brand;
	public Computer(BuildComputer bc) {//method to build computer
		c=new Cabinet(bc.motherboard,bc.ram,bc.harddisk,bc.vgacard,bc.ssd);
		brand="shoiabcomputer";
	}

	@Override
	public String toString() {
		return "Computer [c=" + c + ", brand=" + brand + "]";
	}
	static class BuildComputer{ //innerclass to buils computer 
		String motherboard,ram,harddisk,vgacard,ssd;
		public BuildComputer setMotherBoard(String motherboard) { //method for building product
			this.motherboard=motherboard;
			return this;
		}
		public BuildComputer setRam(String ram) {
			this.ram=ram;
			return this;
		}
		
		public BuildComputer setHarddisk(String harddisk) {
			this.harddisk = harddisk;
			return this;
		}
		public BuildComputer setVgacard(String vgacard) {
			this.vgacard = vgacard;
			return this;
		}
		public BuildComputer setSsd(String ssd) {
			this.ssd = ssd;
			return this;
		}
		
		public Computer build() { /// to build computer 
			return new Computer(this);
		}
	}
	}

