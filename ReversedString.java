import java.util.Scanner;

public class ReversedString {
   public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter a string:");
     String input=scanner.nextLine();

     String Reversed=" ";
     for(int i=input.length()-1;i>=0;i--){

        Reversed+=input.charAt (i);
     }
     System.out.println("Reversed String:"+ Reversed);
   }
 }


      