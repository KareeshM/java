import java.util.Scanner;

class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        scanner.close(); 

        
        if (num1 > num2) {
            System.out.println(num1 + " is the biggest number.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the biggest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
