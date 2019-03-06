package travelplan;

import java.util.Scanner;

public class denem2 {
    //değiş please

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
	//meraba rüm 
		
	//so much fuuuun
		String city;
		
	   city=input.nextLine();
	   String[] array =city.split(" ");
	   int n= array.length - 1;
		int[][] budget = new int [n][n];
		for(int t=0; t<n; t++){
			for(int k=0; k<n; k++){
			budget[t][k]=input.nextInt();
		}
		
			}
        //aldın mı
		//I changed it ha ha ha
		for(int t=0; t<n; t++){
			for(int k=0; k<n; k++){
				
			System.out.print(budget[t][k]);
		}
		System.out.println(); 
			}
		for(int t=0; t<n; t++){
			System.out.print(array[t]);	
		}
		}
	
			

}
	


