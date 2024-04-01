import java.util.Scanner;
public class Octal_Decimal{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);		
		int on=input.nextInt();
		int base=8,power=0,dec=0,last;
		while(on>0){
			last=on%10;
			dec+=last*(Math.pow(base,power));
			on=on/10;
			power++;
			}
		System.out.println(dec);
}
}