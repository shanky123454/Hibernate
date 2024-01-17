package com.demo;
import java.util.Arrays;
import java.util.Scanner;

public class duplicate_array {
	public static void duplicate(int[] a, int size)
	{
		 int[] b = new int[size];
	        b=a.clone();
	        int visited=-1;
	        int i;
	        for( i=0; i<size;i++)
	        {
	             int count=1;
	            for(int j =i+1; j<size-1;j++)
	            {
	                if(b[i]== b[j])
	                {
	                    b[j]=visited;
	                }
	            }
	        }
	        System.out.println("array after removing duplicates is:");
	        for(int j=0;j<size;j++)
	        {
	        	if(b[j]!=visited)
	            {
	               System.out.println(b[j]);
	            }
	        }
	}
	
	public static void main(String[] args) {
			System.out.println("enter the size of the array");
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        int[] a= new int[num];
	      System.out.println("enter the elemnts of the array ");
	      for(int i=0 ; i<num; i++)
	      {
	          a[i] = sc.nextInt();
	      }
	      int size = a.length;
	      System.out.println("elemnts of the array is ");
	      for (int i=0; i<size ; i++) {
	          System.out.println(a[i]);
	      }
	      System.out.println("no. of elemnts present in array is:" + size);
	      Arrays.sort(a);
	      System.out.println(" array after sorted");
	      for(int i=0; i<size;i++)
	      {
	    	  System.out.println(a[i]);
	      }
	      duplicate(a,size);

	}

}
