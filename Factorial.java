import java.util.Scanner;

 public class Factorial{
  public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    
    System.out.print("Enter a number:");
    int num=scanner.nextInt();
   
    int Factorial=1;
    for(int i=1; i <=num; i++){
    
    Factorial*=i;
   }
    System.out.println("The fact of"+num+"is"+Factorial);
 }
}  