package j11arrays;

import java.util.Arrays;

public class j07TestArraysClass {

	public static void main(String[] args) {
		
		//toString() override in Arrays Class to print of array 
		
        char[] ch = {'A', 'B', 'C', 'D', 'E'};
        System.out.println(Arrays.toString(ch));    
        
        
        int[] in = {10,11,12,13,14,15,17,17,18,19,20};
        System.out.println(Arrays.toString(in));
        
        double[] dl = {10.21,11.22,12.23,13.24,14.25,15.26,17.27,17.28,18.29,19.31,20.32};
        System.out.println(Arrays.toString(dl));
        
        boolean[] bln = {true, false, false, true};
        System.out.println(Arrays.toString(bln));     
 
        String[] str = {"java", "concepts", "Arrays", "methods"};
        System.out.println(Arrays.toString(str));  
        
        
        
      //sort()  in Arrays Class to sort the array - it is a overload method for all data type 
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        
        
        
      //binarySearch(Array, element) -- it return the index of element - Overload for all data type
       int x = Arrays.binarySearch(str,"methods" );
       System.out.println(x);
       
       
       //fill(array, default element value) -- Overload for all data type
       Arrays.fill(in, 55);
       System.out.println(Arrays.toString(in));
       
       
       
       //copyOf(Array, length)
       String[] str1 = Arrays.copyOf(str, str.length);
       System.out.println(Arrays.toString(str1));
        
       
       
       //copyOfRange(Source Array, Start Index, new Array Length)
       double [] dl1 = Arrays.copyOfRange(dl, 3, dl.length);
       System.out.println(Arrays.toString(dl1));
       
       
       
       //equals(Source Array, Destination Array)- return boolean 
       int[] in1 = {10,11,12,13,14,15,17,17,18,19,20};
       int[] in2 = {10,11,12,13,13,15,17,17,18,19,20};
       
       boolean b1=true;
      if (in1.length==in2.length)
      {
    	  for (int i=0;i<in1.length;i++)
    	  {
    		  if(in1[i]!=in2[i])
    		  {
    			  b1=false;
    		  }
    	  }
      }
      if (b1==true)
      {
    	  System.out.println(b1);
      }else
      {
    	  System.out.println(b1);
      }
       
    }
}



