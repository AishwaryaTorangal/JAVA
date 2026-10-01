// how do you move all the zeroes to the end of an array while maintaing the
// relative order of non-zero elements?
public class MoveZeroToEnd {

    public static void main(String[] args) {

        int[] arr = { 0, 1, 0, 3, 12 };

        int index = 0;

        // Put all non-zero elements at the beginning
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with zero
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        // Print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}