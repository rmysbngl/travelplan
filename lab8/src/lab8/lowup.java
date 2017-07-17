package lab8;

import java.util.Scanner;

public class lowup {
	public static void main(String[] args){
		  Scanner input = new Scanner(System.in);     

		    char ch;
          System.out.println("write word");
		    ch = input.next().charAt(0);
		    while(ch!='!'){
		        if(isLower(ch)){
		            System.out.printf("%c",toUpper(ch));
		        }
		        if(isUpper(ch)){
		            System.out.printf("%c",toLower(ch));
		        }

		       if(ch==' '){
		            System.out.printf(" ");
		        }
		        ch = input.next().charAt(0);
		    }
		}
	public static boolean isLower(char ch){
		int k;
		k= ch;
		if(k >= 97 && k<=122){
			return true;
			
		}else {
			return false;
		}
	}
	public static char toUpper (char ch){
		int k;
		k= ch;
		return (char) ((k - 'a') + 'A');
	}
public static boolean isUpper (char ch){
	
	if(ch >= 65 && ch<=90){
		return true;
		
	}else{
		return false;
	}
}
public static char toLower(char ch){
	int k;
	k= ch;
	return (char) ((k - 'A') + 'a');
	
}}
