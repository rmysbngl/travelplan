package lab8;

import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
 int a=0;
System.out.println("write num");
a=input.nextInt();
System.out.println( fibo(a));

	}
 public static int fibo (int n){
	 
	 if(n==0){
		 return 0;
		 
	 } if(n==1){
		 return 1;
	 }else {
		 return fibo(n-1) + fibo ( n-2);
	 }
 }
}
