package lab7;

import java.util.Scanner;

public class secondpower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int N;
		N=input.nextInt();
		int sum=0;
	while(N != 0) {
		int k;
		k =N%10;
		int ust=1;
	
		for (int i=1; i<=k; i++){
			ust=2*ust;
		}
		sum = sum+ ust;
		N= (N-k)/10;
	}
	System.out.println(sum);
	}

}
