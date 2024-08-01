package Revision;
class ReverseString {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String reversedString = reverseStringInPlace(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseStringInPlace(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move indices towards the center
            left++;
            right--;
        }

        return new String(charArray);
    }
}
