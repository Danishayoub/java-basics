public class SumOfOddNumbers {
    public static int sumOfOddNumbers(int n) {
        int total = 0;
        for (int i = 1; i <= n; i += 2) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        int n = 100; 
        int result = sumOfOddNumbers(n);
        System.out.println("The sum of odd numbers from 1 to " + n + " is: " + result);
    }
}
