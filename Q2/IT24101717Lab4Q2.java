import java.util.Scanner;
public class IT24101717Lab4Q2{
	public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();

        System.out.print("Enter lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();

      
        if (examMarks < 0 || examMarks > 100 || labMarks < 0 || labMarks > 100) {
            System.out.println("Error: Marks should be between 0 and 100.");
            return;
        }

        
        System.out.print("Enter the percentage of final mark from exam: ");
        double examPercentage = scanner.nextDouble();

        System.out.print("Enter the percentage of final mark from lab submission: ");
        double labPercentage = scanner.nextDouble();

        
        if (examPercentage + labPercentage != 100) {
            System.out.println("Error: The percentages should be equal to 100.");
            return;
        }

       
        double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

       
        System.out.printf("The final mark is: ", finalMark);

        
    }
}