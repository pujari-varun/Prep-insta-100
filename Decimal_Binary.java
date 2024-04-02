import java.util.Scanner;
public class Decimal_Binary{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("enter the decimal number:");
		int n=input.nextInt();
		for (int i = 31; i >= 0; i--) { 
            		int k = n >> i; 
            		if ((k & 1) > 0) 
                		System.out.print("1"); 
            		else
                		System.out.print("0"); 
		}
	}        
} 