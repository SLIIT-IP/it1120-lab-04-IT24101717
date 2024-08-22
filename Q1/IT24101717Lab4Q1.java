import java.util.Scanner;

public class IT24101717Lab4Q1 {
    public static void main(String[] args) {
    double no;    
    Scanner input = new Scanner(System.in);
       

      System.out.println("Enter the number : ");
      no= input.nextDouble();
      
      if (no > 0) {
        System.out.println("The number is Positive");
      } else if(no<0) {
        System.out.println("The number is Negative");
      }else  {
        System.out.println("The number is Zero");
      }

}

}