package LeetCode;

import java.util.Arrays;

// This way to Print Array
//public class TwoSum {
//	public static void main(String[] args) 
//	{
//		int [] a  = {1,3,5,7,9};
//	    int target = 8;
//	    int [] result = twosum(a,target);
//	    System.out.println(Arrays.toString(result));
//	}
//	
//    
//    public static int[] twosum(int arr[],int target)
//    {
//    	for(int i=0;i<arr.length;i++)
//    	{
//    		if(arr[i]+arr[i+1]==target)
//    		{
//    			return new int[] {arr[i],arr[i+1]}; 
//    		}
//    	}
//		return null;
//    	
//    }
//}


// This is Another to Print Array Index Value
public class TwoSum {
	public static void main(String[] args) 
	{
		int [] a  = {1,3,5,7,9};
	    int target = 8;
	    
	   int result [] =  twosum(a,target);
	   System.out.println(result[0]+" "+result[1]);
	}
	
    
    public static int [] twosum(int arr[],int target)
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]+arr[i+1]==target)
    		{
    			int b []= new int [2];
    			b[0] = i;
    			b[1] = i+1;
    			return (b); 
    		}
    	}
		return null;
    	    }
}
