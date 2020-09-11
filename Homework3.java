/*file name: Homework3.java 
 * 
 *programmer: Emma Rouger
 *
 *Course: IT179 sec 03
 *
 *date: 20 fev. 2020
 */
/**
 * IT179 - Homework 3 class
 *   Creates a PhoneContactList with five entries.
 *
 * Once you have coded the ContactEntry class and the PhoneContactList class
 * Compile and run the Homework3.java class
 *
 * Your output should look something like this:
  
     ---Homework 3 output----
     
     Current Phone List:
        Smith, Alice: 309-111 3333
        Lang, Lee: 309-222 4444
        Carr, John: 309-333 5555
        Hofman, Rita: 309-444 6666
        Lar, Tom: 309-555 7777
     
     Carr, John's phone number is 309-333 5555
     Rita's old phone number is 309-444 6666
     Removing a contact from the phone list
        Lang, Lee: 309-222 4444 has been removed
     Entry: Lang, Lee; not found in the phone contact list
     
     Current Phone List:
        Smith, Alice: 309-111 3333
        Carr, John: 309-333 5555
        Hofman, Rita: 309-444 9999
        Lar, Tom: 309-555 7777
     
     Removing entry that does not exit
     null
 
 --- finished ----

 */

public class Homework3 {

    public static void main(String[] args) {
        
        System.out.println("\n---Homework 3 output----");
        PhoneContactList myEntry = new PhoneContactList();

        /* Adding contacts to the list */
        myEntry.addOrChangeEntry("Smith, Alice", "309-111 3333");
        myEntry.addOrChangeEntry("Lang, Lee", "309-222 4444");
        myEntry.addOrChangeEntry("Carr, John", "309-333 5555");
        myEntry.addOrChangeEntry("Hofman, Rita", "309-444 6666");
        myEntry.addOrChangeEntry("Lar, Tom", "309-555 7777");
        
        /* print the current list*/
        System.out.println(myEntry.toString());
        /* search the phone number of Carr John*/
        System.out.println(myEntry.searchNumber("Carr, John"));
        /* change the number of Rita Hofman*/                   
        System.out.println("Rita's old phone number is " +
                           myEntry.addOrChangeEntry("Hofman, Rita", "309-444 9999"));
        /* remove a contact*/
        System.out.println("Removing a contact from the phone list");
        
        System.out.println("   "+myEntry.removeEntry("Lang, Lee") + " has been removed");
        /* search the number*/
        System.out.println(myEntry.searchNumber("Lang, Lee"));
        
        /* print the list*/
        System.out.println(myEntry.toString());
        
        /* try to remove a contact that does not exist*/
        System.out.println("Removing entry that does not exit");
        System.out.println(myEntry.removeEntry("Holms, Petter"));
        
        
        System.out.println("\n--- finished ----\n");
    }
}
