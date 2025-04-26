/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class Main 
{
  public static void main(String[] args) 
	{
    // Test default constructor
    DACArecipient recipient = new DACArecipient();
    System.out.println(recipient.printCard());

    System.out.println();

    // Test full constructor
    DACArecipient recipient2 = new DACArecipient("Smith", "John", "A123456789", "Mexico", 2452006, 2460421, 2461212, 'M');
    System.out.println(recipient2.printCard());
  }
}