package basicStuffs;

import java.awt.Point;

public class Datatypesexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//integer datatype	- this can store form -2Billion to +2 billion integer values 	
int age = 34;
System.out.println("The integer is \n"+age);

//byte dataype - this can store from -127 to +127 - so for small value like age =18 we can use bytes 

byte myage = 33;
System.out.println("The byte number is \n"+myage);

//Short datatype - this can store from -32k to +32(32767k)
short years = 32767;
System.out.println("The short number is \n"+years);
 
//Long datatype - this can store if the number exceeds 2B, in the last L has to be used 
long largenumber = 10000000000000L;
System.out.println("This is large whole number is\n"+ largenumber);


//FLoat have capacity of 4 bytes, to store small decimal numbers we can use this
float mark = 95.5f;
System.out.println("This is floating number is\n"+ mark);

//Doube - To store large decimal numbers 
double largemark = 96769.97;
System.out.println("This is double number is\n"+largemark);

//boolean - to store true or false values
boolean present = true;
System.out.println("This is boolean value\n"+present);


//char - To store single alphabet - 2 bytes 
char grade = 'A';
System.out.println("This is character\n"+grade);

 





//primitive data type 

//Declaring 'a' value 
int a = 10;
//assigning a to b
int b=a;


//Updating 'a' value 
a = 5;

System.out.println("The a value now is "+a);
System.out.println("The b vlue now is "+b);

//========================reference data type

//Declaring 'p1' value 
Point p1 = new Point(5,10);
//assigning p1 to p2
Point p2 = p1;


//Updating 'p1' value 
p1.x = 50;
p1.y = 100;


System.out.println("The p1 value now is "+p1);
System.out.println("The p2 avlue now is "+p2);

 


}










		
		
	}


