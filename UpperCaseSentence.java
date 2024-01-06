import java.util.Scanner;

public class UpperCaseSentence {
    public static void main(String[] Args){
        String Sentence;
        Scanner sc = new Scanner(System.in);

        //User input
        System.out.println("Input Multiple Sentences Separated by Periods.");
        System.out.println("E.g. Cats are perfect. Dogs are smelly. This was not written by a cat.");
        System.out.print("Your answer: ");
        Sentence = sc.nextLine();

        //Initialize substring length
        String[] substrings = new String[Sentence.split("\\. ").length];

        //copies sentence (now turned into an array of strings with the split method) into substrings[]
        System.arraycopy(Sentence.split("\\. "), 0, substrings, 0, Sentence.split("\\. ").length);

        System.out.println("\nPick A sub-sentence to uppercase.");
        for(int i = 0; i < substrings.length; i++)
            System.out.println(i + " - " + substrings[i]);

        System.out.print("Your choice: ");
        int choice = sc.nextInt();

        //Uppercases the chosen substring
        if(choice != Sentence.split("\\. ").length - 1)
            System.out.println(".");
    }
}
