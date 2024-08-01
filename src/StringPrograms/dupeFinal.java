package StringPrograms;

public class dupeFinal {
    public static void main(String[] args) {
        char str[] = "geeksforgeeks".toCharArray();
        char []result1=new char[str.length];
        int n = str.length;

        // Used as index in the modified string
        int index = 0;

        // Traverse through all characters
        for (int i = 0; i < n; i++) {
            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }

            // If not present, then add it to result.
            if (j == i) {
                result1[index++] = str[i];
            }
        }

        // Convert the result to a string and print it
        //String result = String.valueOf(Arrays.copyOf(str, index));
        for (int i = 0; i < index; i++) {
            System.out.print(result1[i]);
        }
    }
}

