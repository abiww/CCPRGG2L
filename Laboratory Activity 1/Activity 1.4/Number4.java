import java.io.*;
import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) throws IOException {
        System.out.println("Laboratory Activity 1.4\n");

        Scanner userInput = new Scanner(System.in);
        String inputFileName;

        System.out.print("Enter the file name: ");
        inputFileName = userInput.nextLine().trim();
        File input = new File (inputFileName);

        BufferedReader br = new BufferedReader(new FileReader (input));

        String words;
        int wCount = 0;

        try{
            while ((words = br.readLine()) != null) {
                String[] lineCount = words.split(" ");
                wCount += lineCount.length;

                System.out.println(words);

            } System.out.println("Total count of words in given file: " + wCount);
            
            File file = new File(inputFileName);
            FileWriter fw = new FileWriter(file, true);

            fw.write("\nTotal count of words in given file: " + wCount);
            fw.flush();
            fw.close();

        } catch(Exception e) {
            System.out.println("An error has occurred: " + e.getMessage());
        } finally {
            br.close();
            userInput.close();
        } 
    }
}
