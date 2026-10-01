public class FirstNonRepeated {
    public static void main(String[] args) {

        String str = "swiss";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeated character: " + ch);
                break;
            }
        }
    }
}
// how do you find the first non-repeated character in a string ?
/***
 * import java.util.HashMap;
 * 
 * public class FirstNonRepeated {
 * public static void main(String[] args) {
 * 
 * String str = "swiss";
 * 
 * HashMap<Character, Integer> map = new HashMap<>();
 * 
 * // Count characters
 * for (char ch : str.toCharArray()) {
 * map.put(ch, map.getOrDefault(ch, 0) + 1);
 * }
 * 
 * // Find first character with count 1
 * for (char ch : str.toCharArray()) {
 * if (map.get(ch) == 1) {
 * System.out.println("First non-repeated character: " + ch);
 * break;
 * }
 * }
 * }
 * }
 ***/
