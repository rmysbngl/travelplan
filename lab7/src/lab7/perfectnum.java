package lab7;

import java.util.Scanner;

public class perfectnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int N;
		N=input.nextInt();
		for(int i=1; i<=N; i++){
			int sum=0;
			for(int a=1; a<i; a++ )
			{
				if (i%a==0){
					sum=sum+a;
				}
			}	if(sum==i){
				System.out.print("  " +sum);
			}
			}

	}

}
