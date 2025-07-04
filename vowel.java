import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a list of words separated by space: ");
        String input = in.nextLine();

        String[] words = input.split(" ");
        String wordWithMostVowels = "";
        int maxVowelCount = 0;

        for (String word : words) {
            int vowelCount = 0;

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vowelCount++;
                }
            }

            if (vowelCount > maxVowelCount) {
                maxVowelCount = vowelCount;
                wordWithMostVowels = word;
            }
        }

        System.out.println("Word with the most vowels: " + wordWithMostVowels);
    }
}
