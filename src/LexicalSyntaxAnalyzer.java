import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LexicalSyntaxAnalyzer {
    static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Enter the name of file: ");
        String filename = scanner.nextLine().trim();
        System.out.println("\n");
        String tester = "/Users/jeffreynedley/Documents/" + filename;
        test(tester);
    }

    public static void test(String file){
        try {
            Recursion.readData(file);

        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

}
