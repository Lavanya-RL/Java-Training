package ExceptionHandling6;
class Man {
	
	public Man(String name) throws Exception{
		if(name.equals("Hari")) {
			throw new Exception("Name is invalid");
		}
	}
}
