import java.util.Scanner;

public class WordCountInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().trim(); // Trim to remove leading and trailing spaces

        
        if (input.isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
           
            String[] words = input.split("\\s+"); 
            System.out.println("Number of words: " + words.length);
        }

        scanner.close();
    }
}
