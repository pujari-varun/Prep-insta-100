import java.util.Scanner;
public class positivenegative{
	public static void main(String[] args){
		int x;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number");
		x=input.nextInt();
		if(x>0){
			System.out.println("positive");
		}
		else{
			System.out.println("negative");
		}
	}
}

