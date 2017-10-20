// class NamedCow extends Cow 
// {
// 	private String myName, myType, mySound;
// 	public NamedCow(String type, String cowName, String sound) 
// 	{
// 		myName = cowName;
// 		myType = type;
// 		mySound = sound;
// 	}

// 	public String getName() 
// 	{
// 		return myName;
// 	}	

// 	public String getType() {return myType;}
// 	public String getSound() {return mySound;}

// }

class NamedCow extends Cow 
{
	private String myName;
	public NamedCow(String type, String cowName, String sound) 
	{
		myName = cowName;
		myType = type;
		mySound = sound;
	}

	public String getName() 
	{
		return myName;
	}	
}