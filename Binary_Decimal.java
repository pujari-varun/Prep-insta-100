import java.util.Scanner;
public class Binary_Decimal{
	public static void main(String[] arg){
		Scanner input=new Scanner(System.in);
		System.out.println("enter binary");		
		int n=input.nextInt();
		int dec=0,last;
		int power=0;
		
		while(n>0){
			last=n%10;
			
			dec+=last*(Math.pow(2,power));
			
			n=n/10;
			power++;
		}
		System.out.println(dec);
	
}
}

		

		