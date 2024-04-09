import java.util.Scanner;
public class Decimal_Octal{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int mul=1,octal=0,rem;
		while(n>0){
			rem=n%8;
			octal+=rem*mul;
			n=n/8;
			mul*=10;
		}
		System.out.println(octal);
	}
}
		