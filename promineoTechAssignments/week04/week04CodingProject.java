package week04;

import java.time.LocalDate;
import java.time.DayOfWeek;
 

public class week04CodingProject {
	
/*********************************************************Enter methods below*****************************************************/		
//Method: subtract first and last element in array. //What is happening when method is called? ages[] array as example
  public static int subtractFirstAndLastElementInArray(int[] array) {// return type in, parameter array. when method is called ages[] array is passed into parameter
	int firstElementInArray = 0; // Created variable to hold first element
	int lastElementInArray = 0;   // Created variable to hold last element             
	for (int i = 0; i < array.length; i++) {// for loop - interate by 1 if i is less than length of array length (8 objects)
	      if (i == 0) {                      // if i equals position 0 then change variable firstElementinArray to that value
	      firstElementInArray = array[i]; // ages[0]: This happens on first iteraton
		}
	      if (i == array.length -1) { // if i equals last position (array length 8 - 1 = position 7)  then change variable lastElementinArray to that value
	      lastElementInArray = array[i]; // ages[7]: This happens on last iteration
	        }	     
	     }
	      return lastElementInArray - firstElementInArray; // when methods is called return the value of lastElementInArray minus firstElementInArray
	 }

//Method: Calculates and returns the sum of all elements in an int array:
    public static int sumValuesInIntArray (int[] n) {// return type int. parameter is an array of int[]
   	 int nTotal = 0; // variable to store the sum of elements of array passed in                 
   	 for (int numbers : n) { // enhanced loop for iterate through "numbers" in "n" array
   		 nTotal += numbers;  // on each loop number values from array are added to total 
   	 }
     return nTotal;          // returns the final total when method sumValuesInIntArray is invoked 
    }
    
//Method: Calculates and returns the sum of all elements in an int array:
    public static double sumValuesInDoubleArray (double[] n) {// return type double. parameter is an array of double[]
   	 double nTotal = 0.0; // variable to store the sum of elements of array passed in                 
   	 for (double numbers : n) { // enhanced loop for iterate through "numbers" in "n" array
   		 nTotal += numbers;  // on each loop number values from array are added to total 
   	 }
     return nTotal;          // returns the final total when method sumValuesInDoubleArray is invoked 
    }
    
//Method: Calculates and returns the total of all String element lengths in a String array
    public static int sumStringLengthsInArray (String[] array) { //int return type, parameter String[] array
     int stringLengths = 0;// variable to store sum of elements
     for(String string : array) {// enhanced loop to iterate through string array
    	 stringLengths += string.length();// length of strings is added to int variable stringLengths
        }
     return stringLengths; // return the total of string lengths when method is called
     }
   
	
 /*7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated 
    to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).*/ 
    
	 public static String stringConcatItself (String str, int n) {//return type is String. parameters str and n
		    String strTimesN = "";        // created string variable strTimesN to hold the value of String str
		    for(int i = 0; i < n; i++) {  // for loop to iterate by 1. number variable value will be passed to n parameter for the test condition
		    	strTimesN += str;       // every iteration will add the string from str to wordTimesN using the +=
		    }                            
		    return strTimesN;          // when method is called the return strTimesN 
	 }
	 
	 
/*8. Write a method that takes two Strings, firstName and lastName, and returns a full name*/	 
	 
	 public static String concatFirstLastName (String f, String l) {//method return type is string, parameters are string
		     return f + " " + l ; // returns the concatenated strings of variables passed in to parameters
	 }
	 
/* 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.*/	 
     public static boolean ifSumOfArrayGreaterThan100 (int[] n) {//method return type boolean, parameter int array. when method is called array from main gets passed in 
    	 int sumN = 0; //variable to store the sum of elements of array passed in 
    	 for (int numbers : n) {//enhanced for loop to iterate through elements in array( for numbers in n[] array)
    		  sumN += numbers;  // on each iteration add current number to total(sumN)
    	 }
    	 if (sumN > 100) {      //if statement returns true if total is greater than 100
    		 return true;
    	 } else {
    		 return false;
    	 }
     }
     
/* 10. Write a method that takes an array of double and returns the average of all the elements in the array.*/
 public static double averageOfAllElementsInArray(double array[]) { //method return type is double. parameter is double array.when method is called array from main gets passed in 
       double sumOfElements = 0;// created variable to hold the sum of values
       for(double values :  array) {//enhanced for loop to iterate through elements in array( for values in array[])
    	   sumOfElements += values;// += will add values to sumOfElements on each loop
       }
       return sumOfElements / array.length;// returns the average from sumOfElements/ the length of the array[] passed in when method is called
 }
	 

 /*11. Write a method that takes two arrays of double and returns true if the average of the elements 
 in the first array is greater than the average of the elements in the second array. */    
 public static boolean isAverageOf1stArrayGreaterThan2ndArray (double array1[], double array2[]) {// method return type is boolean, parameters are double arrays
       double sumArray1 = 0;// create variable to hold sum of array1
       double sumArray2 = 0;// create variable to hold sum of array2
       for(double values :  array1) {//enhanced for loop to iterate through values in array1 
    	   sumArray1 += values;      //add values to variable sumArray1
       }
       for(double values :  array2) {//enhanced for loop to iterate through values in array2
    	   sumArray2 += values;     //add values to variable sumArray2
       }
       return (sumArray1 / array1.length) > (sumArray2 / array2.length); // returns true if average of array1 is greater than array2

 }

 /* 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and  a double moneyInPocket, and returns 
 true if it is hot outside and if moneyInPocket is greater than 10.50.*/
 
 public static boolean willBuyDrink (boolean a, double b) { //return type boolean, two parameters of boolean and double
	  return  a == true && b > 10.50; // returns a boolean if both "a" is true and b is greater than 10.50	  
 }
 
 
 /*13 method*/
 public static void isItClassDay (DayOfWeek day) {///return type void because result is printing to console. Parameter is data type DayOfWeek 
	   if(day == DayOfWeek.THURSDAY) {//checking if day being passed in from parameter is thursday. DayOfWeek is an enumeration with 7 constants for days of the week. 
		   System.out.println("13.) Today is " + day + ". You have class today."); // if statement prints this if today is thursday
	   } else {
		   System.out.println("13.) Today is " + day + ". You don't have class today.");
	   }
 }
  	
	 
 
/*********************************************************Enter methods above*****************************************************/	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
/*1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.

a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  

b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  

i. Make sure that there are 9 elements of type int in this new array.  

ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 

iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths). 

c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.*/
		
/*-------------------------ages array----------------------------*/
System.out.println("1a. )ages array: ");
		   
//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		   
	// loop to print first and last element
	for (int i = 0; i < ages.length; i++) {// for loop - interate by 1 if i is less than length of array (8 objects)
	if (i == 0) {                      // if i equals position 0 then change variable firstElementinArray to that value
	System.out.println("    first element: " + (ages[i])); 
		}
		if (i == ages.length -1) { // if i equals last position (array length 8 - 1 = position 7)  then change variable lastElementinArray to that value
		System.out.println("    last element: " + (ages[i]));
		}	     
	 }
			
			   
	//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array
	//iii. Show that using the index values for the elements is dynamic - Refer to method subtractFirstAndLastElementinArray
	//Method: using method subtractFirstAndLastElementinArray
	System.out.println("    last element - first element = " + subtractFirstAndLastElementInArray(ages));
	System.out.println("    elements in array: " + ages.length);
	                 	 
/*-------------------------ages2 array----------------------------*/
System.out.println("1b. )ages2 array: ");
			   
// b. Create a new array of int called ages2 with 9 elements
	int[] ages2 ={15, 723, 4, 250, 98, 45, 0, 333, 5000};
			   
	// loop to print first and last element	      
	for (int i = 0; i < ages2.length; i++) {// for loop - interate by 1 if i is less than length of array(9 elements)
	if (i == 0) {   // if i equals position 0 then change variable firstElementinArray to that value
	System.out.println("    first element: " + (ages2[i]));
	}
		if (i == ages2.length -1) { // if i equals last position (array length 9 - 1 = position 8)  then change variable lastElementinArray to that value
		System.out.println("    last element: " + (ages2[i]));
		 }	     
	}
	             
				   
	//ii. Repeat the subtraction from Step 1 -  Refer to method subtractFirstAndLastElementinArray
	//iii. Show that using the index values for the elements is dynamic - Refer to method subtractFirstAndLastElementinArray
				   
	//Method: using method subtractFirstAndLastElementinArray   
	System.out.println("    last element - first element = " + subtractFirstAndLastElementInArray(ages2));	   
	System.out.println("    elements in array: " + ages2.length);
		  
/*2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”. */
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
          
        //Method sum string lengths in string array:
        System.out.println("Sum of name lengths check: " + sumStringLengthsInArray(names));

        //a. Use a loop to iterate through the array and calculate the average number
        double nameLengthTotal = 0; //double for average. created double variable to hold the value of the sum of the name lengths 
        for(String name : names) {  // enhanced loop - loops for each object in array names(6 objects)
            nameLengthTotal += name.length();// on each iteration += adds the length of each name to the nameLenghtTotal variable  
        }

        System.out.println("2a.)average number of letters per name: "+ nameLengthTotal + "/" + names.length + " = " + nameLengthTotal / names.length);
				  
       //b. Use a loop to iterate through the array again and concatenate all the
        String concatNames = " ";
        for(String name : names) {  // loops for each object in array names(6 objects)
            concatNames += name + " "; // on each iteration += adds the length of each name to the nameLenghtTotal variable  
         }
         System.out.println("2b.) loop and concat names with space: " + concatNames);
         
         
/*3. How do you access the last element of any array?
	      create a for loop for (int i = 0; i < ages2.length; i++) to interate through the array. In the body of array use  if (i == ages2.length -1) to say if i equals length of array -1.
	      if length of array is 9 then - 1 would be last position at 8 of array.*/
         
/* 4. How do you access the first element of any array?
	 	  create a for loop for (int i = 0; i < ages2.length; i++) to interate through the array. In the body of array use  if (i == 0) 
	      to say if i equals 0 then position 0 of array.*/
           
	 
/* 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array 
       and add the length of each name to the nameLengths array.*/
          
        System.out.println("5.) nameLengths array: "); 
          
        int[] nameLengths = new int[names.length]; //new int array
         
        for(int i = 0; i < names.length; i++ ) {// iterate by 1 if i < length of names array (6 objects)
            nameLengths[i] = names[i].length(); // on each loop nameLength is filled with value of the name length in names array
        }                                   // nameLengths[i] = names[i].length(); for example - on loop 3 is nameLengths[2] =  names[2].length();
                                            // nameLength(2) at position 2 of array is filled with name length of position 2 of names array
         //Check values in nameLengths array
               System.out.println("    name0 length = " + nameLengths[0] + " - " + names[0]);
               System.out.println("    name1 length = " + nameLengths[1] + " - " + names[1]);
               System.out.println("    name2 length = " + nameLengths[2] + " - " + names[2]);
               System.out.println("    name3 length = " + nameLengths[3] + " - " + names[3]);
               System.out.println("    name4 length = " + nameLengths[4] + " - " + names[4]);
               System.out.println("    name5 length = " + nameLengths[5] + " - " + names[5]);
         
         
/* 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
     Print the result to the console.*/
         
    int nameLengthSum = 0;                        // created variable to hold the total of the elements in nameLenghts array created in question 5
	for (int i = 0; i < nameLengths.length; i++) {// for loop to iterate by 1 over the nameLengths array. Exit condition: if i < than the length of array(6 Elements)
	     nameLengthSum += nameLengths[i];
		 }
	System.out.println("6.) Sum of all elements in nameLengths array: " + nameLengthSum);
				
/*7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated 
	     to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).*/
		  
	 String word = "pizza";
	 int number = 3;
	 System.out.println("7.) string concatenated to itself n number of times: " + stringConcatItself(word,number));
			 
/*8. Write a method that takes two Strings, firstName and lastName, and returns a full name
 (the full name should be the first and the last name as a String separated by a space).*/
		 
	String firstName = "Caesar";
	String lastName = "Littles";
	String fullName = concatFirstLastName(firstName, lastName) ;
	System.out.println("8.) take two strings and return fullName: " +fullName);
		 
	 
/* 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.*/
	//created method sumValuesInIntArray() to sum values in array with a data type of int
	//created method to sum the ifSumOfArrayGreaterThan100()
       
    int arrayOfInt[] = {34, 2, 37, 1, 9, 12, -16, 23, 17}; //when methods are called pass in array to method parameters

    System.out.println("9.) return boolean if arrayOfInt total " + sumValuesInIntArray(arrayOfInt) + " > 100: " + ifSumOfArrayGreaterThan100(arrayOfInt)); 
         
         
		  
/* 10. Write a method that takes an array of double and returns the average of all the elements in the array.*/
      // created method sumValuesInDoubleArray() to sum values in array with a data type of double
      // created method averageOfAllElementsInArray() to average the values in an array 
     double prices[] = {18.19, 25.02, 12.95, 9.99, 32.99, 14.99, 45.99, 36.42}; // when methods are called pass in array to method parameters
         
     System.out.println("10.) total of prices[] = " + sumValuesInDoubleArray(prices) + " and prices[] length = " + prices.length + ": average of prices = " + averageOfAllElementsInArray(prices));

/*11. Write a method that takes two arrays of double and returns true if the average of the elements 
      in the first array is greater than the average of the elements in the second array. */  
     //created method averageOfAllElementsInArray() to average the elements in a number based array
     //created method isAverageOf1stArrayGreaterThan2ndArray() to see if average of array1 > array2
     double prices2[] = {86.10, 10.99,5.99, 22.11, 70.02}; //when methods are called pass in array to method parameters
         
     System.out.println("11.) average of prices[] = " +  averageOfAllElementsInArray(prices) + " and average of prices2[] = " +  averageOfAllElementsInArray(prices2) + ". Is prices > prices 2: " + isAverageOf1stArrayGreaterThan2ndArray(prices,prices2)); 
 
         
/* 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and  a double moneyInPocket, and returns 
       true if it is hot outside and if moneyInPocket is greater than 10.50.*/
      // created method willBuyDrink() to check if boolean is true and double variable is greater than 10.50
      boolean isHotOutside = true;// variables to be passed to method parameter
      double moneyInPocket = 15.00;// variables to be passed to method parameter
           
      System.out.println("12.) " + willBuyDrink(isHotOutside,moneyInPocket));
                  

/* 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.*/
          
       //Method to check if today is Thursday and print messaging saying if I have class today or not.
       //Imported LocalDate and DayOfWeek classes
       LocalDate today = LocalDate.now();                   // uses LocalDate class data type and .now() method to get todays date
       DayOfWeek dayOfWeek = today.getDayOfWeek();          // uses DayOfWeek data type and method .getDayOfWeek() from today variable
       isItClassDay(dayOfWeek);// Call method and passing in dayOfWeek variable to method
   
   			
	}

}
