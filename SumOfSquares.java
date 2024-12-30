import java.util.Scanner;


class SumOfSquares{
   public long calculateSumOfSquares(int n) {
               if (n < 0) {
            return -1;
        }
        long sum = 0;
         for (int i = 1; i <= n; i++) {
                        sum += i * i;
        }
        return sum;
    
   }
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the number: ");
    int n = scanner.nextInt();
    SumOfSquares sumOfSquares = new SumOfSquares();
    long total = sumOfSquares.calculateSumOfSquares(n);
    System.out.println("Sum of squares up to " + n + ": " + total);
   }
}