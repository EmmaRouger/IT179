/*file name: PhoneContactList.java 
 * 
 *programmer: Emma Rouger
 *
 *Course: IT179 sec 03
 *
 *date: 20 fev. 2020
 */

import java.util.ArrayList;

/**
 * 
 * make all the action of a contact list
 *
 * @author erouger
 *
 */

public class PhoneContactList
{
	//data field
	private ArrayList<ContactEntry> thePhoneList = new ArrayList<>();

	//methods
	/**
	 * check if the name is already in the list, if so the number will be change. If the name isn't in the list,
	 * the contact will be added.
	 * @param aName the name to check
	 * @param newNumber the number
	 * @return the old number or null if the contact was added
	 */
	public String addOrChangeEntry(String aName, String newNumber)
	{
		
		String retVal = null;
		int i = 0;
		while(i<thePhoneList.size()&& !thePhoneList.get(i).getName().equals(aName))
		{
			i++;
		}
		if (i>=thePhoneList.size())
		{
			ContactEntry c = new ContactEntry (aName, newNumber);
			thePhoneList.add(c);
		}
		else
		{
			retVal =thePhoneList.get(i).getNumber();
			thePhoneList.get(i).setNumber(newNumber);
		}
		return retVal;
	}
	/**
	 * remove the contact from the list
	 * @param aName
	 * @return the contact that has been deleted
	 */
	public ContactEntry removeEntry(String aName)
	{
		ContactEntry retVal = null;
		int i=0;
		while (i<thePhoneList.size()&& !thePhoneList.get(i).getName().equals(aName))
		{
			i++;
		}
		if(i<thePhoneList.size())
		{
			retVal = thePhoneList.get(i);
			thePhoneList.remove(thePhoneList.get(i));
		}
		return retVal;
	}
	
	/**
	 * search a number thanks to a given name
	 * @param aName the name of the search
	 * @return the number of the contact list
	 */
	public String searchNumber(String aName)
	{
		int i =0;
		while (i<thePhoneList.size()&&!thePhoneList.get(i).getName().equals(aName))
		{
			i++;
		}
		String retVal="Entry: "+aName+"; not found in the phone contact list";
		if(i<thePhoneList.size())
		{
			retVal = thePhoneList.get(i).getName()+"'s phone number is "+thePhoneList.get(i).getNumber();
		}
		return retVal;
	}
	
	/**
	 * @return the output of the list
	 */
	public String toString()
	{
		String retVal ="\nCurrent Phone List:\n";
		for (int i =0; i<thePhoneList.size();i++)
		{
			retVal = retVal+"   "+thePhoneList.get(i).toString() +"\n";
		}
		return retVal;
	}
	
	
	
	
	
}