import java.io.*;
import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        System.out.println("Laboratory Activity 1.5\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Input file name (INPUT): ");
        String inputFileName = sc.nextLine();

        File inputFile = new File(inputFileName);

        try {
            Scanner reader = new Scanner(inputFile).useDelimiter("\r\n");

            System.out.print("Input file name (OUTPUT): ");
            String outputFileName = sc.nextLine();

            try {
                FileWriter fw = new FileWriter(outputFileName);
                
                while (reader.hasNext()){
                    String[] words = reader.next().split("\s");
                    for (String word : words){
                        char[] letters = word.toCharArray();
                        for (int i = letters.length - 1; i >= 0; i--){
                            fw.write(letters[i]);
                        }
                        fw.write(" ");
                    }
                    if (reader.hasNext())
                        fw.write("\n");
                }

                fw.close();
            } catch (IOException e){
                e.printStackTrace();
            }

            reader.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        sc.close();
    }
}
