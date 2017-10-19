class Chick implements Animal//implements Animal 
{     
	private String myType;
	private String mySound;
	public Chick(String type, String sound)
	{
		myType = type; 
		mySound = sound;
	}

	public Chick(String type, String sound1, String sound2)
	{
		myType = type;
		double rand = Math.random();
		if (rand < 0.5)
			mySound = sound1;
		else
			mySound = sound2; 
	}
	public Chick()
	{
		myType = "unknown";
		mySound = "unknown";
	}
	public String getSound() {return mySound;}
	public String getType() {return myType;}
}
