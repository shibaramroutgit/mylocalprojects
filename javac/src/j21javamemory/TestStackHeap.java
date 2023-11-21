package j21javamemory;

public class TestStackHeap {
	
	
	public static  void methodOne()
    {
         System.out.println("From Method One-2");
         methodTwo();
    }

    static void methodTwo()
    {
         System.out.println("From Method Two-3");
    }

    public static void main(String[] args)
    {
         System.out.println("Main Method Started-1");
         methodOne();
         System.out.println("Main Method Ended-4");
    }
    
    
    // Stack Memory is use to store the execution points where Heap memory store the objects
    //Above Program Execution Sequence 
    // Step1 Stack verify class load into Heap Memory or not, if yes (If No wait load by compiler load in heap memory)
    // Step2 Stack memory add Main() method point and Heap memory load all static members
    // Step3 Stack memory creates object if it present and add those object details into Heap memory
    // Step4 on above stack execute LIne 19 to do it load the methods into stack and necessary data on Heap
    // Step5 after execute print the message and remove the points from stack and heap memory related data
    // Step6 Execute Line 20 then add this method into stack and related data on heap memory
    // Step7 Inside method call , another methods call present then it load into stack and related data on healp
    // Step8 MethodTwo added into stack and heap memory Line 9
    // Step9 After execution 2 , control move to MethodOne there is no line
    // Step10 execute the Line 21
    //Step 11 Stack memory release and heap memory release 
    

}
