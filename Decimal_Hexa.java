import java.util.Scanner;
public class Decimal_Hexa{ 
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("enter the decimal number");
		int n=input.nextInt();
		String hex="";
		int rem;
		while(n>0){
			rem=n%16;
			if(rem>9 && rem<16){
				hex=(char)('A'+rem-10)+hex;
			}
			else if(rem<10){
				hex=rem+hex;
			}
			n=n/16;
		}
		System.out.println(hex);
	}
}
