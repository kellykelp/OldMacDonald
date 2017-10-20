class Cow implements Animal//implements Animal 
{     
	protected String myType;
	protected String mySound;
	public Cow(String type, String sound)
	{
		myType = type; 
		mySound = sound;
	}

	public Cow()
	{
		myType = "unknown";
		mySound = "unknown";
	}
	public String getSound() {return mySound;}
	public String getType() {return myType;}
	// public void setSound(String s) {mySound = s;}
	// public void setType(String t) {myType = t;}
		// CONSTRUCTORS ARE NOT INHERITED IN EXTENDED CLASS
}
