package j11arrays;

public class j06MultidimensionalArrays {

	public static void main(String[] args) {
		
		//Example -1
		
		int[] e1 = {1, 2, 3};   //One Dimensional Array
        int[] e2 = {4, 5, 6};   //One Dimensional Array
        int[] e3 = {7, 8, 9};   //One Dimensional Array
        
        int [][] towdarray = {e1,e2,e3};
        
        
        
        for(int i=0;i<towdarray.length;i++)
        {
        	for(int j = 0;j<towdarray[i].length;j++)
        	{
        		System.out.print(towdarray[i][j]+ "\t");
        	}
        	System.out.println();
        }
        
        
       // Example - 2
        
        int [][] d2a = new int [4][4];  // First 4 is row and Second 4 is column
        int val=1;
        for(int i=0;i<4;i++) // Row 4
        {
        	for(int j = 0;j<4;j++) // column 
        	{
        		d2a[i][j]=val;
        		val++;
        	}
        }
        System.out.println("################");
        for(int i=0;i<4;i++) // Row 4
        {
        	for(int j = 0;j<4;j++) // column 
        	{
        		System.out.print(d2a[i][j]+"\t");
        	}
        	System.out.println();
        }
        
        
	}

}
