class NamedCow extends Cow 
{
	private String myName;
	public NamedCow(String type, String namee, String sound) 
	{
		myName = namee;
		myType = type;
		mySound = sound;
	}

	public NamedCow()
	{
		myName = "unknown";
		myType = "unknown";
		mySound = "unknown";
	}

	public String getName() {return myName;}	

}