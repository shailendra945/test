package com.code.prac;

public class FindMissingNumber {
	
	public static void main(String[] args) {
		findingMissingNumber(new int[] {1,2,4,6});
	}
	
	public static void findingMissingNumber(int [] numArray) {
		
		if(numArray!=null) {
			boolean [] mark=new boolean[numArray[numArray.length-1]];
			for(int i=0;i<=numArray.length-1;i++)
			{
				System.out.println("value ="+ i +" : "+numArray[i]);
				if((i+1)==numArray[i])
				{
					mark[i]=true;
					System.out.println("value ="+ i +" : "+numArray[i]+"mark[i] :"+mark[i]);
				}
			}
			for(int i=0;i<mark.length;i++)
			{
				if(false==mark[i])
				{
					System.out.println(i);
				}
				
			}
			
		}
		
		
	}
	

}
