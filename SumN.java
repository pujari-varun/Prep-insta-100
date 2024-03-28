import java.util.Scanner;
public class SumN{ 

public static void main(String[] args){
Scanner input=new Scanner(System.in);

int n=input.nextInt();
System.out.println(sum(n));
//ystem.out.println((n*(n+1))/2);
}
static int sum(int n){
	if(n==0)return n;

	return n+sum(n-1);
}


}

