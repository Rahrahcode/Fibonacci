	import java.util.Random;
	import java.util.*;
	import java.util.Scanner;

	public class Fibonacci
	{
		
	public static int fibonacciiter(int n) { //iterative method
		if(n<=1)
		{
		return 1;
			}
		int r=0, p=1, pp=1, x;
			
			
		for(x=2;x<=n;x++){
		r = p + pp;
		pp =p;
		p =r;
		}

		return r;
					}	
		
		
	public static int fibonaccirecur(int n) { //recursive method


	if(n<=1)
	{
	return 1;
	}
	else {
	return fibonaccirecur(n-1) + fibonaccirecur(n-2);
		}
	}




	public static void main(String[] args) {


	int n,y=20,fib1,fib2;
	System.out.print("|.......................................................|\n");	
	System.out.print("|	n\t Iterative\t	   Recursive	|\n");
	System.out.print("|.......................................................|\n");

	int diff1,diff2;	
	long starttime,endtime;
	
	
	for(n=1;n<=y;n++){
	starttime = System.nanoTime(); 
	fib1 = fibonacciiter(n); 

	endtime = System.nanoTime(); 
	diff1 = (int)(endtime - starttime); 

	starttime = System.nanoTime(); 
	fib2 = fibonaccirecur(n); 

	endtime = System.nanoTime(); 
	diff2 = (int)(endtime - starttime); 

	System.out.print("|	"+n+"\t\t"+diff1+"\t\t\t"+diff2 +"	|"+"\t\n"); 
			}
	System.out.print("|.......................................................|\n");
		}
	}