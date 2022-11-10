package hhhh;

import java.time.LocalDateTime;

public class rec {
	
	static int n1=0,n2=1,n3=0;
	enum Level{
		LOW,MEDIUM,HIGH
	}
	static void fib (int count){
		if(count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			fib(count-1);
			
		}
	}

	public static void main(String[] args) {
		int count=10;
		LocalDateTime time= LocalDateTime.now();
		System.out.print(n1+" "+n2);
		fib(count-2);
		System.out.println("");
		System.out.println(time);
		Level l=Level.MEDIUM;
		System.out.println(l);
		

	}

}