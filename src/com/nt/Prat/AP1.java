package com.nt.Prat;

import java.util.ArrayList;
import java.util.Collections;
public class AP1 {
	public static void main(String[] args) {
		int arr[] = { 1,2,2,2,3,4,5,4,7,6,5,12 };
		int k_Val=70;
		int sum = 0;
		int count = 0;
		int count1 = arr.length;
		int res=0;
		for(int i: arr)
		{res=res+i;}
		if(res>=k_Val)
		{
		for (int i = 0; i < arr.length; i++) {
			for (int i1 = i; i1 <= arr.length - 1; i1++) {
				sum = sum + arr[i1];
				if (sum <= k_Val) {
					count = count + 1;
				}

				else if (sum >= k_Val) {
					count = count + 1;
					break;
				}
			}
			if (count < count1 && (sum >= k_Val)) {
				count1 = count;}
			count = 0;
			sum = 0;
		}
		System.out.println("The count1 final val is..." + count1);}
		else
		{
			System.out.print(-1);
		}}}