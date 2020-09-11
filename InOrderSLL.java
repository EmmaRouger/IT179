/*file name: InOrderSLL.java 
 * 
 *programmer: Emma Rouger
 *
 *Course: IT179 sec 03
 *
 *date: 20 mar. 2020
 */

import myutil.SLList;


/**
 * 
 * Implementation of the order SLL using the SLL class 
 *
 * @author erouger
 *
 */
public class InOrderSLL<E extends Comparable<E>> {
	
	SLList<E> theData;
	
	public InOrderSLL()
	{
		theData=new SLList<E>();
	}
	public void addOrder(E obj)
	{
		if(theData.size()==0)
		{
			theData.addFirst(obj);
		}
		else
		{
			int i=0;
			while(obj.compareTo(theData.get(i))<0&&i<theData.size()-1)
			{
				i++;
			}
			theData.add(i, obj);
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
