// how do you find the missing number in an array containing numbers from 1 to n
public class MissingNumInArr {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5 };

        int n = 5;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number: " + missingNumber);
    }
}