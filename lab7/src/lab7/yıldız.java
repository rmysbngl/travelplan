package lab7;

import java.util.Scanner;

public class yıldız {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int N;
		N=input.nextInt();
		for( int i=N; i>=1; i--){
			for (int d=1; d<=N-i; d++ ){
				System.out.print(" ");}
			for (int a=1 ; a<=2*i-1; a++ ){
				System.out.print("*");
			}
			
			System.out.println();
			
			
				
			
		}
          for (int s=1; s<= N; s++){
        	  for (int g=1; g<=N-s; g++ ){
    				System.out.print(" ");
    			}
        	  for (int t=1; t<= 2*s-1; t++){
        		  System.out.print("*");
        	  }System.out.println();
        	 
          }
	}

}
