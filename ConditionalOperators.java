import java.util.Scanner;
 class ConditionalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        
        System.out.println("\n----- Conditional Operators Output -----");
        System.out.println("a == b  : " + (a == b));  // Equal to
        System.out.println("a != b  : " + (a != b));  // Not equal to
        System.out.println("a > b   : " + (a > b));   // Greater than
        System.out.println("a < b   : " + (a < b));   // Less than
        System.out.println("a >= b  : " + (a >= b));  // Greater than or equal to
        System.out.println("a <= b  : " + (a <= b));  // Less than or equal to

        scanner.close();
    }
}
