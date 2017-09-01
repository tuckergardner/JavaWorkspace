package marshMonster.model;

public class Marsh 

{
private String name;
private double legs;
private int arms;
private boolean buttons;
private int eyes;

public Marsh()
{
	name = "";
	legs = 0.0;
	arms = 0;
	buttons = false;
	eyes = 0;
}
public Marsh(String name, double legs, int arms, boolean buttons, int eyes)
{
	this.name= name;
	this.legs = legs;
	this.arms = arms;
	this.buttons = buttons;
	this.eyes = eyes;
}
public String toString()
{
	String str = "this monster doesnt exsist";
			if (name != "")
			{
				str = "monsters name is "  + name + " he has " + legs + "legs, and " + arms +  " and " + eyes + " eyes.  ";
				if(buttons)
				{
					str = str + "	He has buttons.";
				}
				else
				{
					str = str + " He does not have buttons.";
				}
			}
			return str;
}
}


