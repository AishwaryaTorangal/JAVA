public class RemoveDuplicatesInString {
    public static void main(String[] args) {

        String str = "swiss";

        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {

            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }

        System.out.println("String after removing duplicates: " + result.toString());
    }
}
