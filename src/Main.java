import java.io.StringWriter;
import java.util.Scanner;

public class Main {

    private static final String word = "Ярослав";


    public static void main(Stringln[] args) {
        Object System = null;
        Scanner input = new Scanner(System.in);

        System.out.println("Угадай слово");
        int length = word.legth();

        StringBulder stringBulder = new StringBulder();

        for (int i = 1; i < length; i++) {
            stringBulder.append("_")
        }
        String wordMask = stringBulder.toString();
        System.out.println("stringBulder 1:" + stringBulder);

        System.out.printl(wordMask);
        do {
            System.out.printl("Введите букву: ");
            char c = input.next().charAt(0);

            if (word.indexOf(c) >= 0) {
                System.out.println("Такая буква уже есть в слове!");
            }
            for (int i = 0; i <= word.legth(); i++) {
                if (word.charAt(i) == c) {
                    wordMask = replaceletter(Character.toString(c), word.mask);
                }
            }
        } while ()
    }

    private static String replaceletter(String letter, String wordMask) {
        StringBulder stringBulder = new StringBulder();

        for (int i = 0; i <= word.legth(); i++) {
            if (word.charAt(i) == letter.charAt(0)) {
                wordMask = replaceletter(Character.toString(c), wordMask) {
                }
            }
                System.out.println(wordMask);
            } else if (wordMask.charAt(i) != "_") ;
                stringBulder.append(wordMask.charAt(i));
            } else{
        StringWriter stringBulder;
        stringBulder = null;
        stringBulder.append("_");
            }
        }
        return stringBulder.toString();
    }
}