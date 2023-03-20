import java.util.Scanner;

public class method {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your word?");
        String word = input.nextLine();

        System.out.println("Do you want to know the amount of vowels(1) or consonants(2)?");
        String selection = input.nextLine();

        if (selection.equalsIgnoreCase("1")) {
            System.out.println(vowelCounter(word));

        } else if (selection.equalsIgnoreCase("2")) {
            System.out.println(consCounter(word));

        } else {
            System.out.println("Invalid Input");
        }

    }

    public static int vowelCounter(String word) {

        int vowelCounter = 0;

        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {

                vowelCounter++;
            }
        }
        return vowelCounter;

    }

    public static int consCounter(String word) {

        int consCounter = 0;

        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
                    c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {

                consCounter++;
            }
        }
        return consCounter;
    }

}
