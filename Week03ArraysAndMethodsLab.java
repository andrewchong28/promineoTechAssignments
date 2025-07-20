//
// Copyright (c) 2023 Promineo Tech///
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week3;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		     //int[] newArray = new int[6];
		     //newArray[0] = 1;
		     //newArray[1] = 5;
		     //newArray[2] = 2;
		     //newArray[3] = 8;
		     //newArray[4] = 13;
		     //newArray[5] = 6;
		      
		       //or
		
		int[] array = {1, 5, 2, 8, 13, 6,-3};

		
		// 2. Print out the first element in the array
		System.out.println(array[0]);
	
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(array[array.length - 1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println(array[6]); //this will crash
		
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println(array[-1]); //this will crash
			
		// 6. Write a traditional for loop that prints out each element in the array
	       for(int i = 0; i < array.length; i++) { // iterates entire array with for loop. array.lenght()shows how many int objects in array
	    	   System.out.println(array[i]);// 6 objects in array, array will increment as long as i is less than 6.-( i starts at 0; i < 6; i increments by 1)
	       }
			
		// 7. Write an enhanced for loop that prints out each element in the array

		   for (int number : array) {// (for each number : in array). one iteration for each element in array.
			   System.out.println(number);// then print number to console
		   }
		// 8. Create a new variable called sum, write a loop that adds each element in the array to the sum
           double sum = 0; /// start at 0 at loop
           for(int number : array) { //( iterate for each number : in array)
           	sum += number;         // += adds value to the left variable. on each iteration number variable is being added to the sum variable  
           }                       //loop 1 = sum is 0; 1st number in array is 1; now sum is 1, 2nd loop sum is 1 and 2nd number in loop is 5 so now sum is 6.
           System.out.println(sum);
			
		// 9. Create a new variable called average and assign the average value of the array to it
           System.out.println("Average value of array");
           
            double average = sum / array.length;
            System.out.println(average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
            for(int number : array) {
            	if (number % 2 != 0) {// if the number is divisble by 2 then even. != 0(does not equal) this gives odd
            		System.out.println(number);
            	} 
            }

		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
            String[] arrayNames = {"Sam", "Sally", "Thomas", "Robert"};

		
		// 12. Calculate the sum of all the letters in the new array
               int sumLetter = 0;
               for(String tooforfive : arrayNames) {//String name variable represents each object in array, it could be String tooforfive - name of your choosing
            	   sumLetter += tooforfive.length();
               }
		       System.out.println(sum);

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		       greetingHello("Tom");  //Invoking - need method name then value
 
		  
	            
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
              System.out.println(greetingHello2("Sally")); 
              
              //or create a variable to store invoking the method
              String greeting = greetingHello2("Sally2");
              System.out.println(greeting);
            
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
        //                13 is void return type that returns nothing even though creaing String name variable. Doing a print int method and invoking method performs action print to console
        //                 14 is method return type String. creating a name variable and the body of method doring a return of the variable
        //                          need to do pring when invoking the method = System.out.println(greetingHello2("Sally"))
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
              
         	 String word = "test";
			 int number = 10;
			 System.out.println(isStringLongerThanNumber(word,number));
	         
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
         System.out.println(doesArrayContainString(arrayNames ,"Sally"));
         // grabbing arrayNames from above and using it as values to pass to array in method doesArrayContainString
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
          System.out.println(GetSmallestNumberInArray(array));
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		  double [] doubles = {45.7, 30.2, 67.3};
		  System.out.println( calculateAverage(doubles));
		  

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		  //int[] namelenths = exactStringLengths(names));
		  //for(int number : namelengths[] {
			 // System.out.println(number);
		  //})
 

 // 1st create a new int array that has the same lenght of the string array
 // 
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
	 System.out.println(hasMoreEvenwordCharacters(arrayNames));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		
		System.out.println(isPalindrome("mom"));
	}
	

	
	// Method 13:
    public static void greetingHello (String name){
 	   System.out.println("Hello "+ name + "!");
    }

	// Method 14:
    public static String greetingHello2 (String name) {
    	return "Hi "+ name + "!";
    }
	
	// Method 15:
	 public static boolean isStringLongerThanNumber (String string, int number) {// DO NOT NEED TO MATCH RETURN TYPE:parameters of method (String string, int number) do not need to be boolean - return type
        return string.length() > number;
	 }
	
	// Method 16:
	    public static boolean doesArrayContainString (String[] array, String string) {//REMEMBER: Parameters and return type do not need to match
	    	for (String str : array) {
	    		if(str.equals(string)) { //using method equals to see if value in String str is equal to string variable
	    			return true;
	    		}
	    	}
	    	return false;
	    }
	    
        
	// Method 17:

	      public static int GetSmallestNumberInArray(int[] arrayInt) {
	    	   int smallest = arrayInt[0]; // variable smallest is set at first number in array which should be smallest
	    			   for(int number : arrayInt) {// for every int number in arrayInt
	    				   if (number < smallest) {// if that number is smaller than the smallest first number in array
	    					   smallest = number;// then change smallest to that number
	    			     }
	                  }
	    	        return smallest;
	      }
	// Method 18:
       public static double calculateAverage(double [] array) {
    	   double sum = 0;
    	   for(double number : array) {
    		   sum += number;
    	   }
    	   return sum / array.length;
    	    
       }
	
	// Method 19:

		  //only one paramterer and is the input = array of strings
		  //returns and array of int
		  //output is the int from the return
//public static int[] extractStringLengths(String[] strings) {
	// int[] results = new int[strings.length]; 
	 //for (i=0; i < strings.length; i++) {
		 //results[i] = strings[i].length()
	 //}
	 //return(results);
	
	// Method 20:
	public static boolean hasMoreEvenwordCharacters(String[] array) {
		int evenLetters = 0;
		int oddLetters = 0;
		
		for(String string: array) {
			if(string.length() % 2 == 0) {
				evenLetters += string.length();
				
			}else {
				oddLetters += string.length();
			}
		}return evenLetters > oddLetters;
	}
	
	// Method 21:
	public static boolean isPalindrome(String string) {
		//racecar, mom, wow
		for(int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1 )) {
				return false;
			}
		} 
		return true;
	}
	

}