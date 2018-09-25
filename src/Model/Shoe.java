package Model;

public class Shoe 
{
	//Declaration section
	//Data member section
	//Also called instance variables
	//These are special - they get a "default" value
	//All numbers => 0
	//boolean => false
	//Objects => null!!!
	private String Shoename;
	private String color;
	private double ShoeSize;
	private boolean hasLaces;
	
	/**
	 * Default constructor for after the fact customization.
	 * AKA I don't know the info yet about the Shoe.
	 */
	public Shoe()
	{
		this.Shoename = "Nike";
		this.color = "blue";
		this.ShoeSize = 9.5;
		this.hasLaces = false;
		
	}
	
	/**
	 * Better constructor when i know information for the run object
	 * @param Shoename
	 */
	public String getShoename()
	{
		return Shoename;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public double getShoeSize()
	{
		return ShoeSize;
	}
	
	public boolean getHasLaces()
	{
		return hasLaces;
	}
	
	public void setShoename(String Shoename)
	{
		this.Shoename = Shoename;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setShoeSize(double Shoesize)
	{
		this.ShoeSize = Shoesize;
	}
	
	public void setHasLaces(boolean hasLaces)
	{
		this.hasLaces = hasLaces;
	}

}