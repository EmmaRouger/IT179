/*file name: ContactEntry.java 
 * 
 *programmer: Emma Rouger
 *
 *Course: IT179 sec 03
 *
 *date: 20 fev. 2020
 */

/**
 * 
 * Information of a contact 
 *
 * @author erouger
 *
 */
public class ContactEntry
{
	// DataField
	private final String name;
	private String number;
	
	// Constructor
	/**
	 * Constructor
	 * @param name
	 * @param number
	 */
	public ContactEntry(String name, String number)
	{
		this.name=name;
		this.number=number;
	}
	
	//methods
	/**
	 * get the number
	 * @return number
	 */
	public String getNumber()
	{
		return number;
	}
	/**
	 * set the number
	 * @param number to set
	 */
	public void setNumber(String number)
	{
		this.number = number;
	}
	/**
	 * get the name
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	
	@Override 
	public String toString()
	{
		return name+": "+number;
	}

	@Override
	public boolean equals(Object obj)
	{
		boolean retVal = false;
		
		if (obj instanceof ContactEntry) {
			ContactEntry c = (ContactEntry) obj;
			retVal = c.name.equals(this.name);
		}
		return retVal;
	}

	@Override
	public int hashCode()
	{
		// TODO Auto-generated method stub
		return this.name.hashCode();
	}
	
	
	
	
	
	
	
}