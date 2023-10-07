package com.jts;

public class ArmStrongNumbers {

	public static void main(String[] args) {
		int n= 155;
		int temp = n;
		int r,sum=0;
		
		while(n>0) {
			r= n%10;
		    n=n/10;
		    sum=sum+r*r*r;
			}
		if(temp==sum) {
	       System.out.println("Is Arm Strong Number:"+sum);
		}
		else {
			System.out.println("Is not Arm Strong Number");
			
		}

	}

}
