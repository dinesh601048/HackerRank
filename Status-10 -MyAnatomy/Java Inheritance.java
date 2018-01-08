
//Java Inheritance I

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal{
	void walk()
	{
		System.out.println("I am walking");
	}
}


class Bird extends Animal
{
	void fly()
	{
		System.out.println("I am flying");
	}
    void sing()
	{
		System.out.println("I am singing");
	}
    
}


public class Solution{

   public static void main(String args[]){

	  Bird bird = new Bird();
	  bird.walk();
	  bird.fly();
      bird.sing();
	
   }
}







//Java Inheritance II

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



//Write your code here
class Arithmetic
{
    int add(int a,int b)
    {
        return a+b;
    }
}

class Adder extends Arithmetic{
    
}


public class Solution{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}