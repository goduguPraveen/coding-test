package avanthi;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int temp,rem,result=0;
		temp=n;

		while(n!=0)
		{
		rem=n%10;//3 5 1
		result=result+(rem*rem*rem);//27 27+125=152 152+1=153 
		n=n/10;//15 1
		}
		if(result==temp)
		{
		System.out.println(result +"is a armstrong number");
		}
		else
		{
		System.out.println(result +" is not armstrong number");
		}
		}
		

	}


