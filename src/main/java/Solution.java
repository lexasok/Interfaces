import java.util.Scanner;

interface AdvencedArithmetic {
    int divisorSum(int n);
}

class Calculator implements AdvencedArithmetic {

    public int divisorSum(int n) {
//        int result = n;
//        int i = n;
//        while (i-- > 1) {
//            if (n % i == 0) {
//                result += i;
//            }
//        }
//
//        return result;
        return 0;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        AdvencedArithmetic myCalc = new Calculator();
        int sum = myCalc.divisorSum(n);
        System.out.println("I implemented: " + myCalc.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}
