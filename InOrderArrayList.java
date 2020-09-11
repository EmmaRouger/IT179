/*file name: InOrderArrayList.java 
 * 
 *programmer: Emma Rouger
 *
 *Course: IT179 sec 03
 *
 *date: 20 mar. 2020
 */

import myutil.TheArrayList;

/**
 * 
 * Implementation of an order ArrayList using theArrayList class 
 *
 * @author erouger
 *
 */
public class InOrderArrayList<E extends Comparable<E>> {
	
	private TheArrayList<E> theData;
	
	public InOrderArrayList() {
		theData= new TheArrayList<E>();
	}
	
	public void addOrder(E obj)
	{
		if (theData.size()==0)
		{
			theData.add(obj);
		}
		else
		{
			int i=0;
			while(obj.compareTo(theData.get(i))>0&&i<theData.size()-1)
			{
				i++;
			}
			if(i==theData.size())
			{
				theData.add(obj);
			}
			else
			{
				theData.add(i, obj);
			}
			
		}
	}
	
	public E get(int index)
	{
		return theData.get(index);
	}
	
	public boolean removeOrder(E obj)
	{
		boolean remove;
		int i=0;
		while(theData.get(i).compareTo(obj)!=0&&i<theData.size()-1)
		{
			i++;
		}
		if(theData.size()==0||i==theData.size())
		{
			remove=false;
		}
		else
		{
			theData.remove(i);
			remove=true;
		}
		return remove;
	}
	
	public int size()
	{
		return theData.size();
	}
	
	public E max()
	{
		return theData.getLast();
	}
	
	public E min()
	{
		return theData.getFirst();
	}
	
	public String toString()
	{
		return theData.toString();
	}

}
