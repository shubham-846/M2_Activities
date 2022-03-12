import java.util.*;

import javax.lang.model.util.ElementScanner14;

import java.io.*;

class activity4
{  
	 public static void main(String args[])
     {  
	Scanner sc= new Scanner(System.in);

   System.out.println("Enter player 1 name");
   String s1=sc.nextLine();  
   System.out.println("Enter player 2 name");
   String s2=sc.nextLine();
   String[] arr1=s1.split(" ");
   String[] arr2=s2.split(" ");
   String name=arr1[1];
   String name1=arr2[1];
   {
     if(name.equals(name1))
	    {
	    System.out.println(" Yes, they have the same last name ");
       }
      else
      {
         System.out.println(" No, they don't have the same last name ");
      }
     }


   }
}