import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        StringBuilder reversedWord = new StringBuilder();
        int length = word.length();
        while (length > 0) {
            reversedWord.append(word.charAt(length - 1));
            length--;
        }
        System.out.println("Reversed word: " + reversedWord.toString());
        scanner.close();
    }
}
