import java.util.Arrays;

public class StringAnagrams {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        // Convert to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}

// how do you check whether two strings are anagrams of each other?

/*
 * Two strings are anagrams if they contain same characters with same
 * frequencies.
 * Example: "listen" and "silent" are anagrams.
 * To check this:
 * 1. Convert both strings to character arrays.
 * 2. Sort both arrays.
 * 3. Compare if they are equal.
 * This works because sorting brings same characters together. If the sorted
 * arrays are same, original strings must have same characters and same counts.
 */
