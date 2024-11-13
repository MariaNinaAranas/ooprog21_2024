import java.util.Scanner;

public class SpoonerismGenerator {

    
    public static String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    
    public static int vowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return i;
            }
        }
        return -1; // No vowel found
    }

    
    public static int run() {
        
        String word1 = getWord("Enter the first word: ");
        String word2 = getWord("Enter the second word: ");
        
        
        int index1 = vowelIndex(word1);
        int index2 = vowelIndex(word2);

        
        if (index1 <= 0 || index2 <= 0) {
            
            System.out.println("The words are not suitable for a Spoonerism (either they start with a vowel or lack vowels).");
            return 0;
        }
        
        
        String consonants1 = word1.substring(0, index1);
        String consonants2 = word2.substring(0, index2);
        String restOfWord1 = word1.substring(index1);
        String restOfWord2 = word2.substring(index2);

        
        String spoonerizedWord1 = consonants2 + restOfWord1;
        String spoonerizedWord2 = consonants1 + restOfWord2;

        
        System.out.println("Original words: " + word1 + " and " + word2);
        System.out.println("Spoonerized words: " + spoonerizedWord1 + " and " + spoonerizedWord2);

        return 0;
    }

    
    public static void main(String[] args) {
        run();
    }
}
