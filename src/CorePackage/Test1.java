package CorePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Test1 {
	//Start with A in the array list 
		
		@Test
		public void  streamFilter() 
		{
			ArrayList<String> names=new ArrayList<String>();
			names.add("Anju");
			names.add("Anjuman");
			names.add("Don");
			names.add("Donmarry");
			names.add("Ramson");

			long c=names.stream().filter(s->s.startsWith("A")).count();
			System.out.println(c);
			
			
		   }
	
		  @Test
		  
		  public void removeName() 
		  
		  {
			  ArrayList<String> names=new ArrayList<String>();
				names.add("Adam");
				names.add("Amit");
				names.add("Don");
				names.add("Donmarry");
				names.add("Ramson");

			  
			  names.removeIf(name -> name.equals("Amit"));
		      for (String name : names) {
		            System.out.println(name);
		      
		      }
			  
	 }
		  
		//Print the names which have last letter as "a" with Uppercase
		
		@Test
		
		public void StreamMap() 
		{
			Stream.of("sita","Durga","Don","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			.forEach(s->System.out.println(s));
			
			
		}
		@Test
		
		public void lengthOfArray() 
		{
			ArrayList<String> names=new ArrayList<String>();
			names.add("god");
			names.add("given");
			names.add("happy");
			names.add("Life");

			
			// print all the names for the array list length greater > 2
			names.stream().filter(s->s.length()>0).forEach(s->System.out.println(s));
		            
		   }
		
		
		@Test
		
		public void reverseTheString() 
		
		{
			String s = "abcde";
	        
	        // Lambda expression to reverse a string
	        Function<String, String> reverseString = str -> {
	            StringBuilder sb = new StringBuilder(str);
	            return sb.reverse().toString();
	        };

	        // Test the lambda expression
	        String reversedString = reverseString.apply(s);
	        System.out.println("Original string: " + s);
	        System.out.println("Reversed string: " + reversedString);
	    }
		
           @Test
		
		public void reverseTheInteger() 
		
		{
	       int a = 123456;

     // Lambda expression to reverse an integer
         Function<Integer, Integer> reverseInteger = num -> {
         String numStr = Integer.toString(num);
         String reversedStr = new StringBuilder(numStr).reverse().toString();
         return Integer.parseInt(reversedStr);
     };

     // Test the lambda expression
     int reversedInteger = reverseInteger.apply(a);
     System.out.println("Original integer: " + a);
     System.out.println("Reversed integer: " + reversedInteger);
 
		
		}
           
           @Test
          
           public void addIntInString()
           {
        	   String a = "der5fr6uyi7";

               // Lambda expression to extract integers from a string and calculate the sum
               int sum = Arrays.stream(a.split("\\D+")) // Split the string by non-digit characters
                               .filter(s -> !s.isEmpty()) // Filter out empty strings
                               .mapToInt(Integer::parseInt) // Convert strings to integers
                               .sum(); // Calculate the sum

               // Print the sum
               System.out.println("Sum of integers extracted from the string: " + sum);
           }
           @Test
           
           public void removeDuplicateChar() {
           String s = "abcdefabcdef";

           // Remove duplicate characters using lambda expressions and Java streams
           String result = s.chars() // Convert the string to IntStream of characters
                   .distinct() // Remove duplicates
                   .mapToObj(c -> String.valueOf((char) c)) // Convert each character back to String
                   .collect(Collectors.joining()); // Collect the characters and join them into a string

           // Print the result
           System.out.println("String after removing duplicate characters: " + result);
       }
           
           
       }
           

           
   
   
       
           



       
   

	
		
	
		
		




