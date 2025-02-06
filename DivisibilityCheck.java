import java.util.Scanner;

class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        
        if (num % 3 == 0 && num % 4 == 0) {
            System.out.println("Good Morning");
        } else if (num % 4 == 0) {
            System.out.println("Good Afternoon");
        } else if (num % 3 == 0) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }

        scanner.close(); 
    }
}
