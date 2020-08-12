package com.nt.Prat;

public class AP {
public static void main(String[] args) {
	 int arr[]={1, 2, 3, 1, 4, 5, 2, 3, 6};
	 
	 int k=3;
for(int i=0;i<=(arr.length)-3;i++)
{
	int j=i;
	int count=i+3;
	int grt=0;
	while(j<count)
	{
		if(grt<arr[j])
		{
		grt=arr[j];	
		}
		j++;
		
	}
	//j=0;
	System.out.print(grt);
}
}}//3345556
// {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}, K = 4 Output: 10 10 10 15 15 90 90

//{1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3  Output: 3 3 4 5 5 5 6