import java.util.Scanner;

class CountEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number (N): ");
        int N = scanner.nextInt();

        int count = 0;
        int i = 1; 

        
        while (i <= N) {
            if (i % 2 == 0) { 
                count++; 
            }
            i++; 
        }

        
        System.out.println("There are " + count + " even numbers between 1 and " + N);

        scanner.close();
    }
}
