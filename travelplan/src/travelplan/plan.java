package travelplan;

import java.util.Scanner;
//değişiklik yapıldı

public class plan {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		// TODO Auto-generated method stub
		String city;
		int bud;
		   city=input.nextLine();
		   
		   String[] array =city.split(" ");
		   int n= array.length - 1;
			int[][] budget = new int [n][n];
			for(int t=0; t<n; t++){
				for(int k=0; k<n; k++){
				budget[t][k]=input.nextInt();
			}
			
				}
			bud=input.nextInt();
			
			for(int t=0; t<n; t++){
				for(int k=0; k<n; k++){
					
				System.out.print(budget[t][k]);
			}
			System.out.println(); 
				}
			for(int t=0; t<n; t++){
				System.out.print(array[t]);	
			}
			System.out.println();
			System.out.println(bud);
			}
		
		

	}

	


