import java.util.Scanner;
public class Hcf{
  public static void main(String[] args){
    int x,y;
    Scanner input=new Scanner(System.in);
    System.out.println("enter the numbers");
    x=input.nextInt();
    y=input.nextInt();
    int h=1;
    for(int i=1;i<=x && i<=y;i++){
      if(x%i==0 && y%i==0){
        h=i;
      }
    }
    System.out.println("HCF:"+h);
    }
}
